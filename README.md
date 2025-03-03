# 🛒eCommerce Test Automation Framework

## 📝 Overview
This is a **Selenium Cucumber-based Test Automation Framework** designed to validate the core functionalities of an **eCommerce web application**. The framework follows a structured **Page Object Model (POM)** and **Behavior-Driven Development (BDD) with Cucumber**, ensuring modularity, maintainability, and readability of test scripts.

### ➠ Goals of this Framework
✅ Automate critical user workflows such as **User Registration, Login, Account Management, and Checkout**.  
✅ Ensure test scripts are **scalable** and can be easily extended for additional test cases.  
✅ Provide **better readability and collaboration** through **Cucumber feature files**, making test cases understandable even for non-technical stakeholders.  
✅ Facilitate **parallel execution** and **cross-browser testing** using Selenium Grid (future scope).  
✅ Generate **detailed test reports** (Extent Reports - planned) for better analysis of test execution results.

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

## 🔜 Next Steps
🔹 Automating **Add to Cart & Checkout Flow**  
🔹 Implementing **Reporting Mechanism** 
🔹 Enhancing **Test Data Management**  
🔹 Adding **Cross-browser & Parallel Execution Support**

---