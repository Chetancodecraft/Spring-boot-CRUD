# Spring Boot CRUD Application

## Overview
This is a simple Spring Boot CRUD (Create, Read, Update, Delete) application that manages student data using Spring Boot, JPA, and MySQL.

## Features
- Add a new student
- Fetch all students
- Fetch a student by ID
- Update student details
- Delete a student

## Tech Stack
- **Backend:** Spring Boot, Spring Data JPA
- **Database:** MySQL
- **Tools:** Postman (for API testing), Git, GitHub

## Setup Instructions
### 1. Clone the Repository
```bash
git clone https://github.com/Chetancodecraft/Spring-boot-CRUD.git
cd Spring-boot-CRUD
```

### 2. Configure Database
Update `src/main/resources/application.properties` with your MySQL database details:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run the Application
```bash
mvn spring-boot:run
```

## API Endpoints
### 1. Add a Student
- **Method:** POST
- **Endpoint:** `/students/add`
- **Request Body (JSON):**
  ```json
  {
    "name": "John Doe",
    "branch": "Computer Science"
  }
  ```

### 2. Get All Students
- **Method:** GET
- **Endpoint:** `/students/all`

### 3. Get Student by ID
- **Method:** GET
- **Endpoint:** `/students/{id}`

### 4. Update Student
- **Method:** PUT
- **Endpoint:** `/students/update/{id}`
- **Request Body (JSON):**
  ```json
  {
    "name": "Updated Name",
    "branch": "Updated Branch"
  }
  ```

### 5. Delete Student
- **Method:** DELETE
- **Endpoint:** `/students/delete/{id}`



