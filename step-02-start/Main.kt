// TODO: Definuj data class Expense se 4 fieldy:
//       id: Int, description: String, amount: Int, date: String

fun main() {
    // ============================================
    // Step 2: Data class a instance
    // ============================================

    // --- Ukol 1: Vytvor 3 instance Expense ---
    // TODO: Vytvor promennou 'lunch' jako Expense s id=1, description="Obed", amount=150, date="2024-01-15"
    // TODO: Vytvor promennou 'coffee' jako Expense s id=2, description="Kava", amount=50, date="2024-01-15"
    // TODO: Vytvor promennou 'taxi' jako Expense s id=3, description="Taxi", amount=320, date="2024-01-15"

    // --- Ukol 2: Vytiskni vydaje ---
    // TODO: Pro kazdy vydaj vytiskni: "Vydaj #<id>: <description> za <amount> Kc"

    // --- Ukol 3: Najdi nejdrazsi vydaj ---
    // TODO: Porovnej castky a vytiskni nejdrazsi vydaj
    //       Hint: pouzij if/else nebo listOf(...).maxBy { it.amount }

    // --- Bonus: Pouzij copy() ---
    // TODO: Vytvor 'updatedLunch' pomoci lunch.copy(amount = 200)
    //       Vytiskni obe — uved ze original se nezmenil
}
