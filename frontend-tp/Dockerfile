FROM maven:3.8.3-jdk-11 AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package

FROM openjdk:11
RUN useradd -ms /bin/bash frontendusr
USER frontendusr
WORKDIR /home/frontendusr
COPY --from=build /usr/src/app/target/frontend-tp-0.0.1-SNAPSHOT.jar /usr/app/frontend-tp-0.0.1-SNAPSHOT
EXPOSE 9798
ENTRYPOINT ["java","-jar","/usr/app/frontend-tp-0.0.1-SNAPSHOT"]