FROM openjdk:17
EXPOSE 8080
ADD target/form-automation.jar form-automation.jar
ENTRYPOINT ["java","-jar","/form-automation.jar.original"]