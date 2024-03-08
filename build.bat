REM Ctrl-A/C/V
mvn clean install
docker build -t 3scale-trf:iam_1.28.1-rec .
docker tag 3scale-trf:iam_1.28.1-rec quay.io/msentissi/3scale-trf:iam_1.28.1-rec
docker push quay.io/msentissi/3scale-trf:iam_1.28.1-rec
