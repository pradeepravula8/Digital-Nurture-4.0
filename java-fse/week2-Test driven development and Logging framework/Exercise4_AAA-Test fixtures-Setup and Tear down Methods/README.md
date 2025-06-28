## ✅ JUnit Test Fixtures with AAA Pattern Example  

This project demonstrates how to structure unit tests using JUnit 4 test fixtures (`@Before` and `@After`) and the AAA (Arrange-Act-Assert) testing pattern. It includes a simple `Calculator` class with addition and subtraction methods.


## 📁 Project Structure

act-assertion/
├── pom.xml
└── src/
├── main/
│ └── java/
│ └── arrange/
│ └── Calculator.java
└── test/
└── java/
└── arrange/
└── CalculatorTest.java




## 🛠️ Technologies Used

- Java 17
- Maven
- JUnit 4.13.2



## 📄 Description

- Calculator.java: A basic utility class providing `add(int a, int b)` and `subtract(int a, int b)` methods.
- CalculatorTest: A JUnit 4 test class using `@Before` and `@After` to set up and tear down the test environment for each test case, following the AAA pattern.



##  Test Logic

Each test follows the **AAA pattern**:

| Step     | Description                                         |
|----------|-----------------------------------------------------|
| Arrange  | Initialize input values and the `Calculator` object |
| Act      | Call the method under test                          |
| Assert   | Verify the result using `assertEquals()`            |

Test fixtures:
- `@Before`: Initializes the `Calculator` before each test (`setUp()`)
- `@After`: Cleans up after each test (`tearDown()`)

---

## ▶️ How to Run

### Compile and test the project:
```bash
mvn clean test


