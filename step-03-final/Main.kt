data class Expense(
    val id: Int,
    val description: String,
    val amount: Int,
    val date: String
)

fun main() {
    // ============================================
    // Step 3: HashMap jako databaze — RESENI
    // ============================================

    // HashMap = klic → hodnota (jako ENV variables nebo Redis)
    val database = HashMap<Int, Expense>()

    database[1] = Expense(1, "Obed", 150, "2024-01-15")
    database[2] = Expense(2, "Kava", 50, "2024-01-15")
    database[3] = Expense(3, "Taxi", 320, "2024-01-15")
    database[4] = Expense(4, "Hotel", 2500, "2024-01-16")

    println("Pocet vydaju: ${database.size}")   // 4

    // Null safety — ?. safe call
    // database[2] vrati Expense? (muze byt null)
    val found = database[2]
    println("ID 2: ${found?.description}")       // Kava
    println("ID 999: ${database[999]?.amount}")  // null — zadna chyba!

    // Vsechny vydaje
    for (expense in database.values) {
        println("ID ${expense.id}: ${expense.description} — ${expense.amount} Kc")
    }

    // Smazani
    database.remove(1)
    println("\nPo smazani ID 1: ${database.size} vydaju")  // 3

    // Celkova suma
    val total = database.values.sumOf { it.amount }
    println("Celkova suma: $total Kc")   // 2870
}
