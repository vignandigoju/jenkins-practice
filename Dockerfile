FROM openjdk:18-jdk-slim
EXPOSE 9090
ADD target/testjar-jenkins.jar testjar-jenkins.jar
ENTRYPOINT ["java","-jar","/testjar-jenkins.jar"]