# Runners

## 👷 Running in Development

### 1. 🐘 Start PostgreSQL (container)

```bash
docker compose -f docker-compose.pg.yaml up -d
```

### 2. ✨ Start the app

```bash
./gradlew bootRun
```

### 3. 🛑 Stop PostgreSQL (optional)

```bash
docker compose -f docker-compose.pg.yaml down
```

## 🐳 Running in a container

### 1. 🛠️ Build the app

```bash
./gradlew bootJar -x test --rerun-tasks
```

### 🕸️ 2. Build network bridge

Only needs to be built 1x.

> Need to create a network bridge to allow for cross container communication

```bash
./build-network-bridge.sh country-network
```

### 3. 🚀 Build and run container

```bash
docker compose up --build -d
```

> The api is served on port 8080 - http://localhost:8080/api/regionalentities

### 4. 🛑 Stop the container

```bash
docker compose down
```

### 5. 🪓 Stop network bridge (optional)

```bash
docker network rm country-network
```