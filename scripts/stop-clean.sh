#!/bin/bash
cd "$(dirname "$0")" || exit

# deletes the volume
docker compose -f ../docker-compose.yaml down -v
