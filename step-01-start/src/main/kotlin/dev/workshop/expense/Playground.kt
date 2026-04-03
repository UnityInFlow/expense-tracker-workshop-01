package dev.workshop.expense

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

// This file runs automatically when the application starts.
// You will see the output in the IntelliJ terminal (not in the browser).
@Component
class Playground : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("=== Step 1: Variables and functions ===")
        println()

        // --- Task 1: Create variables ---
        // TODO: Create a variable 'description' of type String with value "Lunch"
        // TODO: Create a variable 'amount' of type Int with value 150
        // TODO: Create a variable 'paid' of type Boolean with value true
        // TODO: Print all three using println()
        // Hint: val description = "Lunch"

        // --- Task 2: Write a greet function ---
        // TODO: Write a function greet(name: String): String
        //       that returns "Hello <name>, welcome to the workshop!"
        // TODO: Call greet("Jan") and print the result
        // Hint: fun greet(name: String): String { return "Hello $name, ..." }

        // --- Task 3: Write a withTax function ---
        // TODO: Write a function withTax(amount: Int): Int
        //       that returns the amount with 21% VAT
        // TODO: Call withTax(100) and print the result (expected: 121)
        // Hint: fun withTax(amount: Int): Int = (amount * 1.21).toInt()
    }
}
