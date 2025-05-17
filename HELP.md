# Runners

## 🚀 Running in Development

### 1. Start the local PostgreSQL database

Runs a Docker container with PostgreSQL and exposes it on port `5432`.

```bash
docker compose -f docker-compose.pg.yaml up -d
```

> Uses default credentials configured in application-dev.properties.
> Never use the same credentials in PROD!!

### 2. Run the app

```bash
./gradlew bootRun -Dspring.profiles.active=dev
```

## 📦 Running in Production (Dockerized)

```bash
docker build -t country-api .
docker run -d \
  -e DB_HOST=${DB_HOST} \
  -e DB_PORT=${DB_PORT} \
  -e DB_NAME=${DB_NAME} \
  -e DB_USER=${DB_USER} \
  -e DB_PASS=${DP_PASS} \
  -p 8080:8080 \
  country-api
  ```
> DB credentials are passed as environment variables. Never stored in source code.
