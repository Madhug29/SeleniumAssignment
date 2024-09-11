# Selenium Test Automation

This project contains Selenium test scripts for automating Successful Login,Unsuccessful Login and Signup functionalities for the "Germany Is Calling" website.
The scripts are written in Selenium with Java using the TestNG framework.

---

## Test Execution Steps

### Prerequisites/Project Setup:
1. **Java Development Kit (JDK)**
2. **Maven**: Maven used for dependency management.
3. **Chrome WebDriver**: ChromeDriver for  test setup.
4. **IDE**: Eclipse for writing and executing the tests.
5. **TestNG Plugin**: TestNG plugin for Test Report and Test Execution.

----

##Test Files:
SuccessfulLoginTest.java: Contains test cases for successful  login attempts.
UnsuccessfulLoginTest.java:Contains test cases for unsuccessful  login attempts.
Signup.java: Automates the signup flow.

---
##TestNg.xml
This is XML for Testing the succesful and unsuccessful Login using TestNG.

This is index.html - file:///Users/apple/Documents/Eclipse/AutTesting/Assignment/test-output/index.html

----
#Assumptions:
The valid credentials for login (mg1231@gmail.com and Mg1231@2901) are assumed to exist in the application's user database.
I have used credentials for Unsuccessfullogin (madhugautam@gmail.com and Madhu123) as it doesn't exits in user database.
The error message for unsuccessful login is consistent and static: "Please enter a correct username and password. Note that both fields may be case-sensitive."
The web page structure (HTML tags, IDs, classes, and element text) remains unchanged during test execution.

#CONTACT FOR MORE-
Feel free to contact me on gautamadhu29@gmail.com for more queries.
