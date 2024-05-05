# Java Mini Assignment 2: User Verification System

## Definition

This project implements a user verification system that retrieves random user data from an external API, validates the nationality and gender of the user, saves the user data in a MySQL database, and provides APIs for creating and retrieving users with sorting and pagination options.


## Features

- Fetch a random user from an external API.
- Retrieve user's nationality and gender using parallel API calls.
- Validate user's nationality and gender to verify user's identity.
- Save user data in MySQL database with verification status.
- Implement custom validators for input parameters.
- Paginate and sort user data based on name or age.
- Write JUnit test cases with Mockito for API endpoints.


## Technology Used

- Java 8+
- Spring Boot
- MySQL
- WebClient for making API calls
- JUnit and Mockito for testing
- Strategy design pattern for sorting
- Factory design pattern for validators


## Prerequisites

- Java 8 or higher installed
- Maven for building and managing dependencies
- MySQL installed and running locally
- Postman or any API testing tool for testing APIs


## Steps to Installation

1. Clone the repository:
   git clone https://github.com/yourusername/user-verification-system.git

2. Navigate to the project directory:
   cd NAME_OF_PROJECT_DIRECTORY

3. Configure MySQL database settings in application.properties:

   spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   spring.datasource.username=your_database_username
   spring.datasource.password=your_database_password

4. Update Maven.

5. Run the application using Maven:
   mvn spring-boot:run


## Usage

1. Use Postman or any API testing tool to access the following endpoints:
   a.POST http://localhost:8080/users
       -Request Payload: size=1
       -Response: List of saved users
   b.GET http://localhost:8080/users
       -Query Parameters:
   	        sortType=<Name/Age>
	          sortOrder=<EVEN/ODD>
	          limit=5
	          offset=0
       -Response: Paginated and sorted list of users

2.Test the endpoints using JUnit test cases provided in the project.



## Additional Notes

1. Ensure proper naming conventions for package/class/method names.
2. Follow SOLID design principles throughout the codebase.
3. Utilize Java 8+ functionalities like Streams API wherever possible.






