package dev.workshop.expense

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Playground : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("=== Step 3: HashMap jako databaze ===")
        println()

        // --- Ukol 1: Vytvor HashMap a pridej vydaje ---
        // TODO: val database = HashMap<Int, Expense>()
        // TODO: Pridej 4 vydaje: database[1] = Expense(1, "Obed", 150, "2024-01-15")
        //       ... (Kava 50, Taxi 320, Hotel 2500)

        // --- Ukol 2: Pocet ---
        // TODO: println("Pocet: ${database.size}")

        // --- Ukol 3: Najdi podle ID — null safety ---
        // TODO: val found = database[2]
        //       println(found?.description)        // ?. = safe call
        //       println(database[999]?.amount)      // null — zadna chyba

        // --- Ukol 4: Vypis vsechny ---
        // TODO: for (expense in database.values) {
        //           println("ID ${expense.id}: ${expense.description} — ${expense.amount} Kc")
        //       }

        // --- Ukol 5: Smaz ---
        // TODO: database.remove(1)
        //       println("Po smazani: ${database.size}")

        // --- Bonus: Suma ---
        // TODO: val total = database.values.sumOf { it.amount }
    }
}
