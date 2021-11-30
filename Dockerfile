FROM openjdk:17 as builder
WORKDIR /casket
COPY mvnw .
COPY .mvn ./.mvn
COPY . /casket
RUN ./mvnw install -DskipTests
RUN ls -la


FROM openjdk:17
EXPOSE 8080
COPY --from=builder /casket/target/cloudWatchDemo-0.0.1-SNAPSHOT.jar ./app.jar
ENTRYPOINT ["java","-jar","/app.jar"]