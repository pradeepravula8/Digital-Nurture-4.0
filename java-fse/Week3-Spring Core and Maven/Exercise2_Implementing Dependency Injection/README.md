# 📚 Library Management System (Spring Framework with XML Configuration)

This is a simple Java application using the Spring Framework that demonstrates Dependency Injection through XML-based configuration. It simulates backend behavior for managing books in a library.

---

## 📌 Overview

This project showcases how to build a Spring application using Maven and classic XML bean definitions.

### 🧩 Components:

- BookService: Business/service logic
- BookRepository: Simulated data persistence
- applicationContext.xml: Bean wiring using Spring’s XML configuration
- Maven: For dependency and project build management

---

## 🎯 Learning Objectives

- Understand Inversion of Control (IoC) & Dependency Injection (DI)
- Define and connect beans via `applicationContext.xml`
- Organize a standard Maven-based Java project
- Execute Spring applications using the Maven `exec` plugin

---

## 🧰 Technologies Used

| Tool/Technology    | Purpose                         |
| ------------------ | ------------------------------- |
| Java 8+            | Programming Language            |
| Spring Framework   | Dependency Injection (DI)       |
| Maven              | Project & Dependency Management |
| VS Code / IntelliJ | Development IDE                 |

---

## 🗂 Project Structure

library/
├── pom.xml # Maven configuration
└── src/
├── main/
│ ├── java/
│ │ └── com/
│ │ └── example/
│ │ └── library/
│ │ ├── BookRepository.java
│ │ ├── BookService.java
│ │ └── LibraryManagementApplication.java
│ └── resources/
│ └── applicationContext.xml # Spring configuration file
└── test/
└── java/
└── (optional for tests)


---

## ⚙️ How to Run

### ✅ Prerequisites

- Java 8 or later
- Maven installed (`mvn -v` to verify)
- Any IDE (IntelliJ / VS Code) or terminal

---

### ✅ Build the Project

Navigate to the root project folder (`library`) and run:

```bash
mvn clean install


