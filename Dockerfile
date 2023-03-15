FROM registry.redhat.io/ubi8/openjdk-11:1.14-12
WORKDIR /opt/app
ARG JAR_FILE=target/Muis-Fuse-xQuery-transformation-1.0.0.jar
COPY ${JAR_FILE} app.jar
COPY keystore_iam.jks /
COPY openshift_iam.cer /tmp
USER root
RUN keytool -import -noprompt -deststorepass changeit -alias openshift -file /tmp/openshift_iam.cer -keystore /etc/java/java-11-openjdk/java-11-openjdk-11.0.18.0.10-2.el8_7.x86_64/lib/security/cacerts
#RUN keytool -import -noprompt -deststorepass changeit -alias openshift -file /tmp/openshift.cer -keystore /etc/pki/ca-trust/extracted/java/cacerts
#RUN keytool -import -noprompt -deststorepass changeit -alias openshift -file /tmp/openshift.cer -keystore /etc/pki/java/cacerts
ENTRYPOINT ["java","-jar","app.jar"]

# mvn spring-boot:run
# mvn clean install

# Start Docker deamon
# docker build -t iam-complex-trf:iam_1.9 .
# Tag it and push to quay
# docker tag iam-complex-trf:iam_1.9 quay.io/msentissi/iam-complex-trf:iam_1.9
# docker push quay.io/msentissi/iam-complex-trf:iam_1.9
# OR tag it and push to dockerhub
# docker push msentissi/iam-complex-trf:1.5