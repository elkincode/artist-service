FROM openjdk:17
ARG JAR_FILE=./build/libs/artist-service-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} artist-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","artist-service-0.0.1-SNAPSHOT.jar"]
EXPOSE 8082