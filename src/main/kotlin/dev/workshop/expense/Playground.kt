package dev.workshop.expense

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Playground : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("=== Step 4: ExpenseService — RESENI ===")
        println()

        val service = ExpenseService()
        service.add("Obed", 150)
        service.add("Kava", 50)
        service.add("Taxi", 320)

        println("Vsechny: ${service.getAll()}")
        println("Pocet: ${service.count()}")
        println("Total: ${service.total()} Kc")

        // Vydaje nad 100 Kc
        val above = service.getAbove(100)
        println("Nad 100 Kc: $above")  // Obed (150) a Taxi (320)

        // Smazani vsech
        service.deleteAll()
        println("Po deleteAll: ${service.count()}")  // 0
    }
}
