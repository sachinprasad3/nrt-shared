FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/order-service.jar app.jar

EXPOSE 7001

ENTRYPOINT ["java", "-jar", "app.jar"]