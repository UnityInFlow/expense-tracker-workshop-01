package dev.workshop.expense

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Playground : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("=== Step 3: HashMap as a database ===")
        println()

        // --- Task 1: Create HashMap and add expenses ---
        // TODO: val database = HashMap<Int, Expense>()
        // TODO: Add 4 expenses: database[1] = Expense(1, "Lunch", 150, "2024-01-15")
        //       ... (Coffee 50, Taxi 320, Hotel 2500)

        // --- Task 2: Count ---
        // TODO: println("Count: ${database.size}")

        // --- Task 3: Find by ID — null safety ---
        // TODO: val found = database[2]
        //       println(found?.description)        // ?. = safe call
        //       println(database[999]?.amount)      // null — no error

        // --- Task 4: Print all ---
        // TODO: for (expense in database.values) {
        //           println("ID ${expense.id}: ${expense.description} — ${expense.amount} CZK")
        //       }

        // --- Task 5: Delete ---
        // TODO: database.remove(1)
        //       println("After deletion: ${database.size}")

        // --- Bonus: Sum ---
        // TODO: val total = database.values.sumOf { it.amount }
    }
}
