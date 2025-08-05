# bloggerapp

A simple React application that demonstrates **multiple types of conditional rendering** using 3 different components:

- 📘 Book Details  
- ✍️ Blog Details  
- 🎓 Course Details

---

## 📌 Description

The `bloggerapp` React application is built to practice and showcase different **conditional rendering techniques** in React using functional components and React hooks.

---

## 📦 Components

### 1️⃣ BookDetails

Displays information related to a selected book.

### 2️⃣ BlogDetails

Shows blog-related content when the blog option is selected.

### 3️⃣ CourseDetails

Displays course information when selected by the user.

---

## 🤔 Conditional Rendering Techniques Used

This app demonstrates **multiple ways** to render components conditionally:

- ✅ Using `if-else` statements
- ✅ Using `ternary ( ? : )` operators
- ✅ Using `&&` (logical AND) operators
- ✅ Using conditional functions
- ✅ Using enum/state-based conditional rendering

---

## 🧠 Hint for Implementation

- Use a single state variable (e.g., `selectedComponent`) to track which component should be rendered.
- Update this state based on button clicks.
- Conditionally render the chosen component in different ways (ternary, if-else, logical &&, etc.)

---

## 📁 Project Structure

bloggerapp/
│
├── public/
├── src/
│ ├── components/
│ │ ├── BookDetails.js
│ │ ├── BlogDetails.js
│ │ └── CourseDetails.js
│ ├── App.js
│ └── index.js
├── package.json
└── README.md

### Run the app

npm start
