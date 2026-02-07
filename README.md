# Student Management System

A Spring Boot REST API project to manage student details using CRUD operations.

## 🚀 Features
- Add a student
- Get all students
- Get student by ID
- RESTful API design

## 🛠 Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## 📂 Project Structure
- Controller: Handles REST APIs
- Entity: Student model
- Repository: Database operations

## ▶ How to Run
1. Clone the repository
2. Configure MySQL in `application.properties`
3. Run the project using:

## 📌 Sample APIs (Tested using Postman)

- GET `/student`  
  → Get all students

- GET `/student/{id}`  
  → Get student by ID

- POST `/student/add`  
  → Add a new student

- PUT `/student/update/{id}`  
  → Update existing student details

- DELETE `/student/delete/{id}`  
  → Delete student by ID

## 👨‍💻 Author
Preetham GS
