#!/bin/bash
#keytool -import -noprompt -deststorepass changeit -alias openshift -file /certs2/openshift_iam.cer -keystore /etc/java/java-11-openjdk/java-11-openjdk-11.0.18.0.10-2.el8_7.x86_64/lib/security/cacerts
#whoami
cd /etc/java/java-11-openjdk/java-11-openjdk-11.0.18.0.10-2.el8_7.x86_64/lib/security
#ls -lrt
#ls -lrt /certs2
keytool -import -cacerts -noprompt -trustcacerts -deststorepass changeit -alias openshift -file /certs2/openshift_iam.cer

java -jar /opt/app/app.jar