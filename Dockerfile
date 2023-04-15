FROM openjdk:17-alpine

WORKDIR /app

ARG JAR_FILE=target/BookCI-*.jar

COPY ${JAR_FILE} BookCI.jar

CMD ["java","-jar","-Xmx1024M","/app/BookCI.jar"]

EXPOSE 8090