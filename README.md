# Spring JDBC Template Demo

## Overview

This project demonstrates the use of Spring Boot with the JDBC Template to interact with a PostgreSQL database. It is designed to showcase a simple and effective approach for database operations like inserting and retrieving records.

The application focuses on managing student records stored in a PostgreSQL table called `student`. The key features include the creation, storage, and retrieval of student data using Spring Boot's dependency injection and repository patterns.

---

## Project Structure

- **Model**: Represents the `Student` entity that maps to the database table.
- **Repository**: Contains data access logic using Spring's `JdbcTemplate`.
- **Service**: Provides a layer between the repository and the main application for clean separation of concerns.
- **Main Application**: Serves as the entry point of the application, demonstrating the functionality of adding and retrieving student records.

---

## Components

### Student Class (`com.petroudis.SpringJDBCDemo.model.Student`)
Represents the `Student` entity with the following fields:
- `rollNumber`: Integer representing the unique roll number of a student.
- `name`: String representing the name of the student.
- `marks`: Integer representing the marks of the student.

### Student Repository (`com.petroudis.SpringJDBCDemo.repo.StudentRepo`)
Handles database interactions via `JdbcTemplate`.  
**Methods**:
- `save(Student s)`: Inserts a student record into the database.
- `findAll()`: Retrieves all student records from the database.

### Student Service (`com.petroudis.SpringJDBCDemo.service.StudentService`)
Acts as a mediator between the repository and the main application.  
**Methods**:
- `addStudent(Student s)`: Adds a student to the database.
- `getStudents()`: Fetches all students from the database.

### Main Application (`com.petroudis.SpringJDBCDemo.SpringJdbcDemoApplication`)
Demonstrates the following:
- Creating a `Student` object and setting its properties.
- Storing the student object in the database using `StudentService`.
- Retrieving and printing all student records.

---

## Prerequisites

- Java 17+
- Spring Boot 3.x
- PostgreSQL Database
- Maven
