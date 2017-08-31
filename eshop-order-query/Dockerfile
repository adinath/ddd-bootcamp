# Dockerfile - totp service
FROM java:8-jre

ENV JAR_NAME eshop-order-query.jar

COPY libs/$JAR_NAME /$JAR_NAME

EXPOSE 8080 8080

ENTRYPOINT ["java", "-jar", "/eshop-order-query.jar"]
CMD []
