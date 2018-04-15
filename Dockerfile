FROM openjdk
MAINTAINER chandrakanth peravelli <chandrakanthperavelli@gmail.com>
ADD target/helloworld.jar helloworld.jar
ENTRYPOINT ["java", "-jar", "/helloworld.jar"]
EXPOSE 2080