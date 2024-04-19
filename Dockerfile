FROM registry.redhat.io/ubi8/openjdk-11:1.14-12
WORKDIR /opt/app
ARG JAR_FILE=target/Muis-Fuse-xQuery-transformation-1.0.0.jar
COPY ${JAR_FILE} app.jar
USER root
RUN mkdir -p /opt/app/sap-libs /certs /certs2
# keystore_rec_iam.jks can be used safely on prod, since not exposed
#COPY certs/certs_prod/keystore_prod_iam.jks /certs/keystore_iam.jks
#COPY certs/certs_rec/keystore_rec_iam.jks /certs/keystore_iam.jks
# Starting from 1.29, the file /certs/keystore_iam.jks and /certs2/openshift_iam.cer are expected to be mounted as a configMap, eg :
#    kubectl create configmap keystore-rec-iam-jks --from-file keystore_iam.jks
#    Then, in the deployment yaml :
#    spec:
#      volumes:
#        - name: keystore-rec-iam-jks
#          configMap:
#            name: keystore-rec-iam-jks
#            defaultMode: 420
#      containers:
#          volumeMounts:
#            - name: keystore-rec-iam-jks
#              mountPath: /certs

#COPY certs/certs_prod/openshift_iam_prod.cer /certs2/openshift_iam.cer
#COPY certs/certs_rec/openshift_iam_rec.cer /certs2/openshift_iam.cer
#COPY soatest.cer /tmp

# Copy the entrypoint script into the image
COPY /entrypoint.sh /usr/local/bin/entrypoint.sh
RUN chmod 777 /etc/java/java-11-openjdk/java-11-openjdk-11.0.18.0.10-2.el8_7.x86_64/lib/security/cacerts
RUN chmod +x /usr/local/bin/entrypoint.sh

#RUN keytool -import -noprompt -deststorepass changeit -alias openshift -file /certs2/openshift_iam.cer -keystore /etc/java/java-11-openjdk/java-11-openjdk-11.0.18.0.10-2.el8_7.x86_64/lib/security/cacerts
#RUN keytool -import -noprompt -deststorepass changeit -alias openshift -file /tmp/openshift_iam_rec.cer -keystore /etc/java/java-11-openjdk/java-11-openjdk-11.0.18.0.10-2.el8_7.x86_64/lib/security/cacerts

#RUN keytool -import -noprompt -deststorepass changeit -alias soatest -file /tmp/soatest.cer -keystore /etc/java/java-11-openjdk/java-11-openjdk-11.0.18.0.10-2.el8_7.x86_64/lib/security/cacerts
#RUN keytool -import -noprompt -deststorepass changeit -alias openshift -file /tmp/openshift.cer -keystore /etc/pki/ca-trust/extracted/java/cacerts
#RUN keytool -import -noprompt -deststorepass changeit -alias openshift -file /tmp/openshift.cer -keystore /etc/pki/java/cacerts

ENTRYPOINT ["sh", "/usr/local/bin/entrypoint.sh"]

#CMD ["java","-jar","app.jar"] # Now called from entrypoint.sh

# mvn spring-boot:run
# mvn clean install

# Start Docker deamon
# docker build -t 3scale-trf:iam_1.29 .
# Tag it and push to quay
# docker tag 3scale-trf:iam_1.29 quay.io/msentissi/3scale-trf:iam_1.29
# docker push quay.io/msentissi/3scale-trf:iam_1.29
# OR tag it and push to dockerhub
# docker push msentissi/3scale-trf:1.5