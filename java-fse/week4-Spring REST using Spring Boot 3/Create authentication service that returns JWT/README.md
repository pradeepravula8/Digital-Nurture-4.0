# 🔐 Spring Boot JWT Authentication

This project demonstrates how to build a secure JWT-based authentication system using Spring Boot and Spring Security. It features user login, JWT token generation, and token validation to protect REST APIs.

---

## 📆 Overview

This exercise helps you understand:

- Spring Security fundamentals
- Manual user authentication using `AuthenticationManager`
- JWT token creation, signing, and validation
- Securing REST endpoints using filters
- Stateless session management using tokens
- In-memory user management for testing

---

## 🎯 Learning Objectives

- Authenticate users via `/api/auth/login` and generate JWT
- Validate incoming requests using custom JWT filter
- Secure protected endpoints using `SecurityFilterChain`
- Load users from in-memory or custom service
- Understand stateless authentication flow using Bearer tokens

---

## 🧰 Technologies Used

| Tool/Technology            | Purpose                              |
|----------------------------|--------------------------------------|
| Java 17 / 22               | Programming Language                 |
| Spring Boot 3.2+           | Framework Base                       |
| Spring Security            | Authentication and Authorization    |
| jjwt (io.jsonwebtoken)     | JWT Token Generation & Validation    |
| Maven                      | Dependency Management & Build       |
| SLF4J                      | Logging                              |
| Postman / curl             | API Testing                          |

---

## 📁 Project Structure

jwt/
├── pom.xml
└── src/
├── main/
│ ├── java/
│ │ └── com/
│ │ └── example/
│ │ └── springlearn/
│ │ ├── config/
│ │ │ └── SecurityConfig.java
│ │ │ └── JwtAuthenticationFilter.java
│ │ ├── controller/
│ │ │ └── AuthenticationController.java
│ │ ├── model/
│ │ │ └── AuthRequest.java
│ │ └── util/
│ │ └── JwtUtil.java
│ └── resources/
│ └── application.properties
└── test/
└── java/ (optional)


---

## ⚙️ How to Run

### ✅ Prerequisites

- Java 17+ or later (JDK 22 supported)
- Maven installed (`mvn -v`)
- IDE (VS Code / IntelliJ) or terminal

---

### ▶️ Steps

#### 1. **Clone and Navigate**
```bash
git clone <your-repo-url>
cd jwt

###  Run the App:
mvn spring-boot:run
