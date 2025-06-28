✅ Setting up JUnit
This project demonstrates how to use **JUnit 4** to write unit tests for a simple calculator class with basic arithmetic operations.



## 📁 Project Structure

demo/
├── pom.xml
└── src/
├── main/
│ └── java/
│ └── junit/
│ └── Calculator.java
└── test/
└── java/
└── junit/
└── CalculatorTest.java


---

## 🛠️ Technologies Used

- Java 8+
- Maven
- JUnit 4.13.2
- Hamcrest 1.3



##  Description

- Calculator.java: Class with methods `add(int a, int b)` and `multiply(int a, int b)`.
- CalculatorTest.java: JUnit 4 test class that tests the behavior of the Calculator class using assertions.



##  Test Logic

The test cases:

- Create an instance of `Calculator`
- Test `add(2, 3)` returns `5`
- Test `multiply(2, 3)` returns `6`
- Use `assertEquals` to compare actual and expected results



##  How to Run

### Compile and test:
```bash
mvn clean test


