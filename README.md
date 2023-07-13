# cinema-app
Cinema app project is a Java-based web application that provides a platform for managing the services related to cinema tickets service.
The project uses a MySQL database to store and retrieve data related to users, shopping carts, tickets, movies, movie sessions and cinema halls.
The project is written with help of Spring framework and Hibernate.
First of all you have to authenticate yourself,
then you can add movies that your clients (users) can purchase to watch it. 
Client can register and choose the movie he wants to see and buy a ticket for it.
the app will display for the client all the information about the bought ticket
and will show him obviously when and where it will be shown and at what hour it will be.

# Requirements:

The following technologies and tools are required to run the Cinema-app project:

Java Development Kit (JDK) 16
Apache Tomcat Server 9
MySQL Community Server 8.0
MySQL Connector/J 8.0
Spring framework
Hibernate framework
IDE (Integrated Development Environment) such as IntelliJ IDEA, Eclipse, or NetBeans

# Functionality:
- register / login
- add / remove tickets
- add / remove information about the hall and session
- add / remove movies
- add / remove content to/from the shopping cart
- delete registered user from DB
- create orders
- get info about orders

# 👀Installation:
To install and run the Cinema-app project on your local machine, please follow these steps:
1. Clone the project from the GitHub repository.
2. Open the IDE and import the project as a Maven project.
3. Configure the database connection by providing your credentials and the database info in the DB.properties file, located in src/main/resources folder.
4. Build the project using Maven. mvn clean package
5. Deploy the generated WAR file to the Apache Tomcat Server.
6. Access the application at the following URL: http://localhost:3306/

# ⚙️Project structure:
- models
- dao
- controllers
- dto
- services
- filters and all the build functionality of Spring

# Conclusion:
The Cinema-app project demonstrates the usage of Spring and Hibernate frameworks
for creating a web application that provides services for cinema shop service companies.
It's a simple and user-friendly interface that allows you to manage shopping carts, tickets, register, log in, and log out users.
With this project, you can learn how to work with a MySQL database, Spring, and Hibernate frameworks, write controllers, and handle user functionality.

For more information, please open the project and see the code.


