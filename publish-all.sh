#!/bin/bash

./gradlew clean build
set -o pipefail

for PROJECT in $(ls -d kodando-*)
do
  ./gradlew -p ${PROJECT} -PbintrayUser=${BINTRAY_USERNAME} -PbintrayKey=${BINTRAY_PASSKEY} bintrayUpload
done
