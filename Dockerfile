FROM maven:3.8.5-openjdk-17 AS build
COPY ..
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/BookShopApp-0.0.1-SNAPSHOT.war bookshopapp.war
EXPOSE 9999
ENTRYPOINT ["java", "-war", "bookshopapp.war"]