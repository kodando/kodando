#!/bin/bash

SPLIT_TAG=' ' read -r -a TAG_NAMES <<< $(git tag --list | sort -r | head -2)

EMPTY=""
SPACE=" "
DOTS=".."
SUFFIX="/build.gradle"
TAG_INTERVAL="${TAG_NAMES[0]}..${TAG_NAMES[1]}"

SPLIT=' ' read -r -a PROJECT_NAMES <<< $(git diff --summary --name-only ${TAG_INTERVAL} | grep -e "kodando\-.*/build.gradle")

for PROJECT_NAME in "${PROJECT_NAMES[@]}"
do
  PROJECT_NAME=${PROJECT_NAME/$SUFFIX/$EMPTY}
  ./publish.sh ${PROJECT_NAME}
done
