# Step 6 — SpringDoc / Swagger UI

## What we will do
We will add Swagger UI — interactive API documentation directly in the browser.

## How to run
1. Open this folder in IntelliJ IDEA (File → Open)
2. Wait for dependencies to download
3. Run: `./mvnw spring-boot:run`
4. Open in browser: http://localhost:8080/swagger-ui.html

## Tasks
1. Uncomment the springdoc dependency in `pom.xml`
2. Add `@Tag` annotation to the ExpenseController class
3. Add `@Operation(summary = "...")` to each endpoint
