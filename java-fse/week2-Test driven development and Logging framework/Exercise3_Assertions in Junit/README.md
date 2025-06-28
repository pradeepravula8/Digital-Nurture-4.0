## ✅ JUnit Assertions Example  

This project demonstrates the use of JUnit 4 assertion methods to validate expressions, object states, and expected results in unit testing.



## 📁 Project Structure

assertion/
├── pom.xml
└── src/
└── test/
└── java/
└── assertions/
└── AssertionsTest.java




##  Technologies Used

- Java 8+
- Maven
- JUnit 4.13.2



## Description

- AssertionsTest: A JUnit test class showcasing core assertion methods like `assertEquals`, `assertTrue`, `assertFalse`, `assertNull`, and `assertNotNull`.

These assertions help ensure that the logic in your program behaves as expected under different conditions.



## Test Logic

The test method `testAssertions()` includes:

| Assertion Method     | Purpose                               |
|----------------------|----------------------------------------|
| `assertEquals`       | Verifies two values are equal          |
| `assertTrue`         | Verifies a boolean expression is true  |
| `assertFalse`        | Verifies a boolean expression is false |
| `assertNull`         | Asserts that an object is `null`       |
| `assertNotNull`      | Asserts that an object is **not** `null` |



##  How to Run

### Compile and Test:
```bash
mvn clean test
