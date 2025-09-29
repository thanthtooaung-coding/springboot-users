# ========================
# 1. Build Stage
# ========================
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# Copy pom.xml and download dependencies first (for caching)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy the source code
COPY src ./src

# Package the application (skip tests for faster build, remove -DskipTests if you want tests)
RUN mvn clean package -DskipTests

# ========================
# 2. Runtime Stage
# ========================
FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app

# Copy the built jar from build stage
COPY --from=build /app/target/springboot-users-0.0.1-SNAPSHOT.jar app.jar

# Expose the app port
EXPOSE 3000

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
