#!/usr/bin/env bash

PROJ_DIR="$1"
PORT="$2"

echo 'creating ' $PROJ_DIR

mkdir $PROJ_DIR

cd $PROJ_DIR

mkdir -p src/main/java
mkdir -p src/test/java

cp ../sample-domain/build.gradle .

echo '# Dockerfile - totp service
FROM java:8-jre

ENV JAR_NAME '$PROJ_DIR'.jar

COPY libs/$JAR_NAME /$JAR_NAME

EXPOSE '$PORT $PORT'

ENTRYPOINT ["java", "-jar", "/'$PROJ_DIR'.jar"]
CMD []' >> Dockerfile

echo 'created'
