# Step 5 — Spring Boot & Controller (reseni)

## Co jsme udelali
- @RestController — trida prijima HTTP
- @GetMapping, @PostMapping, @DeleteMapping — HTTP metody
- @RequestBody — JSON body → Kotlin objekt
- @PathVariable — URL parametr → promenna
- Spring Boot automaticky spravuje ExpenseService (Dependency Injection)

## Jak spustit
```bash
./mvnw spring-boot:run
# Otevri http://localhost:8080/expenses
```

## Dalsi krok
Otevri `step-06-start/` pro SpringDoc / Swagger UI.
