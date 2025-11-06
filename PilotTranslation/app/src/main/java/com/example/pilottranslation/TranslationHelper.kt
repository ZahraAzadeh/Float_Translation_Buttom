package com.example.plottranslation

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject

suspend fun translateText(
    text: String,
    targetLang: String,
    sourceLang: String = "en"
): String = withContext(Dispatchers.IO) {
    try {
        val url = "https://translate.argosopentech.com/translate"
        val jsonBody = """
            {
                "q": "$text",
                "source": "$sourceLang",
                "target": "$targetLang",
                "format": "text"
            }
        """.trimIndent()

        val client = OkHttpClient()
        val requestBody = jsonBody.toRequestBody("application/json".toMediaType())
        val request = Request.Builder()
            .url(url)
            .post(requestBody)
            .build()

        client.newCall(request).execute().use { response ->
            val responseBody = response.body?.string()
            if (response.isSuccessful && !responseBody.isNullOrEmpty()) {
                val jsonObject = JSONObject(responseBody)
                return@withContext jsonObject.getString("translatedText")
            } else {
                return@withContext "Welcome"
            }
        }
    } catch (e: Exception) {
        e.printStackTrace()
        return@withContext "Welcome"
    }
}
