import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONArray

fun translateText(text: String, targetLang: String): String {
    val client = OkHttpClient()
    val url = "https://translate.googleapis.com/translate_a/single?client=gtx&sl=en&tl=$targetLang&dt=t&q=$text"
    val request = Request.Builder().url(url).build()

    return try {
        val response = client.newCall(request).execute()
        val body = response.body?.string()
        val translated = JSONArray(body)[0].let { it as JSONArray }.getJSONArray(0).getString(0)
        translated
    } catch (e: Exception) {
        "Translation failed"
    }
}
