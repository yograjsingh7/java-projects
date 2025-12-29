# Java Banking App

A simple **Java console application** that demonstrates **user registration and login** using JDBC and a relational database (e.g., MySQL).  
This project focuses on database interaction with `PreparedStatement`, basic SQL operations, and console I/O.

---

## 🧠 Overview

This application includes the `User` class, which allows users to:

- Register with **full name**, **email**, and **password**
- Check if a user already exists
- Login using email and password

It uses **JDBC** to interact with the database securely using parameterized queries.

---

## 🔧 Features

✔ Register new users  
✔ Prevent duplicate registrations  
✔ Login with credentials  
✔ Uses parameterized SQL to avoid SQL injection  
✔ Easy to integrate into larger CLI applications

---

## 📋 Prerequisites

Before running this project, make sure you have:

- JDK 8 or higher installed
- A database server (**MySQL/PostgreSQL/SQLite**, etc.)
- JDBC driver for your database added to the classpath
- An IDE or Java build tool (optional)

---

## 🗄️ Database Setup

Create a database and a `User` table:

```sql
CREATE DATABASE user_auth_db;

CREATE TABLE User (
    id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(255),
    email VARCHAR(255) UNIQUE,
    password VARCHAR(255)
);
