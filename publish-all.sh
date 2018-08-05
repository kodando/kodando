#!/bin/bash

./gradlew clean build

publish()
{
  ./gradlew -p $1 -PbintrayUser=${BINTRAY_USERNAME} -PbintrayKey=${BINTRAY_PASSKEY} bintrayUpload > /dev/null && echo "Published $1"
}

for PROJECT in $(ls -d kodando-*)
do
  publish "$PROJECT"
done
