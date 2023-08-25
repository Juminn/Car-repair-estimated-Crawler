FROM azul/zulu-openjdk:17
ADD build/libs/crawler-0.0.1-SNAPSHOT.jar crawler-springboot.jar

EXPOSE 80

ENTRYPOINT ["java", "-jar", "/crawler-springboot.jar"]

