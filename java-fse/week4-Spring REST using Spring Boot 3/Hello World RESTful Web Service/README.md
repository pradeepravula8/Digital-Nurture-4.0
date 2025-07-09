# 📚 Spring Learn — Hello World Web Application (Spring MVC)

This is a basic Java web application using Spring Web MVC deployed via embedded Tomcat 7 using Maven. The project demonstrates how to build a simple RESTful service that returns the message `"Hello World!!"` at the `/hello` endpoint.

---

## 📆 Overview

This project is part of an exercise to understand:

- How DispatcherServlet maps requests
- Spring MVC annotations (`@Controller`, `@RequestMapping`)
- Logging with SLF4J
- WAR deployment using embedded Tomcat
- Running a web application using `mvn tomcat7:run`

---

## 🎯 Learning Objectives

- Build and run a Spring MVC application
- Understand Spring DispatcherServlet and context XML
- Return plain text responses from a controller
- Use SLF4J to log method execution
- Package WAR and deploy using Maven Tomcat plugin

---

## 🧰 Technologies Used

| Tool/Technology       | Purpose                         |
|-----------------------|---------------------------------|
| Java 1.8              | Programming Language            |
| Spring Web MVC 4.3.30 | MVC Framework                   |
| Maven                 | Build & Dependency Management   |
| Apache Tomcat 7       | Web Server                      |
| SLF4J + SimpleLogger  | Logging                         |
| VS Code / IntelliJ    | IDE                             |

---

## 📁 Project Structure


hello/
├── pom.xml # Maven build configuration
└── src/
└── main/
├── java/
│ └── com/
│ └── example/
│ └── springlearn/
│ └── controller/
│ └── HelloController.java
└── webapp/
├── WEB-INF/
│ ├── web.xml # DispatcherServlet config
│ └── dispatcher-servlet.xml # Spring beans and MVC config
└── index.jsp (optional)

⚙️ How to Run 
✅ Prerequisites
Java 1.8 installed and configured

Apache Maven installed and added to system PATH

IDE (VS Code / IntelliJ) for editing (optional)

✅ Steps to Run

# 1. Open terminal / command prompt

# 2. Navigate to your project directory
cd path/to/your/project/hello

# 3. Run the project using the embedded Tomcat 7 plugin
mvn clean tomcat7:run


✅ Access the Application
Open browser or Postman

URL: http://localhost:8080/hello

You should see:
Hello World!!



