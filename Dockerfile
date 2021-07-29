FROM openjdk:14-jdk
COPY target/fakeload-docker-0.0.1-jar-with-dependencies.jar /fakeload.jar
ENTRYPOINT ["java", "-jar", "/fakeload.jar"]
