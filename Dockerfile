FROM openjdk:17

ARG JAR_PATH=target/*.jar

COPY ${JAR_PATH} finance-service.jar

EXPOSE  8082

ENTRYPOINT ["java", "-jar", "/finance-service.jar"]