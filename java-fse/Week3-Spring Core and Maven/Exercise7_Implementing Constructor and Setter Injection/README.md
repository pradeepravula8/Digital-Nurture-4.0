# 📚 Library Management System - Spring IoC with Constructor & Setter Injection

This is a simple Spring-based Java application demonstrating Dependency Injection using **both Constructor and Setter Injection via XML configuration. It simulates a basic backend for a Library Management System, designed to enhance understanding of Spring IoC container and bean wiring.

---

## 📆 Exercise Overview

This project fulfills the objectives , which focuses on:

- 🔧 Configuring Constructor and Setter injection in Spring
- 📦 Organizing service and repository layers
- 🧩 Defining beans in `applicationContext.xml`
- ▶️ Running and testing dependency injection through a main runner class

---

## 🛠 Technologies Used

| Technology         | Description                           |
|--------------------|----------------------------------------|
| Java 8+            | Programming language                   |
| Spring Core & Context | For IoC container & bean wiring     |
| Maven              | Project management and dependencies    |
| XML                | Bean configuration format              |
| IntelliJ / VS Code | IDEs for development                   |

---

## 📁 Project Structure


book/
├── pom.xml
└── src/
└── main/
├── java/
│ └── com/example/library/
│ ├── Book.java # Entity class
│ ├── BookRepository.java # Repository layer
│ ├── BookService.java # Service layer with DI
│ └── LibraryManagementApplication.java # Main runner
└── resources/
└── applicationContext.xml 


---

## 🔧 Components

| Component                      | Description                                           |
|--------------------------------|-------------------------------------------------------|
| `Book`                         | Represents a simple book object                       |
| `BookRepository`               | Simulates saving book details                         |
| `BookService`                  | Injected with `BookRepository` via Constructor & Setter |
| `LibraryManagementApplication` | Loads Spring context and initiates logic              |
| `applicationContext.xml`       | Defines beans and DI configuration                    |

---

## 🧩 Dependency Injection Configuration

- Constructor Injection is used to inject `BookRepository` when creating `BookService`
- Setter Injection is also configured for the same dependency to demonstrate flexibility
- Both are declared in `applicationContext.xml`

```xml
<bean id="bookService" class="com.example.library.BookService">
    <constructor-arg ref="bookRepository"/>
    <property name="bookRepository" ref="bookRepository"/>
</bean>

---

🚀 How to Run the Project

mvn clean install

✅ Run the Application

mvn exec:java




