package dev.workshop.expense

// data class = template for data (like a YAML schema)
// automatically provides: toString, equals, copy
data class Expense(
    val id: Int,
    val description: String,
    val amount: Int,
    val date: String
)
