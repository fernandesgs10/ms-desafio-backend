FROM maven:3.9.3-eclipse-temurin-17-alpine AS build
COPY . /home/desafio-backend
WORKDIR /home/desafio-backend

RUN mvn clean install

FROM bellsoft/liberica-openjdk-alpine:17.0.4
RUN addgroup desafiogroup && adduser --ingroup desafiogroup --disabled-password desafiofingers79
USER desafiofingers79

ENV SPRING_DATASOURCE_URL=jdbc:postgresql://postgresqldb:5432/db-desafio-backend
ENV SPRING_DATASOURCE_USERNAME=desafio
ENV SPRING_DATASOURCE_PASSWORD=desafio

ARG JAR_FILE=application/target/*.jar
COPY ${JAR_FILE} ms-desafio-backend.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/ms-desafio-backend.jar" ]