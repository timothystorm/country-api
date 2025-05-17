# 🌍 Country API

A Spring Boot microservice for managing and querying country and regional data, including capitals, altitudes,
population, and land area. Designed to demonstrate practical microservice architecture, containerization, and cloud
deployment skills.

---

## 🧩 Features

- RESTful API for country and regional data
- PostgreSQL-backed persistence
- Dev/Prod profile separation
- Dockerized for local and cloud deployment
- Cloud-ready: tested on AWS EC2 and Azure Virtual Machines

---

## 🛠️ Tech Stack

| Layer      | Tech                      |
|------------|---------------------------|
| Backend    | Spring Boot (Gradle)      |
| Database   | PostgreSQL (Dockerized)   |
| Container  | Docker                    |
| Deployment | AWS EC2, Azure VM         |
| CI/CD      | GitHub Actions (optional) |

---

## 🚀 Running in Development

### 1. Start the local PostgreSQL database

Runs a Docker container with PostgreSQL and exposes it on port `5432`.

```bash
./start-db-container.sh
```

> Uses default credentials configured in application-dev.properties.
> Never use the same credentials in PROD!!

### Run the app

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

## ☁️ Cloud Deployment

This app is designed for deployment via GitHub Actions to either:

- AWS EC2: Using SSH + Docker
- Azure VM: Using SSH + Docker

Includes CI/CD examples that:

- Build the Docker image
- Copy it to the VM
- Run the container with environment-injected DB credentials

## 📚 API Overview

| Method | Endpoint                   | Description               |
|--------|----------------------------|---------------------------|
| GET    | /api/regionalentities      | Get all regions           |
| POST   | /api/regionalentities      | Add a new regional entity |
| PUT    | /api/regionalentities      | Update an existing entity |
| DELETE | /api/regionalentities/{id} | Delete a region by ID     |

## 💡 Skills Demonstrated

- Clean REST API design
- JPA with PostgreSQL
- Docker containerization and orchestration
- Environment-based Spring profiles
- CI/CD automation via GitHub Actions
- Cloud-native architecture on both AWS and Azure
- Secure configuration practices (no credentials in repo)

## 📌 TODO / Future Enhancements

- Add unit and integration tests
- Add Swagger/OpenAPI documentation
- Add auth with Spring Security or JWT
- CI pipeline to spin up VMs on demand

## 🧠 Why This Project?

This project was built to showcase end-to-end backend development and deployment expertise, particularly in:

- Real-world microservice setup
- Secure and portable deployment pipelines
- Hands-on cloud and Docker experience

## 🏛️ Architecture

![Architectural Diagram](./docs/spring_boot.architecture.png "Architectural Diagram")