# Project Title:  USD Exchange Rate API Test Framework

## Description

The purpose of this project is to create a comprehensive test suite for an API that provides USD rates against multiple currencies.

Key features of this test framework include:

- **API Response Validation**: Ensures successful API calls and checks for valid response structures and data, employing RestAssured for HTTP interactions.
- **Response Status Verification**: Incorporates checks for various API response statuses to ensure the API's robust error handling and success message conveyance.
- **Rate Validation**: Specifically tests the USD to AED rate, ensuring the values fall within the expected range, thus verifying the API's currency conversion accuracy.
- **Performance Checks**: Includes validations for the API's response time, ensuring the API's performance is within acceptable thresholds.
- **Data Integrity**: Validates the presence of essential response elements like timestamps and the correct count of currency pairs, ensuring comprehensive data delivery.
- **Schema Compliance**: Utilizes JSON schema validation to confirm the API's response adheres to the defined structure, ensuring consistency and reliability in the data provided.


## Setting Up the Project in IntelliJ IDEA

1. **Open IntelliJ IDEA**:
    - If you don't have IntelliJ IDEA installed, download and install it from the JetBrains website.
    - Launch IntelliJ IDEA.

2. **Open the Project**:
    - On the IntelliJ IDEA welcome screen, select "Open Project."
    - After selecting to open a project, navigate to the folder where this project is located and select it


3. **Run the Project**:
    - From the context menu, select "Run <TestRunner" to execute the tests.
    - Define the project name and location.
    - IntelliJ IDEA will execute the tests, and you will see the test results in the "Run" tool window.

4. **POM Configuration**:

This Maven `pom.xml` file is set up for a Java project that performs automated API testing using Serenity BDD with Cucumber and RestAssured. Below is an overview of the key configurations and dependencies:

**Project Identifiers**

- **Group ID**: `org.APItesting`
- **Artifact ID**: `currency-api-test`
- **Version**: `1.0-SNAPSHOT`

**Properties**

- Java source and target compatibility are set to version 21.
- UTF-8 encoding is specified for project building.
- Versions for Serenity, Cucumber, RestAssured, JUnit, and Maven plugins are managed via properties for easy updates.

**Dependencies**

- **Serenity BDD**: Included for behavior-driven development testing.
- **Serenity Cucumber**: Bridges Serenity BDD with Cucumber for BDD style test cases.
- **Serenity RestAssured**: Extends RestAssured with Serenity BDD reporting features.
- **RestAssured**: Provides capabilities for testing REST APIs.
- **JSON Schema Validator**: Used in conjunction with RestAssured for validating API responses against JSON schemas.
- **JUnit**: The testing framework for writing test cases.

**Build Configuration**

- The `maven-surefire-plugin` is configured to skip the default test phase.
- The `maven-failsafe-plugin` is set up to run integration tests, configured for parallel execution with unlimited threads.
- The `maven-compiler-plugin` sets the Java version for source and target compatibility.
- The `serenity-maven-plugin` is set up for post-integration test phase to generate aggregated Serenity reports.

