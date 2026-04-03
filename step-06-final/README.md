# Step 6 — SpringDoc / Swagger UI (reseni)

## Co jsme udelali
- SpringDoc automaticky generuje OpenAPI specifikaci z kodu
- Swagger UI na http://localhost:8080/swagger-ui.html
- @Operation — popis endpointu v Swagger UI
- @Tag — skupiny endpointu

## FINALNI STAV SESSION 1

Kompletni REST API s dokumentaci. Jeden problem: data zmizi po restartu!
To opravime v Session 2 (expense-tracker-workshop-02).

## Rekapitulace
```
Step 1: val/var, fun       → pojmenovani dat a akci
Step 2: data class         → strukturovany model
Step 3: HashMap            → in-memory databaze
Step 4: Service            → logika na jednom miste
Step 5: @RestController    → HTTP API
Step 6: SpringDoc          → API dokumentace + Swagger UI
```
