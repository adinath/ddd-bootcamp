#!/usr/bin/env bash

PROJ_DIR="$1"

cd $PROJ_DIR

echo 'building ' $PROJ_DIR

./gradlew clean build copydockerfile

echo 'building docker image'
docker build -t $PROJ_DIR-image ./build/
