# Container for Spring Boot
FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=build/libs/countries-api.jar
COPY ${JAR_FILE} countries-api.jar
ENTRYPOINT ["java","-jar","/countries-api.jar"]