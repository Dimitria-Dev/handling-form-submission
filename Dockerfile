FROM openjdk:17
EXPOSE 8080
ADD target/form-automation.jar.original form-automation.jar.original
ENTRYPOINT ["java","-jar","/form-automation.jar"]