# 🎓 Student Management System

A full-stack **Student Management System** designed to simplify the management of student records through an intuitive and responsive web interface. This application provides a secure and efficient way to perform CRUD operations while demonstrating modern software development practices using **Spring Boot** and **Java**.

---

## 📖 Overview

The **Student Management System** is a web application that enables administrators to efficiently manage student information. It provides an organized interface for creating, viewing, updating, and deleting student records while maintaining clean architecture and scalable backend design.

This project was developed as part of my software engineering learning journey and demonstrates practical experience with backend development, database integration, and RESTful APIs.

---

## ✨ Features

* 🔐 Secure application architecture
* ➕ Add new students
* 📋 View all student records
* ✏️ Update student information
* 🗑️ Delete students
* 🔍 Search and manage student data
* 📱 Responsive user interface
* ⚡ Fast and user-friendly experience

---

## 🛠️ Tech Stack

### Backend

* Java 17+
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate

### Frontend

* HTML5
* CSS3
* JavaScript
* Bootstrap

### Database

* MySQL

### Tools

* IntelliJ IDEA
* Git & GitHub
* Maven
* Postman

---

## 📂 Project Structure

```text
Student-Management-System/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   ├── resources/
│   │   └── static/
│   └── test/
│
├── pom.xml
├── README.md
└── .gitignore
```

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/yassinefekih123/Student-Management-System.git
```

### 2. Navigate into the project

```bash
cd Student-Management-System
```

### 3. Configure the database

Create a MySQL database and update your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_management
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4. Run the application

```bash
mvn spring-boot:run
```

The application will be available at:

```
http://localhost:8080
```

---

## 📸 Screenshots

You can add screenshots here.

```markdown
![Dashboard](screenshots/dashboard.png)

![Student List](screenshots/students.png)

![Add Student](screenshots/add-student.png)
```

---

## 📌 Future Improvements

* User authentication (Spring Security)
* Role-based access control
* Pagination and filtering
* Student profile photos
* Export to PDF/Excel
* Dashboard analytics
* Email notifications
* Docker support
* REST API documentation (Swagger)

---

## 🧪 Testing

Run the test suite with:

```bash
mvn test
```

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository.
2. Create a feature branch.
3. Commit your changes.
4. Push your branch.
5. Open a Pull Request.

---

## 📄 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

### Yassine Fekih

🎓 Software Engineering Student

* GitHub: https://github.com/yassinefekih123

---

## ⭐ Support

If you found this project useful, please consider giving it a **⭐ Star** on GitHub.

Your support helps motivate future improvements and new open-source projects.
