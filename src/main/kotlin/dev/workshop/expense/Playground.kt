package dev.workshop.expense

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Playground : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("=== Step 2: Data class a instance ===")
        println()

        // --- Ukol 1: Vytvor 3 instance Expense ---
        // TODO: val lunch = Expense(id = 1, description = "Obed", amount = 150, date = "2024-01-15")
        // TODO: val coffee = Expense(id = 2, description = "Kava", amount = 50, date = "2024-01-15")
        // TODO: val taxi = Expense(id = 3, description = "Taxi", amount = 320, date = "2024-01-15")

        // --- Ukol 2: Vytiskni vydaje ---
        // TODO: Pro kazdy vydaj vytiskni: "Vydaj #<id>: <description> za <amount> Kc"
        //       Hint: println("Vydaj #${lunch.id}: ${lunch.description} za ${lunch.amount} Kc")

        // --- Ukol 3: Najdi nejdrazsi ---
        // TODO: Pouzij listOf(lunch, coffee, taxi).maxBy { it.amount }
        //       Vytiskni nejdrazsi vydaj

        // --- Bonus: copy() ---
        // TODO: val updated = lunch.copy(amount = 200)
        //       Vytiskni obe — ukaz ze original se nezmenil
    }
}
