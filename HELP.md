# Runners

## 🚀 Running in Development

### Start the PostgreSQL container

```bash
docker compose -f docker-compose.pg.yaml up -d
```

### 🛑 Stop PostgreSQL container

```bash
docker compose -f docker-compose.pg.yaml down
```

### Start the app

```bash
./gradlew bootRun -Dspring.profiles.active=dev
```

## 🐳 Running in Production (Dockerized)

### 🛠️ 1. Build for production

```bash
./gradlew bootJar -x test
```

> It is assumed tests are run in the ci/cd pipeline before packing the container

### 🚀 2. Run the container

```bash
./build-network-bridge.sh && docker compose up --build -d
```

> - Need to create a network bridge to allow for cross container communication
> - The api app is served on port 8080
> - DB settings are pulled by `docker compose` as `.env` variables.

### 🛑 3. Stop the container

```bash
docker compose down
```