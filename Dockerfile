FROM registry.redhat.io/ubi8/openjdk-11:1.14-12
WORKDIR /opt/app
ARG JAR_FILE=target/Muis-Fuse-xQuery-transformation-1.0.0.jar
COPY ${JAR_FILE} app.jar
USER root
RUN mkdir -p /opt/app/sap-libs /certs
# keystore_rec_iam.jks can be used safely on prod, since not exposed
#COPY certs/certs_prod/keystore_prod_iam.jks /certs/keystore_iam.jks
COPY certs/certs_rec/keystore_rec_iam.jks /certs/keystore_iam.jks

#COPY certs/certs_prod/openshift_iam_prod.cer /tmp/openshift_iam.cer
COPY certs/certs_rec/openshift_iam_rec.cer /tmp/openshift_iam.cer
#COPY soatest.cer /tmp

RUN keytool -import -noprompt -deststorepass changeit -alias openshift -file /tmp/openshift_iam.cer -keystore /etc/java/java-11-openjdk/java-11-openjdk-11.0.18.0.10-2.el8_7.x86_64/lib/security/cacerts
#RUN keytool -import -noprompt -deststorepass changeit -alias openshift -file /tmp/openshift_iam_rec.cer -keystore /etc/java/java-11-openjdk/java-11-openjdk-11.0.18.0.10-2.el8_7.x86_64/lib/security/cacerts

#RUN keytool -import -noprompt -deststorepass changeit -alias soatest -file /tmp/soatest.cer -keystore /etc/java/java-11-openjdk/java-11-openjdk-11.0.18.0.10-2.el8_7.x86_64/lib/security/cacerts
#RUN keytool -import -noprompt -deststorepass changeit -alias openshift -file /tmp/openshift.cer -keystore /etc/pki/ca-trust/extracted/java/cacerts
#RUN keytool -import -noprompt -deststorepass changeit -alias openshift -file /tmp/openshift.cer -keystore /etc/pki/java/cacerts
ENTRYPOINT ["java","-jar","app.jar"]

# mvn spring-boot:run
# mvn clean install

# Start Docker deamon
# docker build -t 3scale-trf:iam_1.28.1-rec .
# Tag it and push to quay
# docker tag 3scale-trf:iam_1.28.1-rec quay.io/msentissi/3scale-trf:iam_1.28.1-rec
# docker push quay.io/msentissi/3scale-trf:iam_1.28.1-rec
# OR tag it and push to dockerhub
# docker push msentissi/3scale-trf:1.5