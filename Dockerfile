FROM openjdk:8
COPY target/LetsStart-0.0.1-SNAPSHOT.jar LetsStart-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/LetsStart-0.0.1-SNAPSHOT.jar"]