// data class = sablona pro data (jako YAML schema)
// automaticky dava: toString, equals, copy
data class Expense(
    val id: Int,
    val description: String,
    val amount: Int,
    val date: String
)

fun main() {
    // ============================================
    // Step 2: Data class a instance — RESENI
    // ============================================

    // Vytvoreni instanci — pojmenovane parametry pro prehlednost
    val lunch = Expense(id = 1, description = "Obed", amount = 150, date = "2024-01-15")
    val coffee = Expense(id = 2, description = "Kava", amount = 50, date = "2024-01-15")
    val taxi = Expense(id = 3, description = "Taxi", amount = 320, date = "2024-01-15")

    // toString() je automaticky — data class to dela za nas
    println(lunch)   // Expense(id=1, description=Obed, amount=150, date=2024-01-15)

    // Formatovany vypis
    val expenses = listOf(lunch, coffee, taxi)
    for (expense in expenses) {
        println("Vydaj #${expense.id}: ${expense.description} za ${expense.amount} Kc")
    }

    // Nejdrazsi vydaj
    val mostExpensive = expenses.maxBy { it.amount }
    println("\nNejdrazsi: ${mostExpensive.description} za ${mostExpensive.amount} Kc")

    // copy() — vytvori kopii, original se nezmeni
    val updatedLunch = lunch.copy(amount = 200)
    println("\nOriginal: $lunch")
    println("Kopie:    $updatedLunch")
}
