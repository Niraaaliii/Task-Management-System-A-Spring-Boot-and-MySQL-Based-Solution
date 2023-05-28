# To-Do List Project

This project is a simple To-do list application that allows users to create, read, update, and delete To-do items. The application is built using Spring Boot and MySQL, and it is tested using Postman.

## Getting Started

To get started with this project, you will need to install the following software:

* Postman
* Eclipse
* Spring Boot
* MySQL

Once you have installed the necessary software, you can follow these steps to get the project up and running:

1. Clone the project from GitHub:


git clone https://github.com/Niraaaliii/To-Do-Project.git
```

2. Import the project into Eclipse:

```
File > Import > Maven > Existing Maven Projects
```

3. In the Import Project dialog, select the `todo-list-project` directory and click `Finish`.

4. Update the `application.properties` file with the following information:

```
spring.datasource.url=jdbc:mysql://localhost:3306/todo_list
spring.datasource.username=root
spring.datasource.password=password
```

5. Run the application:

Once the application is running, you can access it at `http://localhost:8080`.

## API Documentation

The API documentation for the To-do list application is available at `http://localhost:8080/v2/api-docs`.

## Testing

The To-do list application can be tested using Postman. 

## Further Reading

* [Spring Boot](https://spring.io/projects/spring-boot)
* [MySQL](https://www.mysql.com/)
* [Postman](https://www.postman.com/)
```
