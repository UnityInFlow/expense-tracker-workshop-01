data class Expense(
    val id: Int,
    val description: String,
    val amount: Int,
    val date: String
)

fun main() {
    // ============================================
    // Step 3: HashMap jako databaze
    // ============================================

    // --- Ukol 1: Vytvor HashMap a pridej vydaje ---
    // TODO: Vytvor val database = HashMap<Int, Expense>()
    // TODO: Pridej 4 vydaje s id 1-4
    //       Hint: database[1] = Expense(1, "Obed", 150, "2024-01-15")

    // --- Ukol 2: Vypis pocet ---
    // TODO: Vytiskni pocet vydaju (database.size)

    // --- Ukol 3: Najdi vydaj podle ID ---
    // TODO: Najdi vydaj s ID 2 a vytiskni jeho popis
    //       Pouzij ?. (safe call): database[2]?.description
    // TODO: Zkus najit ID 999 — co se stane?

    // --- Ukol 4: Vypis vsechny vydaje ---
    // TODO: Projdi vsechny vydaje a vytiskni:
    //       "ID <id>: <description> — <amount> Kc"
    //       Hint: for (expense in database.values) { ... }

    // --- Ukol 5: Smaz a pocitej ---
    // TODO: Smaz vydaj s ID 1 (database.remove(1))
    // TODO: Vytiskni novy pocet

    // --- Bonus: Celkova suma ---
    // TODO: Spocitej celkovou sumu vsech vydaju
    //       Hint: database.values.sumOf { it.amount }
}
