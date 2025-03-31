# 🛒 eCommerce Test Automation Framework

## 📝 Overview
This is a **Selenium Cucumber-based Test Automation Framework** designed to validate the core functionalities of an **eCommerce web application**. The framework follows a structured **Page Object Model (POM)** and **Behavior-Driven Development (BDD) with Cucumber**, ensuring modularity, maintainability, and readability of test scripts.

### ➠ Goals of this Framework
✅ Automate critical user workflows such as **User Registration, Login, Account Management, and Checkout**.  
✅ Ensure test scripts are **scalable** and can be easily extended for additional test cases.  
✅ Provide **better readability and collaboration** through **Cucumber feature files**, making test cases understandable even for non-technical stakeholders.  
✅ Facilitate **parallel execution** and **cross-browser testing** using Selenium Grid (future scope).  
✅ Generate **detailed test reports** (Allure Reports) for better analysis of test execution results.

I have tried to structure this framework as a real-world industry-standard automation suite, making it a robust and scalable solution for automating eCommerce web applications efficiently.

---

## 💻 Tech Stack
- **Programming Language:** Java
- **Automation Tool:** Selenium WebDriver
- **Test Framework:** Cucumber BDD
- **Build Tool:** Maven
- **Reporting:** Allure Reports
- **IDE:** IntelliJ

---

## Features Automated

### **User Registration**
- Navigate to the registration page
- Enter user details (first name, last name, email, password, etc.)
- Agree to terms and conditions
- Verify successful registration
- Logout

### **User Login**
- Navigate to the login page
- Enter valid credentials
- Verify successful login

### **User Account Page**
- Verify labels and links on the My Account page
- Ensure all expected sections (**Orders, Affiliate Account, Newsletter, etc.**) are present
- Logout

---

## 🔗 How to Generate Allure Reports

Follow these steps to generate and view Allure reports after running your tests:

### Step 1: Run Tests and Generate Results
1. Execute your tests using Maven:

```
mvn clean test
```

2. After the test execution is complete, verify that the `target/allure-results` directory is created. This directory contains the raw data required to generate the Allure report.

---

### Step 2: Generate and View Allure Report
1. Use the following command to generate the Allure report:
```
allure generate target/allure-results --clean -o allure-report

```

- This command will create a detailed HTML report in the `allure-report` directory.

2. To view the report in your browser, use:

```
allure serve target/allure-results
```

- This will start a local server and open the Allure report in your default browser.

---

## 🔜 Next Steps
🔹 Automating **Add to Cart & Checkout Flow**  
🔹 Enhancing **Test Data Management**  
🔹 Adding **Cross-browser & Parallel Execution Support**

---

