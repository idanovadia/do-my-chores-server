FROM openjdk:15-jdk-alpine
EXPOSE 8080
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} do-my-chores-server.jar
ENTRYPOINT ["java","-jar","/do-my-chores-server.jar"]