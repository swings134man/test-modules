FROM openjdk:17-jdk

WORKDIR /application

COPY build/libs/server-one-0.0.1-SNAPSHOT-plain.jar /application/server-one.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "server-one.jar"]