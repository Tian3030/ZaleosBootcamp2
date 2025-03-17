# OpenJDK runtime
FROM openjdk:21-jdk

# Working directory
WORKDIR /app

# Copy JAR file into the container
COPY target/*.jar app.jar

# Application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

