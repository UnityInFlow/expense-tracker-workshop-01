package dev.workshop.expense

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Playground : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("=== Step 1: Promenne a funkce — RESENI ===")
        println()

        // val = nemenna (jako konstanta) — pouzivejte jako vychozi
        val description = "Obed"
        val amount = 150
        val paid = true

        // String template — $ vlozi hodnotu promenne do textu
        println("Popis: $description")
        println("Castka: $amount Kc")
        println("Zaplaceno: $paid")
        println()

        // fun = funkce, : String = navratovy typ
        fun greet(name: String): String {
            return "Ahoj $name, vitej na workshopu!"
        }
        println(greet("Jan"))
        println()

        // Kratky zapis s = misto { return ... }
        fun withTax(amount: Int): Int = (amount * 1.21).toInt()
        println("100 Kc s DPH: ${withTax(100)} Kc")     // 121
        println("$amount Kc s DPH: ${withTax(amount)} Kc")  // 181

        // Bonus: formatExpense
        fun formatExpense(desc: String, amt: Int): String = "$desc: $amt Kc"
        println(formatExpense("Obed", 150))
    }
}
