# Step 4 — Service class (solution)

## What we did
- class ExpenseService — all logic in one place
- private = hidden details (database, nextId)
- SRP — each class does one thing

## Architecture

```
main() or Controller
       │
       ▼
  ExpenseService          ← logic here
  + add / getAll / delete
  - database (hidden)
       │
       ▼
  HashMap<Int, Expense>   ← in Session 2 we replace with SQLite
```

## Next step
Open `step-05-start/` for Spring Boot Controller.
From this step we will have an HTTP API!
