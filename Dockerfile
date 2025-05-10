FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY build/libs/*.jar application.jar
ENTRYPOINT ["java", "-Xmx2048M", "-jar","/application.jar"]