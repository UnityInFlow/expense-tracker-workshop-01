# Step 6 — SpringDoc / Swagger UI

## Co budeme delat
Pridame Swagger UI — interaktivni dokumentaci API primo v prohlizeci.

## Jak spustit
1. Otevrete tuto slozku v IntelliJ IDEA (File → Open)
2. Pockejte az se stahnou zavislosti
3. Spustte: `./mvnw spring-boot:run`
4. Otevrete v prohlizeci: http://localhost:8080/swagger-ui.html

## Ukoly
1. Odkomentujte springdoc zavislost v `pom.xml`
2. Pridejte `@Tag` anotaci na tridu ExpenseController
3. Pridejte `@Operation(summary = "...")` ke kazdemu endpointu
