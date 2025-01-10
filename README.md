# E-Commerce Application

This project is an E-Commerce platform developed using Java and Maven. It allows users to browse products, add them to a cart, and place orders. The application is built following best practices in software development and is designed for scalability and ease of use.

## Features

- User authentication and authorization
- Product catalog management
- Shopping cart functionality
- Order placement and tracking
- RESTful API endpoints
- Integration with a database for persistent data storage

## Project Structure

The project follows the standard Maven directory structure:

```
ECommerce
├── src
│   ├── main
│   │   ├── java           # Application source code
│   │   ├── resources      # Application configuration files
│   └── test
│       ├── java           # Test source code
│       ├── resources      # Test configuration files
├── pom.xml                # Maven configuration file
└── target                 # Compiled output and build artifacts
```

## Prerequisites

- **Java Development Kit (JDK)**: Version 11 or higher
- **Apache Maven**: Version 3.6 or higher
- **MySQL** or any other relational database

## Setup Instructions

Follow these steps to set up and run the project locally:

### 1. Clone the Repository

```bash
git clone https://github.com/Anurag3790/E-Commerce.git
cd ECommerce
```

### 2. Configure the Database

1. Create a database (e.g., `ecommerce_db`).
2. Update the database connection details in the `application.properties` file located in the `src/main/resources` directory:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=<your_username>
spring.datasource.password=<your_password>
```

### 3. Install Dependencies

Run the following command to install all required dependencies:

```bash
mvn clean install
```

### 4. Run the Application

Use the Maven wrapper to start the application:

```bash
./mvnw spring-boot:run
```

For Windows:

```bash
mvnw.cmd spring-boot:run
```

### 5. Access the Application

Open your browser and navigate to:

```
http://localhost:8080
```

## Testing

Run the following command to execute unit tests:

```bash
mvn test
```

