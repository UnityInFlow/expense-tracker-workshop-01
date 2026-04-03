package dev.workshop.expense

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Playground : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("=== Step 4: ExpenseService — SOLUTION ===")
        println()

        val service = ExpenseService()
        service.add("Lunch", 150)
        service.add("Coffee", 50)
        service.add("Taxi", 320)

        println("All: ${service.getAll()}")
        println("Count: ${service.count()}")
        println("Total: ${service.total()} CZK")

        // Expenses above 100 CZK
        val above = service.getAbove(100)
        println("Above 100 CZK: $above")  // Lunch (150) and Taxi (320)

        // Delete all
        service.deleteAll()
        println("After deleteAll: ${service.count()}")  // 0
    }
}
