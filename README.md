# Step 5 — Spring Boot Controller (solution)

## What we did
- @RestController = class accepts HTTP requests
- @RequestMapping = base URL for all endpoints
- @GetMapping / @PostMapping / @DeleteMapping = HTTP methods
- @RequestBody = JSON body → Kotlin object
- @PathVariable = {id} from URL
- ResponseEntity = HTTP response with status code

## How to test
```bash
# Add expenses
curl -X POST http://localhost:8080/expenses \
  -H "Content-Type: application/json" \
  -d '{"description":"Lunch","amount":150}'

curl -X POST http://localhost:8080/expenses \
  -H "Content-Type: application/json" \
  -d '{"description":"Coffee","amount":50}'

# Show all
curl http://localhost:8080/expenses

# Find by ID
curl http://localhost:8080/expenses/1

# Total sum
curl http://localhost:8080/expenses/total

# Delete
curl -X DELETE http://localhost:8080/expenses/1
```

## Next step
Open `step-06-start/` for Swagger UI documentation.
