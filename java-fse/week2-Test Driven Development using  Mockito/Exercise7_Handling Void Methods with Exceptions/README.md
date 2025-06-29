# Exceptions - Mockito Void Method Exception Handling

This project demonstrates how to test a void method that throws an exception using Mockito and JUnit in a Maven-based Java application.



## 📁 Project Structure

exceptions/
├── pom.xml
├── src/
│ ├── main/
│ │ └── java/
│ │ └── com/
│ │ └── example/
│ │ ├── Notifier.java
│ │ └── AlertManager.java
│ └── test/
│ └── java/
│ └── com/
│ └── example/
│ └── AlertManagerTest.java



## 📌 Objective

To **test a void method that throws an exception**, we:

1. Create a mock object using Mockito.
2. Stub the void method to throw a RuntimeException.
3. Invoke the method to simulate the exception.
4. Verify the method was called with the expected argument.



## ⚙️ Technologies Used

- Java 8+ (can also run on JDK 17 or 22)
- Maven
- JUnit 4.13.2
- Mockito 4.8.0
- VS Code or any Java IDE


## How to Run 

mvn clean test




