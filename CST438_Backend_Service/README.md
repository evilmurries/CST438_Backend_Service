# CST438 Final Project - Libera Backend Service

Libera is a food ordering service web application composed of dedicated 
microservices. Backend service is primarily a RabbitMq microservice that
receives responses from order service. It houses these messages in a message
database.

## Usage

* The backend microservice should be ran after running order microservice.

* The application.properties file will need to be changed to contain your
MySQL database username and password.

* In the resources folder is a message.sql file. On each run this should
automatically create a schema called 'message'.
All messages will be housed in this schema in a table called 'message'.
