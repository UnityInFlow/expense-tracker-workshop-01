package dev.workshop.expense

class ExpenseService {
    // private = accessible ONLY inside this class
    private val database = HashMap<Int, Expense>()
    private var nextId = 1

    fun add(description: String, amount: Int): Expense {
        val expense = Expense(nextId, description, amount, "2024-01-15")
        database[nextId] = expense
        nextId++
        return expense
    }

    fun getAll(): List<Expense> = database.values.toList()

    fun findById(id: Int): Expense? = database[id]

    fun delete(id: Int): Boolean = database.remove(id) != null

    fun total(): Int = database.values.sumOf { it.amount }

    // TODO: fun getAbove(threshold: Int): List<Expense>
    //       Returns expenses whose amount > threshold
    //       Hint: database.values.filter { it.amount > threshold }

    // TODO: fun count(): Int
    //       Returns the number of expenses

    // TODO: fun deleteAll()
    //       Deletes everything, resets nextId to 1
    //       Hint: database.clear()
}
