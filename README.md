# 🎓 stu-manage — Student Management System

A full-stack web application built with **Java Spring Boot** and **Oracle Database**
that performs complete **CRUD operations** on student records.

---

## 🚀 Features

- ✅ View all students in a clean table
- ✅ Add new student records
- ✅ Edit existing student details
- ✅ Delete student records
- ✅ Oracle Database integration
- ✅ MVC Architecture

---

## 🧱 Tech Stack

| Technology      | Purpose                        |
|-----------------|-------------------------------|
| Java 17         | Core programming language      |
| Spring Boot 3.3 | Web application framework      |
| Spring Data JPA | Database ORM layer             |
| Thymeleaf       | Server-side HTML templating    |
| Oracle XE       | Relational database            |
| Maven           | Build and dependency management|

---

## 📁 Project Structure

src/main/java/com/peter/stu_manage
│
├── StuManageApplication.java
├── entity/
│   └── Student_entity.java
├── repository/
│   └── StudentRepository.java
├── service/
│   ├── StudentService.java
│   └── StudentServiceImpl.java
└── controller/
└── StudentController.java
src/main/resources/
├── templates/
│   ├── index.html
│   └── new_student.html
└── application.properties.example

---

## ⚙️ Setup Instructions

### Prerequisites
- Java 17
- Maven
- Oracle XE installed and running
- Oracle listener running on port 1521

### Database Setup

Run these SQL commands in Oracle:

```sql
CREATE TABLE STUDENT (
    ID     NUMBER PRIMARY KEY,
    NAME   VARCHAR2(100),
    EMAIL  VARCHAR2(100),
    COURSE VARCHAR2(100)
);

CREATE SEQUENCE STUDENT_SEQ START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER STUDENT_TRG
BEFORE INSERT ON STUDENT
FOR EACH ROW
BEGIN
    :NEW.ID := STUDENT_SEQ.NEXTVAL;
END;
/
```

### Configuration

1. Clone the repository:
```bash
git clone https://github.com/your-username/stu-manage.git
```

2. Navigate to project folder:
```bash
cd stu-manage
```

3. Copy the example properties file:
```bash
cp src/main/resources/application.properties.example src/main/resources/application.properties
```

4. Edit `application.properties` with your Oracle credentials:
```properties
spring.datasource.url=jdbc:oracle:thin:@//localhost:1521/XE
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

### Run the Application

```bash
mvn spring-boot:run
```

Then open your browser and visit:
http://localhost:8080/

## 🗄️ Database Schema

STUDENT Table
┌────────────────────────────────────┐
│ Column │ Type         │ Notes      │
├────────┼──────────────┼────────────┤
│ ID     │ NUMBER       │ Primary Key│
│ NAME   │ VARCHAR2(100)│            │
│ EMAIL  │ VARCHAR2(100)│            │
│ COURSE │ VARCHAR2(100)│            │
└────────┴──────────────┴────────────┘

## 🔄 MVC Flow
Browser → Controller → Service → Repository → Oracle DB
                                                    ↓
Browser ←  Thymeleaf  ←  Model  ←  Service   ←   Data

---

## 👨‍💻 Author

**Hariharan M V**
- LinkedIn: [hariharan-m-v-a01321268](https://linkedin.com/in/hariharan-m-v-a01321268)
- Email: harikvg031207@gmail.com

---

## 📜 License

This project is open source and available for learning purposes.



