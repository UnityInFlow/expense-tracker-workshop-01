package dev.workshop.expense

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Playground : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("=== Step 2: Data class a instance — RESENI ===")
        println()

        // Pojmenovane parametry — prehlednejsi nez pozicni
        val lunch = Expense(id = 1, description = "Obed", amount = 150, date = "2024-01-15")
        val coffee = Expense(id = 2, description = "Kava", amount = 50, date = "2024-01-15")
        val taxi = Expense(id = 3, description = "Taxi", amount = 320, date = "2024-01-15")

        // toString() je automaticky z data class
        println(lunch)

        // Formatovany vypis
        val expenses = listOf(lunch, coffee, taxi)
        for (expense in expenses) {
            println("Vydaj #${expense.id}: ${expense.description} za ${expense.amount} Kc")
        }

        // Nejdrazsi
        val most = expenses.maxBy { it.amount }
        println("\nNejdrazsi: ${most.description} za ${most.amount} Kc")

        // copy() — original se nezmeni!
        val updated = lunch.copy(amount = 200)
        println("\nOriginal: $lunch")
        println("Kopie:    $updated")
    }
}
