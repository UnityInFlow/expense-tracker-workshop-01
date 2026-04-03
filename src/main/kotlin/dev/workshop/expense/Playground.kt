package dev.workshop.expense

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

// Tento soubor se spusti automaticky pri startu aplikace.
// Vystup uvidite v terminalu IntelliJ (ne v prohlizeci).
@Component
class Playground : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("=== Step 1: Promenne a funkce ===")
        println()

        // --- Ukol 1: Vytvor promenne ---
        // TODO: Vytvor promennou 'description' typu String s hodnotou "Obed"
        // TODO: Vytvor promennou 'amount' typu Int s hodnotou 150
        // TODO: Vytvor promennou 'paid' typu Boolean s hodnotou true
        // TODO: Vytiskni vsechny tri pomoci println()
        // Hint: val description = "Obed"

        // --- Ukol 2: Napis funkci greet ---
        // TODO: Napis funkci greet(name: String): String
        //       ktera vrati "Ahoj <name>, vitej na workshopu!"
        // TODO: Zavolej greet("Jan") a vytiskni vysledek
        // Hint: fun greet(name: String): String { return "Ahoj $name, ..." }

        // --- Ukol 3: Napis funkci withTax ---
        // TODO: Napis funkci withTax(amount: Int): Int
        //       ktera vrati castku s DPH 21%
        // TODO: Zavolej withTax(100) a vytiskni vysledek (ocekavano: 121)
        // Hint: fun withTax(amount: Int): Int = (amount * 1.21).toInt()
    }
}
