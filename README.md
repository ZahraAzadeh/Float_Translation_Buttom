Absolutely Zahra! Here's a well-crafted `README.md` text for your **Float_Translation_Button** Kotlin app. It highlights your app's purpose, features, setup instructions, and credits—perfect for GitHub presentation.

---

## 📄 `README.md` for *Float_Translation_Button* App

```markdown
# 🌍 Float_Translation_Button

**Float_Translation_Button** is a Kotlin-based Android app that displays a floating translation button on the screen. It automatically translates a welcome message based on the device's language settings using a free online translation API.

---

## ✨ Features

- 🗣️ Auto-detects device language
- 🌐 Translates "Welcome" using Google Translate API (unofficial)
- 📦 Lightweight and Compose-based UI
- 🎯 Floating action button for manual refresh
- 🔧 Easy to customize for other phrases or APIs

---

## 📸 Screenshots

*(Add screenshots here if available)*

---

## 🚀 Getting Started

### Prerequisites

- Android Studio Hedgehog or newer
- Kotlin 1.9+
- Gradle 8.0+
- Internet connection (for translation API)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/Float_Translation_Button.git
   ```

2. Open the project in Android Studio.

3. Sync Gradle and run the app on an emulator or device.

---

## 🧠 How It Works

- The app uses `Locale.getDefault().language` to detect the device language.
- It sends a request to:
  ```
  https://translate.googleapis.com/translate_a/single?client=gtx&sl=en&tl={deviceLang}&dt=t&q=Welcome
  ```
- The translated message is displayed in the center of the screen.
- A floating button allows users to refresh the translation manually.

---

## 🛠 Tech Stack

- Kotlin
- Jetpack Compose
- OkHttp (for network requests)
- Google Translate API (unofficial)

---

## 📂 Project Structure

```
Float_Translation_Button/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/plottranslation/
│   │   │   │   └── MainActivity.kt
│   │   │   ├── res/
│   │   │   │   └── layout, values, etc.
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

---

## 🙋‍♀️ Author

Created with ❤️ by [Zahra](https://github.com/ZahraAzadeh)  
Award-winning author, poet, and Kotlin developer.

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```

---
