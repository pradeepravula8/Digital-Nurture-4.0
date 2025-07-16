# 🏦 Bank Microservices — Account & Loan Services with Spring Boot

This project demonstrates how to build independent Spring Boot microservices for a banking system — specifically for Account Service and Loan Service. and follows Maven-based project structure.

---

## 📆 Overview

This hands-on project helps you understand how to:

- Build and run multiple Spring Boot microservices
- Structure microservices as independent Maven projects
- Assign different ports to each microservice
- Return dummy data via REST APIs

---

## 🎯 Learning Objectives

- Understand microservice architecture basics
- Learn how to separate services by responsibility (Account vs Loan)
- Use REST controllers to expose APIs
- Configure different ports using `application.properties`

---

## 🧰 Technologies Used

| Tool/Technology       | Purpose                         |
|-----------------------|---------------------------------|
| Java 17+              | Programming Language            |
| Spring Boot 3.2.5     | Application Framework           |
| Maven                 | Build & Dependency Management   |
| RestTemplate          | REST communication              |
| VS Code / IntelliJ    | IDE                             |

---

## 📁 Project Structure

microservices/
├── employee_id_1818/ # Account Microservice
│ ├── pom.xml
│ └── src/
│ └── main/
│ ├── java/
│ │ └── com/cognizant/account/
│ │ └── AccountController.java
│ │ └── AccountServiceApplication.java
│ └── resources/
│ └── application.properties (server.port=8080)
│
├── loan_services/ # Loan Microservice
│ ├── pom.xml
│ └── src/
│ └── main/
│ ├── java/
│ │ └── com/cognizant/loan/
│ │ └── LoanController.java
│ │ └── LoanServiceApplication.java
│ └── resources/
│ └── application.properties (server.port=8081)

# ✅ Run Instructions for Bank Microservices (Account & Loan)

# ⚙️ Prerequisites:
# - Java 17 or higher installed
# - Maven installed and added to system PATH
# - VS Code or IntelliJ installed

# 🚀 Step 1: Start Account Microservice (Port: 8080)
cd D:/<your-folder-path>/microservices/employee_id_1818
mvn spring-boot:run

# 🚀 Step 2: Start Loan Microservice (Port: 8081)
# Open a new terminal before running this
cd D:/<your-folder-path>/microservices/loan_services
mvn spring-boot:run

# 🌐 Test URLs:
# Account Service: http://localhost:8080/accounts/00987987973432
# Loan Service:    http://localhost:8081/loans/H00987987972342


