package dev.workshop.expense

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Playground : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("=== Step 4: ExpenseService ===")
        println()

        val service = ExpenseService()
        service.add("Obed", 150)
        service.add("Kava", 50)
        service.add("Taxi", 320)

        println("Vsechny: ${service.getAll()}")
        println("Total: ${service.total()} Kc")

        // TODO: Otestuj getAbove(100) — melo vratit Obed a Taxi
        // TODO: Otestuj count() — melo vratit 3
        // TODO: Zavolej deleteAll() a otestuj ze count() == 0
    }
}
