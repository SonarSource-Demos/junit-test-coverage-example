# junit-test-coverage-example

This repo is designed to demonstrate how SonarQube calculates our Test Coverage % metric. 

SonarQube uses lines of code covered **AND** logical branches covered in our final percentage.

To view jacoco unit test coverage:
1. Run the command `mvn test`
2. Open the file at `./target/site/jacoco/sonarsource.sonarsource_demos/index.html`
3. Navigate to the file `CoverageMetrics.java`
4. Compare the Jacoco Test Coverage % to the SonarQube Test Coverage %