# Step 3 — List a HashMap (reseni)

## Co jsme udelali
- HashMap<Int, Expense> = key-value uloziste (jako Redis, ENV variables)
- HashMap najde podle klice okamzite — O(1), List musi prochazet vse
- Null safety: database[999] vrati null, ne chybu
- ?. safe call operator — bezpecny pristup k nullable hodnotam
- Kotlin nas nuti osetrovat null explicitne — to je vyhoda

## Dalsi krok
Otevri `step-04-start/` pro Service class.
