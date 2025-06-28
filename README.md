# 📘 StudentApp - Spring Boot CRUD API

A simple **Spring Boot** application to manage student data using RESTful web services and an in-memory **H2 database**. This project allows you to perform basic **CRUD operations** (Create, Read, Delete) and test them using **Postman**.

---

## 🚀 Features

- Add a new student to the database
- View all students
- View a single student by ID
- Delete a student by ID
- Auto-configured **H2 database** using Spring Data JPA
- Tested and verified using **Postman**

---

## ⚙️ Tech Stack

- **Java 21**
- **Spring Boot 3.5.3**
- **Spring Data JPA**
- **H2 In-Memory Database**
- **Postman** for testing
- **Git & GitHub** for version control

---

## 📁 Project Structure

StudentApp/
├── src/
│ └── main/
│ ├── java/com/example/demo/
│ │ ├── StudentAppApplication.java
│ │ ├── StudentController.java
│ │ ├── model/Student.java
│ │ └── repository/StudentRepo.java
│ └── resources/
│ └── application.properties
├── Testings/
│ └── [Postman + H2 Screenshot Proofs]
├── pom.xml
└── README.md

All screenshots (Postman tests + H2 console) are available in the /Testings folder for reference.
