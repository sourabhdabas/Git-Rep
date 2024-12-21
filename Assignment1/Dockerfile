# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the local Java program to the container
COPY .  /app


# Compile the Java program
RUN javac HelloDocker.java

# Command to run the compiled Java program
CMD ["java", "HelloDocker"]
