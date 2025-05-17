FROM openjdk:17-jdk-slim
ARG JAR_FILE=build/libs/countries-api.jar
COPY ${JAR_FILE} countries-api.jar
ENTRYPOINT ["java","-jar","/countries-api.jar"]

# expose the api port
EXPOSE 8080
