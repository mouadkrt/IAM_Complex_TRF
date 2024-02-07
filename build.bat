REM Ctrl-A/C/V
mvn clean install
docker build -t 3scale-trf:iam_1.27 .
docker tag 3scale-trf:iam_1.27 quay.io/msentissi/3scale-trf:iam_1.27
docker push quay.io/msentissi/3scale-trf:iam_1.27
