# Library Management System (Spring Framework with XML Configuration)

This is a Spring Framework application that demonstrates Dependency Injection, AOP, and WebMVC using XML configuration. It simulates a layered backend architecture for a Library Management System.

---

## 📆 Overview

This project is part of an exercise to learn how to set up a Spring-based Java application using Maven and XML configuration. It includes the following components:

* LibraryController: Handles the request logic (simulated without web endpoints)  
* BookService: Handles service-layer logic  
* BookRepository: Simulates data persistence  
* LoggingAspect: Demonstrates AOP  
* Spring XML Configuration: Connects beans using `applicationContext.xml`  
* Maven: For dependency management and build lifecycle  

---

## 🎓 Learning Objectives

* Understand Spring's Inversion of Control (IoC) and Dependency Injection (DI)  
* Use AOP concepts (e.g., method logging)  
* Configure beans using `applicationContext.xml`  
* Structure a Maven-based Java project  
* Run a Spring application using the `exec-maven-plugin`  

---

## 📊 Technologies Used

| Tool/Technology    | Purpose                         |
| ------------------ | ------------------------------- |
| Java 8+            | Programming Language            |
| Spring Context     | Dependency Injection (DI)       |
| Spring AOP         | Logging & Cross-cutting Logic   |
| Spring WebMVC      | Web Layer Architecture          |
| Maven              | Project & Dependency Management |
| VS Code / IntelliJ | Development IDE                 |

---

## 📁 Project Structure


LibraryManagement/
├── pom.xml # Maven configuration
└── src/
├── main/
│ ├── java/
│ │ └── com/example/library/
│ │ ├── LibraryManagementApplication.java # Main class
│ │ ├── controller/
│ │ │ └── LibraryController.java
│ │ ├── service/
│ │ │ └── BookService.java
│ │ ├── repository/
│ │ │ └── BookRepository.java
│ |
│ └── resources/
│ └── applicationContext.xml # Spring bean configuration
└── test/
└── java/
└── com/example/library/



---

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



