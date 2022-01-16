FROM openjdk:8
COPY target/LetsStart-0.0.1-SNAPSHOT.jar LetsStart-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/LetsStart-0.0.1-SNAPSHOT.jar"]

#docker build --tag=lets-start-java-sp-image:latest .
#docker run -p8080:8081 lets-start-java-sp-image:latest