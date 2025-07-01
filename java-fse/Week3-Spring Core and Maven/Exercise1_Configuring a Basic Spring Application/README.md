# Library Management System (Spring Framework with XML Configuration)

This is a basic Spring Framework application that demonstrates Dependency Injection using XML configuration. The application simulates a simple backend for a Library Management System.

---

## 📆 Overview

This project is part of an exercise to learn how to set up a Spring-based Java application using Maven and XML configuration. It includes the following components:

* BookService: Handles service-layer logic
* BookRepository: Handles data persistence logic (simulated)
* Spring XML Configuration: Connects beans using `applicationContext.xml`
* Maven: For dependency management and build lifecycle

---

## 🎓 Learning Objectives

* Understand Spring's Inversion of Control (IoC) and Dependency Injection (DI)
* Configure beans using `applicationContext.xml`
* Structure a Maven-based Java project
* Run a Spring application using the `exec-maven-plugin`

---

## 📊 Technologies Used

| Tool/Technology    | Purpose                         |
| ------------------ | ------------------------------- |
| Java 8+            | Programming Language            |
| Spring Framework   | Dependency Injection (DI)       |
| Maven              | Project & Dependency Management |
| VS Code / IntelliJ | Development IDE                 |

---

## 📁 Project Structure

```
LibraryManagement/
├── pom.xml                            # Maven configuration
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/library/
    │   │       ├── App.java           # Main class to run the app
    │   │       ├── service/
    │   │       │   └── BookService.java
    │   │       └── repository/
    │   │           └── BookRepository.java
    │   └── resources/
    │       └── applicationContext.xml # Spring bean configuration
    └── test/
        └── java/
            └── com/library/
                └── AppTest.java       # (Optional) Unit test class
````


## 🚀 How to Run the Project

### ✅ Prerequisites

* Java 8 or later installed
* Maven installed and configured
* IDE like VS Code or IntelliJ

### ✅ Steps

1. Clone the Project (or download ZIP)

2. Build the Project:

```bash
mvn clean install
```

3. Run the Application:

```bash
mvn exec:java
```

> Make sure your `pom.xml` includes the `exec-maven-plugin` with `com.library.App` as the `mainClass`.

### ✅ Expected Output

```
📦 Main method started
Adding book: Spring in Action
Book 'Spring in Action' saved to the database.
```

## 🎓 Summary

This project demonstrates a basic Spring setup using XML configuration and is ideal for beginners to:

* Understand Spring Core
* Set up and manage dependencies with Maven
* Learn how Spring manages object creation (beans)
* Build and run Java apps from the terminal

