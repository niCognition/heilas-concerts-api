# heilas-concerts-api
simple rest api with crud operations using spring boot and hibernate

## Needed to run:
a postgresql database then change the url to your database-url or simply create a postgresql database called heilas_concert running on port localhost:5432.

## How to run:
Open the project in your prefered IDEA I used IntelliJ.
Download the maven dependencies and run the project with your database up.

When the project runs your database will be populated with the specified tables and columns.

## This String in application.properties is what's used to specify the location of your database:
spring.datasource.url=jdbc:postgresql://localhost:5432/heilas_concert
