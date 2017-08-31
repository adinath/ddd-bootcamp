# Dockerfile - totp service
FROM java:8-jre

ENV JAR_NAME eshop-order-1.0.jar

COPY libs/$JAR_NAME /$JAR_NAME

EXPOSE 8080 8080

ENTRYPOINT ["java", "-jar", "/eshop-order-1.0.jar"]
CMD []
