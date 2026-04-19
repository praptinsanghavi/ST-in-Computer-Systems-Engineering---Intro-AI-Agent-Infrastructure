FROM eclipse-temurin:11-jdk-jammy AS builder
WORKDIR /app
COPY apache-maven-3.9.6 /opt/maven
COPY pom.xml .
COPY src ./src
RUN /opt/maven/bin/mvn package -Dmaven.test.skip=true -q

FROM eclipse-temurin:11-jre-jammy
WORKDIR /app
COPY --from=builder /app/target/supply-chain-system-1.0.0.jar app.jar
EXPOSE 8080 2551 2552
ENTRYPOINT ["java", "-jar", "app.jar"]
