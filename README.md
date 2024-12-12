# Currency Converter

A simple and efficient Currency Converter application built using Kotlin. This project provides real-time currency conversion capabilities with support for offline mode and expandable features.

---

## **Features**

### **Core Features**
- **Currency Conversion**:
  - Convert an amount from one currency to another using real-time exchange rates.
- **Real-Time Exchange Rates**:
  - Fetch the latest exchange rates from an online API.

### **Additional Features**
- **Offline Support**:
  - Save exchange rates locally to ensure functionality when offline.
- **User-Friendly Interface**:
  - Intuitive console-based UI for easy input and output.
- **Expandable Currency Support**:
  - Easily add more currencies as needed.

---

## **Planned Enhancements**

- **Graphical User Interface (GUI)**:
  - Develop a desktop or web-based interface using Kotlin/JS or JavaFX.
- **Concurrency**:
  - Implement Kotlin Coroutines to optimize API calls and user interactions.
- **Advanced Features**:
  - Historical exchange rates.
  - Currency trend graphs.

---

## **Getting Started**

### **Prerequisites**
- Kotlin 1.5+
- Gradle (Kotlin DSL)
- Internet access (for real-time exchange rates)

### **Installation**
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/currency-converter.git
   ```
2. Navigate to the project directory:
   ```bash
   cd currency-converter
   ```
3. Build the project:
   ```bash
   ./gradlew build
   ```
4. Run the application:
   ```bash
   ./gradlew run
   ```

---

## **Usage**

1. Launch the application.
2. Enter the amount you wish to convert.
3. Specify the source currency and the target currency using their codes (e.g., USD, EUR).
4. View the converted amount displayed in the console.

---

## **Technologies Used**

- **Kotlin**: Core programming language.
- **OkHttp**: For making HTTP requests to fetch exchange rates.
- **Gson**: For parsing JSON data from the API.

---
