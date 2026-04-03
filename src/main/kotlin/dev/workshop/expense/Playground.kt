package dev.workshop.expense

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Playground : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("=== Step 3: HashMap — RESENI ===")
        println()

        // HashMap = klic → hodnota (jako Redis nebo ENV variables)
        val database = HashMap<Int, Expense>()

        database[1] = Expense(1, "Obed", 150, "2024-01-15")
        database[2] = Expense(2, "Kava", 50, "2024-01-15")
        database[3] = Expense(3, "Taxi", 320, "2024-01-15")
        database[4] = Expense(4, "Hotel", 2500, "2024-01-16")

        println("Pocet: ${database.size}")   // 4

        // Null safety — ?. safe call
        val found = database[2]
        println("ID 2: ${found?.description}")        // Kava
        println("ID 999: ${database[999]?.amount}")   // null — bez chyby!

        println()
        for (expense in database.values) {
            println("ID ${expense.id}: ${expense.description} — ${expense.amount} Kc")
        }

        // Smazani
        database.remove(1)
        println("\nPo smazani ID 1: ${database.size}")  // 3

        // Celkova suma
        val total = database.values.sumOf { it.amount }
        println("Suma: $total Kc")   // 2870
    }
}
