# 🛒 eCommerce Test Automation Framework

## 📝 Overview

This is a **Selenium Cucumber-based Test Automation Framework** designed to validate the core functionalities of an **eCommerce web application**. The framework follows a structured **Page Object Model (POM)** and **Behavior-Driven Development (BDD) with Cucumber**, ensuring modularity, maintainability, and readability of test scripts.

### ➠ Goals of this Framework

✅ Automate critical user workflows such as **User Registration, Login, Account Management, and Checkout**. 
✅ Ensure test scripts are **scalable** and can be easily extended for additional test cases. 
✅ Provide **better readability and collaboration** through **Cucumber feature files**, making test cases understandable even for non-technical stakeholders. 
✅ Facilitate **remote execution**, **parallel execution**, and **cross-browser testing** using **Dockerized Selenium Grid**. 
✅ Generate **detailed test reports** using **Allure Reports** for better analysis of test execution results.

This framework is designed to simulate a real-world industry-standard automation suite, making it a robust and scalable solution for automating eCommerce applications efficiently.

---

<h2>💻 Tech Stack
<img src="https://cdn-icons-png.flaticon.com/512/226/226777.png" alt="Java" height="20"/>
<img src="https://www.selenium.dev/images/selenium_logo_square_green.png" alt="Selenium" height="20"/>
<img src="https://upload.wikimedia.org/wikipedia/commons/5/52/Apache_Maven_logo.svg" alt="Maven" height="20"/>
<img src="https://avatars.githubusercontent.com/u/5879127?s=200&v=4" alt="Allure" height="20"/>
<img src="https://www.docker.com/wp-content/uploads/2022/03/Moby-logo.png" alt="Docker" height="20"/>
<img src="https://resources.jetbrains.com/storage/products/intellij-idea/img/meta/intellij-idea_logo_300x300.png" alt="IntelliJ IDEA" height="20"/>
</h2>

* **Programming Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Test Framework:** Cucumber BDD
* **Build Tool:** Maven
* **Reporting:** Allure Reports
* **Containerization:** Docker, Selenium Grid 4
* **IDE:** IntelliJ

---

## Features Automated

### **User Registration**

* Navigate to the registration page
* Enter user details (first name, last name, email, password, etc.)
* Agree to terms and conditions
* Verify successful registration
* Logout

### **User Login**

* Navigate to the login page
* Enter valid credentials
* Verify successful login
* Logout

### **User Account Page**

* Verify labels and links on the My Account page
* Ensure all expected sections (**Orders, Affiliate Account, Newsletter, etc.**) are present
* Logout

---

<h3> Docker + Selenium Grid Support <img src="https://www.docker.com/wp-content/uploads/2022/03/Moby-logo.png" alt="Docker" height="20"/></h3>

### ✅ Grid Setup (Remote Execution)

Selenium Grid is configured using Docker Compose on an **Ubuntu 20.04 LTS Linux VM**, hosted on **Microsoft Azure**, and accessed via public IP (e.g., `http://172.203.142.159:4444`).

### ✅ Local Execution with Grid

This setup is also compatible with **local Docker environments**. You can replicate the same Docker Compose setup locally with minimal changes for testing.

To trigger tests via Grid, use:

``` bash
  mvn clean test -DuseGrid=true
```

This runs tests using a `RemoteWebDriver` connected to the Grid hub.

---

### Parallel & Cross-Browser Testing

With the Selenium Grid 4 setup (Docker-based), this framework supports running tests in parallel across multiple browsers and nodes.

### Current Setup

>Chrome, Firefox, and Edge nodes are configured via Docker containers.

>Each browser node registers to the central Selenium Hub.

>Multiple nodes allow for parallel execution of scenarios across different browsers.

### How It Works

When the test suite runs with:

```bash
  mvn test -DuseGrid=true
```

Each scenario is assigned to an available node, enabling:

Faster test execution through parallelism

Testing across different browsers for better coverage

> This is already implemented and functional in the current framework using RemoteWebDriver logic in Hooks.java.

---
<h2> Allure Reports <img src="https://avatars.githubusercontent.com/u/5879127?s=200&v=4" alt="Allure" height="20"/></h2>

### Step 1: Use the following command to generate the Allure report:
``` bash
    allure generate target/allure-results --clean -o allure-report
```

- This command will create a detailed HTML report in the `allure-report` directory.

### Step 2: To view the report in your browser, use:

``` bash
    allure serve target/allure-results
```

- This will start a local server and open the Allure report in your default browser.

> To clear previous results:

``` bash
    rm -rf target/allure-results
```

---

## 🔜 Next Steps

🔹 Automating **Add to Cart & Checkout Flow**
🔹 Enhancing **Test Data Management**
🔹 Adding **Cross-browser & Parallel Execution Support**
🔹 Optimizing Allure tagging to avoid duplicate test entries

---
