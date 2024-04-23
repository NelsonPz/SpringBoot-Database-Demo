# Database Demo

This project is a simple demonstration of a Spring Boot application with database integration. It includes entities for employees and departments, repositories for CRUD operations, services for business logic, and controllers for handling HTTP requests.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database (in-memory database)

## Project Structure
database_demo/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── database_demo/
│ │ │ │ ├── controllers/ # Contains controllers for handling HTTP requests
│ │ │ │ ├── model/ # Contains entity classes
│ │ │ │ ├── repos/ # Contains repository interfaces
│ │ │ │ ├── services/ # Contains service classes
│ │ │ ├── DemoApplication.java # Main class to bootstrap the Spring Boot application
│ │ └── resources/
│ │ └── application.properties # Configuration file for Spring Boot application
├── pom.xml # Maven project configuration file
└── README.md # Project documentation (you are here)

## Setup
1. Clone the repository:
  git clone https://github.com/yourusername/database_demo.git
2. Navigate to the project directory:
  cd database_demo
3. Build the project using Maven:
  mvn clean install
4. Run the application:
  mvn spring-boot:run

## Usage

- After running the application, you can access the API endpoints using your preferred HTTP client (e.g., Postman).
- The H2 in-memory database console is available at [http://localhost:8080/h2-console](http://localhost:8080/h2-console). Use the JDBC URL `jdbc:h2:mem:testdb` to connect.

