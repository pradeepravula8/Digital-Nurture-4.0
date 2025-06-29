# Mockito Void Method Handling (JUnit 4)

This project demonstrates how to test void methods using Mockito in Java with JUnit 4.


## ✅ Objective

To verify the behavior of a method that performs an action but does not return anything (i.e., `void`).  
We use `Mockito` to:

- Create a mock object
- Stub the void method using `doNothing()` (or `doThrow()` for exception testing)
- Verify that the method was called with expected arguments


## 🧪 Scenario

We have a `LoggerService` with a void method `log(String msg)`.

We want to test that when a user places an order via `OrderService`, the `log()` method is called with a message containing the order ID.



## 🛠️ Technologies Used

- Java 8
- Maven
- JUnit 4.13.2
- Mockito 4.11.0


## 📁 Project Structure

void/
├── pom.xml
├── README.md
└── src/
├── main/
│ └── java/
│ └── com/example/
│ ├── LoggerService.java
│ └── OrderService.java
└── test/
└── java/
└── com/example/
└── OrderServiceTest.java

## ✅ How to Run

mvn clean test

