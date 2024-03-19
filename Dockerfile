# Use Maven to build the application
FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

# Use OpenJDK to run the application
FROM openjdk:11
EXPOSE 8081
COPY --from=build /app/target/bankingdashboard-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
