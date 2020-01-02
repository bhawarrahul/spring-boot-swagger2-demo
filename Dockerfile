FROM openjdk:8-jdk-alpine
COPY target/Swagger2.demo1-0.0.1-SNAPSHOT.jar Swagger2.demo1-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/Swagger2.demo1-0.0.1-SNAPSHOT.jar"]

#docker build -t dockerswagger2demoapp .
#docker run -d --network host dockerswagger2demoapp