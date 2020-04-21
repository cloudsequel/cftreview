FROM java:8
VOLUME /tmp
ADD  /target/cloud-formation-rule-engine-0.0.1-SNAPSHOT.jar cloud-formation-rule-engine.jar
RUN bash -c 'touch /cloud-formation-rule-engine.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cloud-formation-rule-engine.jar"]
EXPOSE 8080
