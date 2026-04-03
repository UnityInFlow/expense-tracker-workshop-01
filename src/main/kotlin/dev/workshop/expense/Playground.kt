package dev.workshop.expense

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Playground : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("=== Step 1: Variables and functions — SOLUTION ===")
        println()

        // val = immutable (like a constant) — use as default
        val description = "Lunch"
        val amount = 150
        val paid = true

        // String template — $ inserts the variable value into text
        println("Description: $description")
        println("Amount: $amount CZK")
        println("Paid: $paid")
        println()

        // fun = function, : String = return type
        fun greet(name: String): String {
            return "Hello $name, welcome to the workshop!"
        }
        println(greet("Jan"))
        println()

        // Short form with = instead of { return ... }
        fun withTax(amount: Int): Int = (amount * 1.21).toInt()
        println("100 CZK with VAT: ${withTax(100)} CZK")     // 121
        println("$amount CZK with VAT: ${withTax(amount)} CZK")  // 181

        // Bonus: formatExpense
        fun formatExpense(desc: String, amt: Int): String = "$desc: $amt CZK"
        println(formatExpense("Lunch", 150))
    }
}
