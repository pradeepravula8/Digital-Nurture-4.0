# 📚 Library Management System - Spring IoC with XML Configuration 

This is a simple Spring Framework project that demonstrates how to use Inversion of Control (IoC) and Dependency Injection (DI) via XML configuration. It simulates a basic backend setup for a Library Management System with a service and repository layer.

---

## 📆 Overview

This project is part of an exercise to learn how to:

- Configure the Spring IoC container using XML  
- Define beans and inject dependencies  
- Organize a basic service-repository structure  
- Run a Spring application using Maven  

---

## 📊 Technologies Used

| Technology         | Purpose                         |
|--------------------|----------------------------------|
| Java 8+            | Core language                   |
| Spring Context     | IoC and Bean Management         |
| Maven              | Build & Dependency Management   |
| XML                | Spring Bean Configuration       |
| IntelliJ / VS Code | IDE for development             |

---

## 📁 Project Structure

ioc/
├── pom.xml
└── src/
└── main/
├── java/
│ └── com/example/library/
│ ├── BookRepository.java # Repository layer
│ ├── BookService.java # Service layer
│ └── LibraryMain.java # Main runner class
└── resources/
└── applicationContext.xml # XML configuration



---

## 🔧 Component Overview

| Class               | Description                                            |
|---------------------|--------------------------------------------------------|
| `BookRepository`    | Simulates saving a book to a database                 |
| `BookService`       | Injects `BookRepository` and handles business logic   |
| `LibraryMain`       | Loads Spring context and tests the flow               |
| `applicationContext.xml` | XML file defining and wiring beans              |

---

## 🔌 Dependency Injection Style

- Setter-based injection is used in `BookService`
- Beans are defined and injected via `applicationContext.xml`

---

🚀 How to Run the Project
✅ Prerequisites

Java 8+
Maven
IDE like IntelliJ or VS Code

✅ Build the Project

mvn clean install

✅ Run the Main Class

mvn exec:java


