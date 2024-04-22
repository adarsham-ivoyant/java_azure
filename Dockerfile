FROM openjdk:17
EXPOSE 8080
ADD target/JavaAzContainer-0.0.1-SNAPSHOT.jar JavaAzContainer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/JavaAzContainer-0.0.1-SNAPSHOT.jar"]