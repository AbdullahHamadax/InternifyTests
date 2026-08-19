# Internify UI Test Automation

UI test automation project for [Internify](https://internify-one.vercel.app/), built with Java, Selenium WebDriver, TestNG, and Maven.

## Test Coverage

The current suite covers these homepage flows:

- Homepage loading
- How It Works section navigation
- About page navigation
- Login page navigation
- Verify page navigation
- Theme toggle behavior

## Tech Stack

- Java 21
- Selenium WebDriver 4
- TestNG 7
- Maven
- Page Object Model

## Project Structure

```text
src/test/java/com/internify/
|-- base/
|   `-- BaseTest.java
|-- pages/
|   |-- BasePage.java
|   |-- HomePage.java
|   |-- AboutPage.java
|   |-- LoginPage.java
|   `-- VerifyPage.java
`-- tests/
    `-- HomePageTest.java
```

`BaseTest` manages browser and page-object setup. `BasePage` provides reusable element interactions, explicit waits, scrolling, and URL checks. Page classes contain locators and page behavior, while test classes contain assertions and test flows.

## Prerequisites

- Java 21 or later
- Maven 3.9 or later
- Google Chrome

Selenium Manager resolves the compatible ChromeDriver automatically when the tests start.

## Run the Tests

Run the complete suite from the project root:

```shell
mvn test
```

Run only the homepage tests:

```shell
mvn -Dtest=HomePageTest test
```

Run a single test method:

```shell
mvn -Dtest=HomePageTest#testVerifyPageOpens test
```
