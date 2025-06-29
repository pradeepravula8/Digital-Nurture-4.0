# Verifying Interaction Order with Mockito (Exercise 6)

This project demonstrates how to verify that method calls on a mock object occur in a specific order, using **Mockito** and JUnit 4 in a Maven project.



## ✅ Objective

To ensure that a series of method calls are made in a specific sequence using `InOrder` verification from Mockito.



## 🛠️ Technologies Used

- Java 8
- Maven
- JUnit 4.13.2
- Mockito 4.11.0



## 📁 Project Structure

intreactionorder/
├── pom.xml
└── src/
├── main/
│ └── java/
│ └── com/example/
│ ├── TaskService.java
│ └── Workflow.java
└── test/
└── java/
└── com/example/
└── WorkflowTest.java

## ✅ How to Run Tests

mvn clean test

