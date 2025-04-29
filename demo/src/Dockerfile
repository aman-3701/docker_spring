# Step 1: Use official OpenJDK image as a base
FROM openjdk:17-jdk-slim as build

# Step 2: Set the working directory inside the Docker container
WORKDIR /app

# Step 3: Copy your built .jar file into the container (replace 'target/my-app.jar' with your actual path)
COPY target/my-app.jar app.jar

# Step 4: Run the Spring Boot application with Java
ENTRYPOINT ["java", "-jar", "app.jar"]

# Expose the port your Spring Boot app will run on (default 8080)
EXPOSE 8080
