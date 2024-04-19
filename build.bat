REM Ctrl-A/C/V
mvn clean install
docker build -t 3scale-trf:iam_1.29 .
docker tag 3scale-trf:iam_1.29 quay.io/msentissi/3scale-trf:iam_1.29
docker push quay.io/msentissi/3scale-trf:iam_1.29
