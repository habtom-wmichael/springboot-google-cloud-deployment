FROM openjdk:7
ADD target/spring-boot-greeting-app.jar spring-boot-greeting-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-boot-greeting-app.jar"]
