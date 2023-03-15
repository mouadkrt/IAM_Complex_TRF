keytool -genkey -alias iam-complex-trf -keyalg RSA -keypass changeit -storepass changeit -keystore keystore_iam.jks


keytool.exe -import -file openshift.apps.munisyslab.munisys.net.ma.pem -alias openshift_certif -keystore keystore_iam.jks -deststorepass changeit

keytool -list -keystore keystore_iam.jks

openssl pkcs12 -export -in openshift.pem -inkey openshift_key.pem -out opensift.p12 -name "openshift"

keytool -importkeystore -srckeystore opensift.p12 -srcstoretype pkcs12 -destkeystore keystore_iam.jks