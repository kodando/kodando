#!/bin/bash

./gradlew -p $1 -PbintrayUser=$BINTRAY_USERNAME -PbintrayKey=$BINTRAY_PASSKEY build bintrayUpload
