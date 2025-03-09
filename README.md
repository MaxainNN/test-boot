# Test Spring Boot App

## Stack:
- `Java` <img src='images/icons8-java-48.png' alt='Java' width='28' height='28'> 21 version
- `Maven` <img src='images/icons8-maven.png' alt='Maven' width='28' height='28'> 3.9.8 version
- `Spring` <img src='images/spring_icon.png' alt='Spring' width='28' height='28'> 3.3.5 version
- `Docker` <img src='images/docker_icon.png' alt='Docker' width='28' height='28'> 27.1.1 version

## Description:
This is the example application in Spring Boot with the basic concepts

Before run app need this command :

````
docker pull postgres
docker run --name spring-boot-postgres -p 5432:5432 -e POSTGRES_PASSWORD=root -d postgres
````

## Create new employee:

<img src='images/spring_boot_example.png' alt='Request_post' width='800' height='300'>

## TODO:
1) Add tests
2) Add more logic (more entities)
3) Rewrite/Remove `EmployeeConfig` where some users hardcoded.
4) Maybe add services , that could 
5) Add Docker file and refactor logic with database

## Useful resources:
- https://www.youtube.com/watch?v=mN0hf-r1XbI&t=5697s - initial code from here

## Author - Maxim Kalugin