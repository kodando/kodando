#!/bin/bash

SPLIT=' ' read -r -a projectNames <<< $(git diff --summary --name-only HEAD~1 | grep -e "kodando\-.*/build.gradle")

for projectName in "${projectNames[@]}"
do
  suffix="/build.gradle"
  empty=""
  projectName=${projectName/$suffix/$empty}

  ./publish.sh ${projectName}
done
