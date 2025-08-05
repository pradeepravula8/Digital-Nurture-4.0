# eventexamplesapp

A React application to demonstrate various HTML form element event handlers such as `onClick`, synthetic events, passing arguments to functions, and multiple function execution on a single event. Additionally, this app includes a simple Currency Converter from Indian Rupees to Euro.

## 📦 Features

### 1. Counter with Increment & Decrement

- **Increment Button**:
  - Increases the counter value.
  - Invokes multiple methods:
    - Increments the value.
    - Displays a message: `Hello! This is a static message.`

- **Decrement Button**:
  - Decreases the counter value.

---

### 2. Welcome Button

- Button labeled **Say Welcome** that calls a function and passes a string argument `"welcome"` to it.
- Displays the passed message in the UI.

---

### 3. Synthetic Event Handling

- A button that listens to the synthetic event `onClick`.
- When clicked, it displays:  
  **"I was clicked"**

---

### 4. Currency Converter Component

- Converts **Indian Rupees (INR)** to **Euro (EUR)**.
- Takes user input in INR.
- On clicking **Convert**, it:
  - Calls `handleSubmit` method.
  - Converts INR to EUR (using a fixed exchange rate, e.g. 1 EUR = 90 INR).
  - Displays the result.

---

### 5.📁 Project Structure

currencyconverter/
│
├── public/
├── src/
│   ├── App.js
│   ├── components/
│   │   └── CurrencyConverter.js
│   └── index.js
├── package.json
└── README.md

#### 6.Run the App

npm start

