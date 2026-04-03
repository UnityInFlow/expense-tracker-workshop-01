# Step 5 — Spring Boot Controller

## What we will do
We will add a REST Controller — the application will start accepting HTTP requests.

## How to run
1. Open this folder in IntelliJ IDEA (File → Open)
2. Wait for dependencies to download
3. Run: `./mvnw spring-boot:run`
4. Open in browser: http://localhost:8080/expenses

## Tasks
Open `src/main/kotlin/dev/workshop/expense/ExpenseController.kt` and fill in the annotations and methods.

## Testing the API
```bash
# Add an expense
curl -X POST http://localhost:8080/expenses \
  -H "Content-Type: application/json" \
  -d '{"description":"Lunch","amount":150}'

# Show all
curl http://localhost:8080/expenses

# Total sum
curl http://localhost:8080/expenses/total
```
