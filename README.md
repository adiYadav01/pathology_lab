Pathology Lab Management System
Project Overview
The Pathology Lab Management System is a mini healthcare application developed using Spring Boot, Angular, and MySQL.
This project helps pathology laboratories manage pathology tests, patient test orders, and result entries in a simple and efficient way.
The application is divided into three main modules:
Test Master Management
Test Order / Lab Request
Result Entry Management
The project demonstrates CRUD operations, REST API integration, database relationships, and frontend-backend communication.

Project Objective
The main objective of this project is to automate the workflow of a pathology laboratory by:
Managing pathology tests
Creating patient test orders
Recording pathology results
Tracking completed reports
This project is designed as a demo-ready mini pathology management system.

Tech Stack
Frontend
Angular
TypeScript
HTML
CSS
Bootstrap

Backend
Spring Boot
Spring Data JPA
Hibernate
REST API

Database
MySQL

Tools & IDEs
IntelliJ IDEA
VS Code
MySQL Workbench
Postman

Functional Modules
1. Test Master Module
This module is used to manage pathology tests.
Features:
Add new pathology tests
Store test information:
Test Name
Test Code
Sample Type
Normal Range
Price
Search pathology tests
View list of available tests

2. Test Order / Lab Request Module
This module is used to create pathology test orders for patients.
Features
Create new patient test orders
Generate unique order numbers
Store patient information:
Patient Name
Phone Number
Selected Test
Order Date
View today's orders

3. Result Entry Module
This module is used by lab technicians to enter pathology test results.
Features
Enter pathology test result values
Add technician notes
Mark reports as completed
View completed reports

Backend Architecture
The backend follows layered architecture:
Controller Layer
Handles REST API requests and responses.
Service Layer
Contains business logic.
Repository Layer
Handles database operations using JPA.
Entity Layer
Represents database tables.

Database Tables
pathology_test
Stores pathology test details.
test_order
Stores patient test order details.
test_result
Stores pathology result details.

API Endpoints
Test APIs
MethodEndpointDescriptionPOST/api/testsAdd TestGET/api/testsGet All TestsGET/api/tests/searchSearch Test

Order APIs
MethodEndpointDescriptionPOST/api/ordersCreate OrderGET/api/orders/todayGet Today's Orders

Result APIs
MethodEndpointDescriptionPOST/api/resultsSave ResultGET/api/results/{orderId}Get Result

Frontend UI
The Angular frontend contains three major screens:


Test Master Screen
Test Order Screen
Result Entry Screen
The UI is built using Bootstrap for responsive design and better user experience.

Project Workflow
Step 1
Admin creates pathology tests.
Step 2
Receptionist creates patient test orders.
Step 3
Lab technician enters pathology results.
Step 4
Reports are marked as completed.

Features Implemented
CRUD Operations
REST API Integration
Angular HTTP Client
MySQL Database Connectivity
JPA Relationships
Responsive UI
Search Functionality
Order Management
Result Management

How To Run The Project
Backend Setup
Step 1: Install Requirements
Java JDK 17
MySQL Server
IntelliJ IDEA

Step 2: Create Database
Open MySQL and run:
CREATE DATABASE pathology_db;
Step 3: Configure application.properties
Update database username and password:
spring.datasource.url=jdbc:mysql://localhost:3306/pathology_db
spring.datasource.username=root
spring.datasource.password=your_password
Step 4: Run Spring Boot Application
Open project in IntelliJ IDEA.
Run:
PathologyBackendApplication.java
Backend runs on:
http://localhost:8080

Frontend Setup
Step 1: Install Requirements
Node.js
Angular CLI
VS Code

Step 2: Install Dependencies
Open terminal inside Angular project and run:
npm install

Step 3: Run Angular Project
Run:
ng serve
Frontend runs on:
http://localhost:4200

Sample Test Data
Test Example
FieldValueTest NameBlood SugarTest CodeBS101Sample TypeBloodNormal Range70-110Price200

Order Example
FieldValuePatient NameRahulPhone9999999999Test ID1

Result Example
FieldValueOrder ID1Result Value95Technician NotesNormal

Future Enhancements
PDF Report Generation
Authentication & Authorization
Dashboard Analytics
Email Report Sharing
Appointment Management
Doctor Management
Payment Module

Screenshots
Fullscreen UI
<img width="1914" height="931" alt="image" src="https://github.com/user-attachments/assets/7a7f19ac-6406-46be-bcd7-5abf824b05ee" />

Test Master Screen
<img width="716" height="848" alt="image" src="https://github.com/user-attachments/assets/b2126527-034a-428f-8b71-ad5414b97173" />

Test Order Screen
<img width="610" height="696" alt="image" src="https://github.com/user-attachments/assets/78e9ff66-bfc0-4aed-b4d0-0fc1acc58774" />

Result Entry Screen
<img width="592" height="723" alt="image" src="https://github.com/user-attachments/assets/40cf1304-7a00-4c45-be31-a3cca3332790" />

Conclusion
The Pathology Lab Management System is a mini healthcare management application developed using modern full-stack technologies.
The project demonstrates practical implementation of frontend-backend integration, REST APIs, database management, and responsive UI development.
This project helped in understanding:


Spring Boot development
Angular frontend integration
REST API communication
MySQL database management
JPA/Hibernate ORM
Real-world pathology workflow implementation

Author
Aditya
Java Developer Intern Assignment Project
