# ✅ Mockito Service Unit Test Example

This project demonstrates how to use Mockito to mock an external API and unit test a service class using JUnit 5.


## Project Structure:

mockito/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── service/
│   │           ├── ExternalApi.java
│   │           └── MyService.java
│   └── test/
│       └── java/
│           └── service/
│               └── MyServiceTest.java
├── pom.xml



##  Technologies Used

- Java 8+
- Maven
- JUnit 5
- Mockito



##  Description

- `ExternalApi`: Interface that simulates an external dependency.
- `MyService`: Class that depends on `ExternalApi` and fetches data.
- `MyServiceTest`: Unit test that mocks `ExternalApi` using Mockito to test `MyService` in isolation.


##  Test Logic

The test case:
1. Creates a mock of `ExternalApi`
2. Stubs `getData()` to return `"Mock Data"`
3. Asserts that `MyService.fetchData()` returns the mocked value


## How to Run

```bash
Compile and test
mvn clean test




