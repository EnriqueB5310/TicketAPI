FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar TicketAPI.jar
ENTRYPOINT ["java","-jar","/TicketAPI.jar"]
EXPOSE 8080