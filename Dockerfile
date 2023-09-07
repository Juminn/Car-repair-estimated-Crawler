FROM azul/zulu-openjdk:17
ADD build/libs/crawler-0.0.1-SNAPSHOT.jar crawler-springboot.jar
EXPOSE  8080
ENTRYPOINT ["java", "-jar", "/crawler-springboot.jar"]

