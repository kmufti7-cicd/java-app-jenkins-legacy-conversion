
FROM maven:3.6.3 as maven
COPY . /app
WORKDIR /app
RUN mvn clean package

FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY --from=maven /app/target/GreetingApplication.jar GreetingApplication.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/GreetingApplication.jar"]
