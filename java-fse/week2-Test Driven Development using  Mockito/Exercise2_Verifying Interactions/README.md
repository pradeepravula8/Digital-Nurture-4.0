# Verifying Method Interactions with Mockito

This project demonstrates how to use Mockito in a JUnit 5 test to verify that a method is called with specific interactions. It is a Maven-based Java project and showcases behavior verification in unit tests.



##  Project Structure

verifyinginteractions/
├── pom.xml
├── src/
│ ├── main/
│ │ └── java/
│ │ └── com/
│ │ └── example/
│ │ ├── ExternalApi.java
│ │ └── MyService.java
│ └── test/
│ └── java/
│ └── com/
│ └── example/
│ └── MyServiceTest.java



##  Scenario

### Goal:
Ensure a method is called with specific arguments or conditions during execution.

### Steps:
1. Create a mock object
2. Call the method under test
3. Verify that the dependent method was invoked



## How to Run 

mvn clean test


