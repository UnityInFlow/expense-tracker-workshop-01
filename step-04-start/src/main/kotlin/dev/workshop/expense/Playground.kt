package dev.workshop.expense

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Playground : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("=== Step 4: ExpenseService ===")
        println()

        val service = ExpenseService()
        service.add("Lunch", 150)
        service.add("Coffee", 50)
        service.add("Taxi", 320)

        println("All: ${service.getAll()}")
        println("Total: ${service.total()} CZK")

        // TODO: Test getAbove(100) — should return Lunch and Taxi
        // TODO: Test count() — should return 3
        // TODO: Call deleteAll() and verify that count() == 0
    }
}
