
# 📋 Java Task Manager

A clean and simple REST API built with Spring Boot for managing tasks. This project demonstrates fundamental backend development concepts including RESTful APIs, database integration, and proper software architecture patterns.

## 🚀 Features

- **Create Tasks** - Add new tasks with title, description, and priority level
- **List Tasks** - Retrieve all tasks with their basic information
- **Find Task** - Get detailed information about a specific task by ID
- **Delete Tasks** - Remove tasks from the system
- **Update Priority** - Modify task priority levels

## 🛠 Tech Stack

- **Java 21** - Modern Java with latest features
- **Spring Boot 4.0.3** - Framework for building REST APIs
- **Spring Data JPA** - Database abstraction layer
- **PostgreSQL** - Relational database for data persistence
- **Maven** - Dependency management and build tool

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/tasks` | Create a new task |
| `GET` | `/tasks` | List all tasks |
| `GET` | `/tasks/{id}` | Get task details by ID |
| `DELETE` | `/tasks/{id}` | Delete a task by ID |
| `PATCH` | `/tasks/{id}` | Update task priority |

## 🏗 Project Structure

```
src/main/java/com/taskmanager/app/
├── controller/     # REST API endpoints
├── service/        # Business logic layer
├── repository/     # Data access layer
├── entity/         # Database entities
└── data/           # DTOs and data transfer objects
```

## 📦 Data Models

### Task Entity
- **id**: Integer (auto-generated)
- **title**: String
- **description**: String  
- **priority**: Integer

### Sample Request (POST /tasks)
```json
{
  "title": "Complete Java Project",
  "description": "Finish the task manager REST API",
  "priority": 1
}
```

## 🚀 Getting Started

### Prerequisites
- Java 21 or higher
- Maven 3.6+
- PostgreSQL database

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Mzinngraf/java-task-manager.git
   cd java-task-manager
   ```

2. **Configure Database**
   - Set up PostgreSQL database
   - Update database connection in `application.properties`

3. **Build and Run**
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Access the API**
   - Base URL: `http://localhost:8080`
   - Use Postman, curl, or any HTTP client to test endpoints

## 🎯 Learning Objectives

This project helped me master:

- Spring Boot framework fundamentals
- RESTful API design principles
- Database integration with JPA
- Layered architecture patterns
- Dependency injection
- Error handling and HTTP status codes

## 🔮 Future Enhancements

- [ ] Task status management (pending, in-progress, completed)
- [ ] Task categories and tags
- [ ] User authentication and authorization
- [ ] Input validation and error handling
- [ ] Unit and integration tests
- [ ] API documentation with Swagger/OpenAPI
- [ ] Docker containerization

## 👨‍💻 Author

**Marco Zinngraf**
- GitHub: [Mzinngraf](https://github.com/Mzinngraf)
- Learning backend development with Java and Spring Boot

---

*This project is part of my journey in learning backend development. Built with passion for clean code and best practices.*