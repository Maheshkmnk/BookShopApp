# Stage 1: Build the Java application
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . /app
RUN mvn clean package -DskipTests

# Stage 2: Create a runtime image
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /app/target/BookShopApp-0.0.1-SNAPSHOT.war bookshopapp.war
EXPOSE 9999
ENTRYPOINT ["java", "-jar", "bookshopapp.war"]