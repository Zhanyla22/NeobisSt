FROM openjdk:18
ADD target/shop-dockerfile.jar shop.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/shop.jar"]