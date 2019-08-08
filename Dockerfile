FROM maven:3.5.4-jdk-8-alpine AS builder
WORKDIR /app
ADD pom.xml .
RUN mvn verify clean --fail-never
COPY . .
RUN mvn clean install -DskipTests

FROM openjdk:8-jdk-8-alpine

EXPOSE 8085
COPY --from=builder /app/target/capa2019-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]
