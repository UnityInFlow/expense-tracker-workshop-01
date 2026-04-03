# Step 5 — Spring Boot Controller (reseni)

## Co jsme udelali
- @RestController = trida prijima HTTP requesty
- @RequestMapping = bazova URL pro vsechny endpointy
- @GetMapping / @PostMapping / @DeleteMapping = HTTP metody
- @RequestBody = JSON body → Kotlin objekt
- @PathVariable = {id} z URL
- ResponseEntity = HTTP odpoved se status kodem

## Jak otestovat
```bash
# Pridat vydaje
curl -X POST http://localhost:8080/expenses \
  -H "Content-Type: application/json" \
  -d '{"description":"Obed","amount":150}'

curl -X POST http://localhost:8080/expenses \
  -H "Content-Type: application/json" \
  -d '{"description":"Kava","amount":50}'

# Zobrazit vsechny
curl http://localhost:8080/expenses

# Najit podle ID
curl http://localhost:8080/expenses/1

# Celkova suma
curl http://localhost:8080/expenses/total

# Smazat
curl -X DELETE http://localhost:8080/expenses/1
```

## Dalsi krok
Otevri `step-06-start/` pro Swagger UI dokumentaci.
