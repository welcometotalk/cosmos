FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} cosmos.jar
ENTRYPOINT ["java","-jar","/cosmos.jar"]