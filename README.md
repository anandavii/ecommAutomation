# eCommerce Test Automation Framework

## Overview
This is a Selenium Cucumber-based automation framework for testing an eCommerce web application. The framework follows a structured Page Object Model (POM) and Cucumber BDD approach for better maintainability and scalability.

## Tech Stack
- **Programming Language:** Java
- **Automation Tool:** Selenium WebDriver
- **Test Framework:** Cucumber BDD
- **Build Tool:** Maven
- **Reporting:** Extent Reports (Planned)

## Features Automated
### User Registration
- Navigate to the registration page
- Enter user details (first name, last name, email, password, etc.)
- Agree to terms and conditions
- Verify successful registration
- Logout

### User Login
- Navigate to the login page
- Enter valid credentials
- Verify successful login

### User Account Page
- Verify labels and links on the My Account page
- Ensure all expected sections (Orders, Affiliate Account, Newsletter, etc.) are present
- Logout

## How to Run the Tests
1. Clone the repository
   ```bash
   git clone https://github.com/yourgithubusername/eCommerce-Automation.git
   cd eCommerce-Automation
   ```

2. Install dependencies using Maven
    ```bash
    mvn clean install
    ```

3. Run the tests using Cucumber
    ```bash
    mvn test
    ```