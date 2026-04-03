package dev.workshop.expense

// data class = sablona pro data (jako YAML schema)
// automaticky dava: toString, equals, copy
data class Expense(
    val id: Int,
    val description: String,
    val amount: Int,
    val date: String
)
