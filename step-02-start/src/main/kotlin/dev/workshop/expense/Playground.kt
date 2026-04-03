package dev.workshop.expense

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Playground : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("=== Step 2: Data class and instances ===")
        println()

        // --- Task 1: Create 3 Expense instances ---
        // TODO: val lunch = Expense(id = 1, description = "Lunch", amount = 150, date = "2024-01-15")
        // TODO: val coffee = Expense(id = 2, description = "Coffee", amount = 50, date = "2024-01-15")
        // TODO: val taxi = Expense(id = 3, description = "Taxi", amount = 320, date = "2024-01-15")

        // --- Task 2: Print expenses ---
        // TODO: For each expense print: "Expense #<id>: <description> for <amount> CZK"
        //       Hint: println("Expense #${lunch.id}: ${lunch.description} for ${lunch.amount} CZK")

        // --- Task 3: Find the most expensive ---
        // TODO: Use listOf(lunch, coffee, taxi).maxBy { it.amount }
        //       Print the most expensive expense

        // --- Bonus: copy() ---
        // TODO: val updated = lunch.copy(amount = 200)
        //       Print both — show that the original did not change
    }
}
