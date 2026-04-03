fun main() {
    // ============================================
    // Step 1: Promenne a funkce — RESENI
    // ============================================

    // --- Promenne ---
    // val = nemenna (jako konstanta) — pouzivejte jako vychozi
    val description = "Obed"
    val amount = 150
    val paid = true

    println("Popis: $description")        // String template s $
    println("Castka: $amount Kc")
    println("Zaplaceno: $paid")

    // --- Funkce greet ---
    // fun = definice funkce, : String = navratovy typ
    fun greet(name: String): String {
        return "Ahoj $name, vitej na workshopu!"
    }
    println(greet("Jan"))

    // --- Funkce withTax ---
    // Kratky zapis: = misto { return ... }
    fun withTax(amount: Int): Int = (amount * 1.21).toInt()
    println("100 Kc s DPH: ${withTax(100)} Kc")   // 121
    println("$amount Kc s DPH: ${withTax(amount)} Kc")  // 181

    // --- Bonus: formatExpense ---
    fun formatExpense(description: String, amount: Int): String {
        return "$description: $amount Kc"
    }
    println(formatExpense("Obed", 150))   // Obed: 150 Kc
}
