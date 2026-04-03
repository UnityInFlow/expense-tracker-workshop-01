# Step 5 — Spring Boot Controller

## Co budeme delat
Pridame REST Controller — aplikace zacne prijímat HTTP requesty.

## Jak spustit
1. Otevrete tuto slozku v IntelliJ IDEA (File → Open)
2. Pockejte az se stahnou zavislosti
3. Spustte: `./mvnw spring-boot:run`
4. Otevrete v prohlizeci: http://localhost:8080/expenses

## Ukoly
Otevrete `src/main/kotlin/dev/workshop/expense/ExpenseController.kt` a doplnte anotace a metody.

## Testovani API
```bash
# Pridat vydaj
curl -X POST http://localhost:8080/expenses \
  -H "Content-Type: application/json" \
  -d '{"description":"Obed","amount":150}'

# Zobrazit vsechny
curl http://localhost:8080/expenses

# Celkova suma
curl http://localhost:8080/expenses/total
```
