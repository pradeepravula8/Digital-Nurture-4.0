# 📚 ORM Learn — Spring Data JPA

This is a simple Java application demonstrating how to integrate Spring Boot with Hibernate and MySQL using JPA. The project fetches data from a `country` table and logs it using a `testGetAllCountries()` method.

---

## 📌 Overview

This project showcases how to build a Spring Boot application with:

- JPA-based data persistence using Hibernate
- MySQL database connectivity
- Logging of SQL queries for learning purposes

---

## 🧩 Components

- `Country` Entity: Represents a row in the `country` table
- `CountryRepository`: Interface extending Spring Data JPA repository
- `OrmLearnApplication`: Main class with `testGetAllCountries()` logic
- `application.properties`: For DB and logging configuration

---

## 🎯 Learning Objectives

- Understand ORM concepts via Spring Data JPA
- Practice Spring Boot project structure and configuration
- Learn to execute and monitor Hibernate SQL logs
- Connect Java with MySQL using Spring Boot

---

## 🧰 Technologies Used

| Tool / Technology     | Purpose                             |
|------------------------|-------------------------------------|
| Java 17+               | Programming language                |
| Spring Boot 3.2.5      | Application framework               |
| Spring Data JPA        | ORM abstraction                     |
| Hibernate              | ORM provider                        |
| MySQL                  | Relational database                 |
| Maven                  | Project & dependency management     |
| IntelliJ / VS Code     | IDE for development                 |

---

## 🗂 Project Structure

orm-learn/
├── src/
│ └── main/
│ ├── java/com/cognizant/ormlearn/
│ │ ├── OrmLearnApplication.java
│ │ ├── model/Country.java
│ │ └── repository/CountryRepository.java
│ └── resources/
│ └── application.properties
├── pom.xml



---

## ⚙️ How to Run

### ✅ Prerequisites

- Java 17 or later installed
- MySQL running locally
- Maven installed (`mvn -v` to verify)
- vscode

---

### ✅ Setup MySQL

If you don’t know your MySQL root password, you can create a new user:

```sql
CREATE USER 'springuser'@'localhost' IDENTIFIED BY 'springpass';
GRANT ALL PRIVILEGES ON *.* TO 'springuser'@'localhost';
FLUSH PRIVILEGES;


