FROM adoptopenjdk/openjdk11:jdk-11.0.5_10-alpine
ADD . /src
WORKDIR /src
#RUN ./mvn package -DskipTests

ENTRYPOINT ["java","-jar","skills-0.0.1-SNAPSHOT.jar"]






