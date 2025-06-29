# Mocking and Stubbing with Multiple Returns (Mockito + JUnit 4)

This project demonstrates how to mock an external API and configure it to return different values on consecutive calls using Mockito in a Java Maven project.



## ✅ Objective

Simulate the behavior of an external API that returns different results when called multiple times.



## 🧪 Scenario

You want to test the `MonitoringService` class which depends on an external API `ExternalApiService`. The API returns a status string like `"OK"` or `"FAIL"`.

The `monitor()` method should return the first and second status received from the API.

-
## 🛠️ Technologies Used

- Java 8
- Maven
- JUnit 4.13.2
- Mockito 4.11.0



## 📁 Project Structure

multiplereturns/
├── pom.xml
├── README.md
└── src/
├── main/
│ └── java/
│ └── com/example/
│ ├── ExternalApiService.java
│ └── MonitoringService.java
└── test/
└── java/
└── com/example/
└── MonitoringServiceTest.java


## ✅ How to Run

mvn clean test

