FROM openjdk
MAINTAINER chandrakanth peravelli <chandrakanthperavelli@gmail.com>
ADD target/helloworld-0.0.1-SNAPSHOT.jar helloworld-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/helloworld-0.0.1-SNAPSHOT.jar"]
EXPOSE 2080