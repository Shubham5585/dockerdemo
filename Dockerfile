# Use an official OpenJDK runtime as the base image
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container at the defined working directory
COPY target/dockerdemo-0.0.1-SNAPSHOT.jar .

# Expose the port your application runs on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "dockerdemo-0.0.1-SNAPSHOT.jar"]
