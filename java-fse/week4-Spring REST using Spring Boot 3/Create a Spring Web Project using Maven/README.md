# 📚 Spring Learn — Getting Started with Spring Boot

This is a simple Spring Boot application that demonstrates how to set up and run a basic Java backend service using Spring Boot annotations and Maven. The project is ideal for learning about application bootstrapping, logging, and Spring's auto-configuration capabilities.

---

## 📆 Overview

This project is part of an exercise to understand how to:

- Build and run a Spring Boot application
- Use dependency injection and component scanning
- Log application startup and shutdown
- Structure a Spring Boot project with Maven

---

## 🎯 Learning Objectives

- Understand the basics of Spring Boot
- Learn how Spring Boot handles auto-configuration
- Use annotations like `@SpringBootApplication`
- Use SLF4J logging with Spring Boot
- Organize Java packages and structure for clarity

---

## 🧰 Technologies Used

| Tool/Technology       | Purpose                         |
|-----------------------|---------------------------------|
| Java 22               | Programming Language            |
| Spring Boot 3.2.5     | Application Framework           |
| Maven                 | Build & Dependency Management   |
| SLF4J                 | Logging                         |
| VS Code / IntelliJ    | IDE                             |

---

## 📁 Project Structure

spring-learn/
├── pom.xml # Maven config
└── src/
├── main/
│ ├── java/
│ │ └── com/
│ │ └── cognizant/
│ │ └── springlearn/
│ │ └── SpringLearnApplication.java # Main class
│ └── resources/
│ └── application.properties # Spring config
└── test/
└── java/ # (Optional) Test folder



---

## ⚙️ How to Run

### ✅ Prerequisites

- Java 22 installed and configured
- Maven installed and added to PATH
- IDE (like VS Code or IntelliJ)

### ✅ Run Steps

1. Navigate to Project Directory:

   ```bash
   cd spring-learn
2. Run the Spring Boot App
mvn spring-boot:run
