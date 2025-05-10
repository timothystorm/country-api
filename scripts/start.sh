#!/bin/bash
cd "$(dirname "$0")" || exit

(cd .. && ./gradlew clean build)
docker compose -f ../docker-compose.yaml up -d --build