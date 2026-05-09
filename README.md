# Pathology Lab Management System

---

# 📌 Project Overview

The **Pathology Lab Management System** is a mini healthcare application developed using **Spring Boot, Angular, and MySQL**.

This project helps pathology laboratories manage pathology tests, patient test orders, and result entries in a simple and efficient way.

The application is divided into three major modules:

### 🧪 Test Master Management

### 📋 Test Order / Lab Request

### 🧾 Result Entry Management

This project demonstrates:

* CRUD Operations
* REST API Integration
* Database Relationships
* Frontend-Backend Communication

---

# 🎯 Project Objective

The primary objective of this project is to automate pathology laboratory workflows by:

* Managing pathology tests
* Creating patient test orders
* Recording pathology results
* Tracking completed reports

This project serves as a **demo-ready mini pathology management system**.

---

# 🛠 Tech Stack

## 🎨 Frontend

* Angular
* TypeScript
* HTML5
* CSS3
* Bootstrap

## ⚙ Backend

* Spring Boot
* Spring Data JPA
* Hibernate
* REST APIs

## 🗄 Database

* MySQL

## 🧰 Tools & IDEs

* IntelliJ IDEA
* VS Code
* MySQL Workbench
* Postman

---

# 🧠 Functional Modules

---

# 1️⃣ Test Master Module

This module is used to manage pathology tests.

## Features:

* Add new pathology tests
* Store test information:

  * Test Name
  * Test Code
  * Sample Type
  * Normal Range
  * Price
* Search pathology tests
* View list of available tests

---

# 2️⃣ Test Order / Lab Request Module

This module is used to create pathology test orders for patients.

## Features:

* Create new patient test orders
* Generate unique order numbers
* Store patient information:

  * Patient Name
  * Phone Number
  * Selected Test
  * Order Date
* View today’s orders

---

# 3️⃣ Result Entry Module

This module is used by lab technicians to enter pathology test results.

## Features:

* Enter pathology test result values
* Add technician notes
* Mark reports as completed
* View completed reports

---

# 🏗 Backend Architecture

The backend follows a layered architecture:

## Controller Layer

Handles REST API requests and responses.

## Service Layer

Contains business logic.

## Repository Layer

Handles database operations using JPA.

## Entity Layer

Represents database tables.

---

# 🗄 Database Tables

## pathology_test

Stores pathology test details.

## test_order

Stores patient test order details.

## test_result

Stores pathology result details.

---

# 🌐 API Endpoints

## 🧪 Test APIs

| Method | Endpoint          | Description   |
| ------ | ----------------- | ------------- |
| POST   | /api/tests        | Add Test      |
| GET    | /api/tests        | Get All Tests |
| GET    | /api/tests/search | Search Test   |

---

## 📋 Order APIs

| Method | Endpoint          | Description        |
| ------ | ----------------- | ------------------ |
| POST   | /api/orders       | Create Order       |
| GET    | /api/orders/today | Get Today's Orders |

---

## 🧾 Result APIs

| Method | Endpoint               | Description |
| ------ | ---------------------- | ----------- |
| POST   | /api/results           | Save Result |
| GET    | /api/results/{orderId} | Get Result  |

---

# 🖥 Frontend UI

The Angular frontend contains three major screens:

### 🧪 Test Master Screen

### 📋 Test Order Screen

### 🧾 Result Entry Screen

The UI is built using **Bootstrap** for responsive design and professional presentation.

---

# 🔄 Project Workflow

### Step 1:

Admin creates pathology tests.

### Step 2:

Receptionist creates patient test orders.

### Step 3:

Lab technician enters pathology results.

### Step 4:

Reports are marked as completed.

---

# ✨ Features Implemented

* CRUD Operations
* REST API Integration
* Angular HTTP Client
* MySQL Database Connectivity
* JPA Relationships
* Responsive UI
* Search Functionality
* Order Management
* Result Management

---

# 🚀 How To Run The Project

---

# ⚙ Backend Setup

## Step 1: Install Requirements

* Java JDK 17
* MySQL Server
* IntelliJ IDEA

---

## Step 2: Create Database

```sql
CREATE DATABASE pathology_db;
```

---

## Step 3: Configure application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/pathology_db
spring.datasource.username=root
spring.datasource.password=your_password
```

---

## Step 4: Run Spring Boot Application

Run:

```bash
PathologyBackendApplication.java
```

Backend runs on:

```bash
http://localhost:8080
```

---

# 🎨 Frontend Setup

## Step 1: Install Requirements

* Node.js
* Angular CLI
* VS Code

---

## Step 2: Install Dependencies

```bash
npm install
```

---

## Step 3: Run Angular Project

```bash
ng serve
```

Frontend runs on:

```bash
http://localhost:4200
```

---

# 🧪 Sample Test Data

## Test Example

| Field        | Value       |
| ------------ | ----------- |
| Test Name    | Blood Sugar |
| Test Code    | BS101       |
| Sample Type  | Blood       |
| Normal Range | 70-110      |
| Price        | 200         |

---

## Order Example

| Field        | Value      |
| ------------ | ---------- |
| Patient Name | Rahul      |
| Phone        | 9999999999 |
| Test ID      | 1          |

---

## Result Example

| Field            | Value  |
| ---------------- | ------ |
| Order ID         | 1      |
| Result Value     | 95     |
| Technician Notes | Normal |

---

# 🔮 Future Enhancements

* PDF Report Generation
* Authentication & Authorization
* Dashboard Analytics
* Email Report Sharing
* Appointment Management
* Doctor Management
* Payment Module

---

# 📸 Screenshots

## 🖥 Fullscreen Dashboard UI

<img src="https://github.com/user-attachments/assets/7a7f19ac-6406-46be-bcd7-5abf824b05ee" width="900" alt="Fullscreen UI" />

---

## 🧪 Test Master Screen

<img src="https://github.com/user-attachments/assets/b2126527-034a-428f-8b71-ad5414b97173" width="700" alt="Test Master Screen" />

---

## 📋 Test Order Screen

<img src="https://github.com/user-attachments/assets/78e9ff66-bfc0-4aed-b4d0-0fc1acc58774" width="700" alt="Test Order Screen" />

---

## 🧾 Result Entry Screen

<img src="https://github.com/user-attachments/assets/40cf1304-7a00-4c45-be31-a3cca3332790" width="700" alt="Result Entry Screen" />

---

# 🏁 Conclusion

The **Pathology Lab Management System** is a modern healthcare management solution developed using full-stack technologies.

This project demonstrates practical implementation of:

* Spring Boot backend development
* Angular frontend integration
* REST API communication
* MySQL database management
* JPA/Hibernate ORM
* Real-world pathology workflow automation

---

# 👨‍💻 Author

### Aditya

### Java Developer Intern Assignment Project
