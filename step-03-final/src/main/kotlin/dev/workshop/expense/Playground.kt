package dev.workshop.expense

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Playground : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("=== Step 3: HashMap — SOLUTION ===")
        println()

        // HashMap = key → value (like Redis or ENV variables)
        val database = HashMap<Int, Expense>()

        database[1] = Expense(1, "Lunch", 150, "2024-01-15")
        database[2] = Expense(2, "Coffee", 50, "2024-01-15")
        database[3] = Expense(3, "Taxi", 320, "2024-01-15")
        database[4] = Expense(4, "Hotel", 2500, "2024-01-16")

        println("Count: ${database.size}")   // 4

        // Null safety — ?. safe call
        val found = database[2]
        println("ID 2: ${found?.description}")        // Coffee
        println("ID 999: ${database[999]?.amount}")   // null — no error!

        println()
        for (expense in database.values) {
            println("ID ${expense.id}: ${expense.description} — ${expense.amount} CZK")
        }

        // Deletion
        database.remove(1)
        println("\nAfter deletion of ID 1: ${database.size}")  // 3

        // Total sum
        val total = database.values.sumOf { it.amount }
        println("Total sum: $total CZK")   // 2870
    }
}
