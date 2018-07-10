#!/bin/bash

for PROJECT in $(ls -d kodando-*)
do
  echo "PUBLISHING $PROJECT"
  ./publish.sh "$PROJECT"
done
