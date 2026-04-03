package dev.workshop.expense

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Playground : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("=== Step 2: Data class and instances — SOLUTION ===")
        println()

        // Named parameters — more readable than positional
        val lunch = Expense(id = 1, description = "Lunch", amount = 150, date = "2024-01-15")
        val coffee = Expense(id = 2, description = "Coffee", amount = 50, date = "2024-01-15")
        val taxi = Expense(id = 3, description = "Taxi", amount = 320, date = "2024-01-15")

        // toString() is automatic from data class
        println(lunch)

        // Formatted output
        val expenses = listOf(lunch, coffee, taxi)
        for (expense in expenses) {
            println("Expense #${expense.id}: ${expense.description} for ${expense.amount} CZK")
        }

        // Most expensive
        val most = expenses.maxBy { it.amount }
        println("\nMost expensive: ${most.description} for ${most.amount} CZK")

        // copy() — original does not change!
        val updated = lunch.copy(amount = 200)
        println("\nOriginal: $lunch")
        println("Copy:     $updated")
    }
}
