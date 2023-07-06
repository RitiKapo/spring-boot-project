# Employee Management API

This project is a simple Employee Management API developed using the Spring Boot framework with RESTful principles. The API allows users to perform basic CRUD operations on employee data and provides a set of endpoints to interact with the system.

## Features

- **Employee CRUD Operations**: Create, retrieve, update, and delete employee records.
- **Employee Data**: Each employee record contains essential information such as id, first name, last name and email.
- **Endpoint Documentation**: Detailed documentation of all available endpoints is provided below.

## Endpoints

The following endpoints are available in the API:

- **GET /employees**: Retrieves a list of all employees.
- **GET /employees/{employeeId}**: Retrieves a specific employee by their ID.
- **POST /employees**: Creates a new employee record.
- **PUT /employees**: Updates an existing employee record.
- **DELETE /employees/{employeeId}**: Deletes an existing employee record.

## Technologies Used

- Spring Boot
- Spring Web
- JPA API
- Java 8
- Maven

## Getting Started

To run the project locally, follow these steps:

1. Clone the repository: `git clone https://github.com/your-username/employee-management-api.git`
2. Navigate to the project directory: `cd employee-management-api`
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`
5. Access the API documentation: `http://localhost:8080/swagger-ui.html`

## API Usage

You can use any REST client, such as cURL or Postman, to interact with the API. Here are some examples:

- Retrieve all employees:
  ```
  GET /employees
  ```

- Retrieve a specific employee:
  ```
  GET /employees/{employeeId}
  ```

- Create a new employee:
  ```
  POST /employees
  ```

- Update an existing employee:
  ```
  PUT /employees
  ```

- Delete an existing employee:
  ```
  DELETE /employees/{employeeId}
  ```


## Conclusion

The Employee Management API is a convenient tool for managing employee data in a structured and efficient manner. With its user-friendly endpoints and robust functionality, this API can be easily integrated into various applications to handle employee-related operations. Feel free to explore and modify the codebase to suit your specific requirements.