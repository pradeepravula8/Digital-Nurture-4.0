# ticketbookingapp

A React application that simulates a basic flight ticket booking system with conditional rendering based on user authentication status.

---


## 📌 Description

This application allows:

- **Guest Users** to browse flight details.
- **Logged-in Users** to book tickets.
- **Login/Logout** functionality that switches between views dynamically.

---

## ✈️ Features

### 🧑 Guest View
- Displays a **Guest Page** with **flight details**.
- No option to book tickets.
- Shows a **Login** button.

### ✅ Logged-In User View
- Shows a **User Page** with ticket **booking option**.
- Displays **Logout** button.
- User can navigate back to Guest View by logging out.

---

## 🧠 Hint for Implementation

- Use `useState` for tracking **login status**.
- Conditionally render:
  - GuestPage when user is **not logged in**
  - UserPage when user **is logged in**
- Toggle between **Login** and **Logout** buttons based on authentication state.

---

## 📁 Project Structure

ticketbookingapp/
│
├── public/
├── src/
│ ├── components/
│ │ ├── GuestPage.js
│ │ ├── UserPage.js
│ │ └── FlightDetails.js
│ ├── App.js
│ └── index.js
├── package.json
└── README.md

### Run the Application

npm start

