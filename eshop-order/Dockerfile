# Dockerfile - totp service
FROM java:8-jre

ENV JAR_NAME eshop-order.jar

COPY libs/$JAR_NAME /$JAR_NAME

EXPOSE 8081 8081

ENTRYPOINT ["java", "-jar", "/eshop-order.jar"]
CMD []
