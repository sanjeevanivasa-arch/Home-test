![demo](https://github.com/user-attachments/assets/84f14b1b-18fd-4e16-b0c7-133a2e00c229)

# Twitch Web Automation Testing

This project automates a user scenario on the Twitch website using Selenium WebDriver, Java, TestNG, and Maven. The automation searches for StarCraft II streams, scrolls through the results, opens a stream, and captures a screenshot.

Tech Stack
- Java (JDK 17)
- Selenium WebDriver
- TestNG
- Maven
- ChromeDriver
- VS Code
- Page Object Model (POM)

Prerequisites

Install the following tools before running the project:

JDK 17  
https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

Maven  
https://maven.apache.org/download.cgi

ChromeDriver  
https://chromedriver.chromium.org/downloads

VS Code  
https://code.visualstudio.com/

Verify installation using:

java -version
mvn -version

Project Structure

Twitch-Automation
│
├── src
│   ├── main/java/com/automation
│   │   ├── base
│   │   ├── pages
│   │   └── utils
│   │
│   └── test/java/com/automation/tests
│
├── screenshots
│
├── pom.xml
├── testng.xml
└── README.md

Setup Instructions

Clone the repository

git clone https://github.com/sanjeevanivasa-arch/Home-test.git

Navigate to the project folder

cd Home-test

Install dependencies

mvn clean install

Running the Tests

Run the automation tests using Maven

mvn test

The automation will:

- Launch Chrome browser
- Open Twitch website
- Search for StarCraft II
- Navigate to the game page
- Scroll through streams
- Open a stream
- Capture a screenshot

Test Scenario

1. Open Twitch website
2. Click on the search icon
3. Search for StarCraft II
4. Select the game from search results
5. Scroll through streams
6. Open a stream
7. Capture screenshot

Test Cases

TC01 - Verify Twitch homepage loads  
Validation: Homepage loads successfully

TC02 - Verify search functionality  
Validation: Game search results appear

TC03 - Verify game selection  
Validation: Correct game page opens

TC04 - Verify scrolling functionality  
Validation: Streams load dynamically while scrolling

TC05 - Verify screenshot capture  
Validation: Screenshot saved in screenshots folder

Validation Strategy

The automation validates the following:

- Correct page navigation
- Search results visibility
- Game page opens correctly
- Dynamic loading of streams during scrolling
- Screenshot capture for verification

Screenshots

Screenshots generated during test execution are stored in the screenshots folder.

Example file:

screenshots/streamer_page.png

Test Execution Command

mvn test

Author

Sanjeevanivasa

Notes

This project follows the Page Object Model (POM) design pattern to improve maintainability and scalability of the automation framework.
