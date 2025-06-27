# Java Logging Example with SLF4J and Logback

This is a simple Java project demonstrating how to log error and warning messages using SLF4J with the Logback implementation.


## 📁 Project Structure

logging/
├── pom.xml
└── src/
└── main/
└── java/
└── com/
└── example/
└── LoggingExample.java



##  Technologies Used

- **Java 8**
- **Maven**
- **SLF4J (Simple Logging Facade for Java)**
- **Logback (SLF4J backend)**


##  Dependencies (in `pom.xml`)

```xml
<dependency>
  <groupId>org.slf4j</groupId>
  <artifactId>slf4j-api</artifactId>
  <version>1.7.30</version>
</dependency>

<dependency>
  <groupId>ch.qos.logback</groupId>
  <artifactId>logback-classic</artifactId>
  <version>1.2.3</version>
</dependency>

## How to Run
mvn clean compile exec:java




