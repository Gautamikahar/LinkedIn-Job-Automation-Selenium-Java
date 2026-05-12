# LinkedIn Job Automation using Selenium and Java

## Project Overview

This project automates LinkedIn job post searching using Selenium WebDriver and Java.
The application opens LinkedIn in Chrome browser, performs automatic scrolling, extracts visible job-related content, detects recruiter email addresses, removes duplicate entries, and stores the extracted data into a CSV file.

---

## Technologies Used

* Java
* Selenium WebDriver
* Maven
* ChromeDriver
* JavaScriptExecutor
* Regex
* File Handling (CSV)

---

## Features

* Automated LinkedIn job search
* Dynamic scrolling and page loading
* Job content extraction
* Recruiter email extraction
* Duplicate data filtering
* CSV file generation
* Chrome browser automation

---

## Project Structure

```text
src/main/java/com/automation/
│
├── Main.java
├── JobSearch.java
```

---

## How to Run

### 1. Clone Repository

```bash
git clone https://github.com/Gautamikahar/LinkedIn-Job-Automation-Selenium-Java.git
```

### 2. Open Project

Open the project in IntelliJ IDEA or Eclipse.

### 3. Run Chrome in Debug Mode

```bash
chrome.exe --remote-debugging-port=9222 --user-data-dir="C:\ChromeProfile"
```

### 4. Compile Project

```bash
mvn clean compile
```

### 5. Run Project

```bash
mvn exec:java -Dexec.mainClass="com.automation.Main"
```

---

## Output

* Extracted LinkedIn job content
* Recruiter email extraction
* Data saved into `jobs.csv`

---

## Sample Extracted Emails

* [rahul.d@dikshatech.com](mailto:rahul.d@dikshatech.com)
* [Divya@Calyc.com](mailto:Divya@Calyc.com)

---

## Author

Gautami Kahar
