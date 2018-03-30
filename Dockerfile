FROM java:8-jre
ADD target/shipping-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","./shipping-0.0.1-SNAPSHOT.jar", "--port=80"]