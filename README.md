# cinema-app
Cinema app project is a Java-based web application that provides a platform for managing the services related to cinema tickets service.
The project uses a MySQL database to store and retrieve data related to users, shopping carts, tickets, movies, movie sessions and cinema halls.
The project is written with help of Spring framework and hibernate.
First of all you have to authenticate yourself,
then you can add movies that your clients (users) can purchase to watch it. 
Client can register and choose the movie he wants to see and buy a ticket for it.
the app will display for the client all the information about the bought ticket
and will show him obviously when and where it will be shown and at what hour it will be.

# Requirements:

The following technologies and tools are required to run the Cinema-app project:

Java Development Kit (JDK) 11 or higher version
Apache Tomcat Server 9 or higher version
MySQL Community Server 8.0 or higher version
MySQL Connector/J 8.0 or higher version
Spring framework
Hibernate framework
IDE (Integrated Development Environment) such as IntelliJ IDEA, Eclipse, or NetBeans

# Functionality:
- register / login
- add / remove tickets
- add / remove information about hall and session
- add / remove movies
- add / remove content to/from shopping cart
- delete registered user from DB
- create orders
- get info about orders

# 👀Installation:
To install and run the Cinema-app project on your local machine, please follow these steps:
1. Clone the project from the GitHub repository.
2. Open the IDE and import the project as a Maven project.
3. Configure the database connection by providing your credentials and the database info in the db.properties file, located in src/main/resources folder.
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

# Imports:
hibernate version: 5.6.14 Final

spring version: 5.3.20

spring security version: 5.6.10

<dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-orm</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-core</artifactId>
            <version>${spring.security.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-config</artifactId>
            <version>${spring.security.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-web</artifactId>
            <version>${spring.security.version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-dbcp2</artifactId>
            <version>2.8.0</version>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>${hibernate.version}</version>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-java8</artifactId>
            <version>${hibernate.version}</version>
        </dependency>
        <dependency>
            <groupId>org.hibernate.validator</groupId>
            <artifactId>hibernate-validator</artifactId>
            <version>6.1.6.Final</version>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.32</version>
        </dependency>
        <dependency>
            <groupId>javax.annotation</groupId>
            <artifactId>javax.annotation-api</artifactId>
            <version>1.3.2</version>
        </dependency>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>4.0.1</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.14.1</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.datatype</groupId>
            <artifactId>jackson-datatype-jsr310</artifactId>
            <version>2.13.0</version>
        </dependency>
    </dependencies>

# Conclusion:
The Cinema-app project demonstrates the usage of Spring and Hibernate frameworks
for creating a web application that provides services for cinema shop service company.
It's simple and user-friendly interface that allows you to manage shopping carts, tickets, register, login and logout users.
With this project, you can learn how to work with a MySQL database, Spring and Hibernate frameworks and how to write controllers and handle user functionality with it.

For more information, please open the project and see the code.


