# Step 4 — Service class (reseni)

## Co jsme udelali
- class ExpenseService — veskera logika na jednom miste
- private = skryte detaily (database, nextId)
- SRP — kazda trida dela jednu vec

## Architektura

```
main() nebo Controller
       │
       ▼
  ExpenseService          ← logika tady
  + add / getAll / delete
  - database (skryto)
       │
       ▼
  HashMap<Int, Expense>   ← v Session 2 vymename za SQLite
```

## Dalsi krok
Otevri `step-05-start/` pro Spring Boot Controller.
Od tohoto kroku budeme mit HTTP API!
