# 📚 Spring Learn — Load Country Bean using Spring Core (XML Configuration)

This project demonstrates a basic Spring Core application using XML-based configuration. The goal is to load a `Country` object from a Spring XML file and display it using SLF4J logging.

---

## 📆 Overview

This exercise helps you understand:

- Spring container and `ApplicationContext`
- Loading beans using XML configuration (`country.xml`)
- Dependency injection via `<property>` tags
- Logging using SLF4J
- Maven project setup with a runnable `main()` class

---

## 🎯 Learning Objectives

- Use `ClassPathXmlApplicationContext` to load configuration
- Define and inject Spring beans using XML
- Understand Spring Core's IOC container behavior
- Enable and use `DEBUG` logging via SLF4J
- Set up and run a Maven-based Spring Core project

---

## 🧰 Technologies Used

| Tool/Technology       | Purpose                         |
|-----------------------|---------------------------------|
| Java 8                | Programming Language            |
| Spring Core 4.3.30    | Dependency Injection Framework  |
| Maven                 | Build & Dependency Management   |
| SLF4J + SimpleLogger  | Logging                         |
| VS Code / IntelliJ    | IDE                             |

---

## 📁 Project Structure

spring-learn/
├── pom.xml
└── src/
├── main/
│ ├── java/
│ │ └── com/
│ │ └── cognizant/
│ │ └── springlearn/
│ │ ├── Country.java
│ │ └── SpringLearnApplication.java
│ └── resources/
│ ├── country.xml
│ └── simplelogger.properties
└── test/
└── java/ (optional)


⚙️ How to Run

✅ Prerequisites
Java 8+ installed

Maven installed and configured in PATH

IDE like VS Code or IntelliJ (optional)

Compile the Project:

mvn clean compile

Run the application:

mvn exec:java



