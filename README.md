# ecommerce-springboot
ecommerce web using spring mvc
First, go to https://start.spring.io/ where we can create new spring app and add dependencies
Select maven, add Spring Data JPA and Spring Web dependencies

Click on Generate and download the .zip file, uncompress it and open it using the IntelliJ Idea

Model / Entity
Model is the basic entity that has a direct relationship with the structure of a table in the database. In other words, these models serve as containers that hold similar and relative data that are used to transport these data from clients to the database. User Profile, Product, and Category are some models in our backend application.

Repository
Repository is an interface that acts as a bridge between the database and the application. It carries the model data to and from the database. Every model will have a unique repository for the data transportation.
Service
Service is the part of the architecture where the repository is instantiated, and business logic is applied. The data from the client reaching here is manipulated and sent through the repository to the database.
Controller
The controller is the part of the architecture where the requests from the clients are first handled. It controls the processes that should run on the backend and the response that has to be elicited to the clients. It interacts with the service which in turn interacts with the repository which in turn interacts with the database using models.
First we will create a model, Category It will have four fields.

id

categoryName

description

imageUrl

We will also create a setter and getter for the four fiel
