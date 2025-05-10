# Use Maven with JDK 17 (universal, ARM-compatible image)
FROM maven:3.9.6-eclipse-temurin-17

# Set working directory
WORKDIR /app

# Copy all files from your local project into the container
COPY . .

# Run Maven tests on Selenium Grid
CMD ["mvn", "clean", "test", "-DuseGrid=true"]
