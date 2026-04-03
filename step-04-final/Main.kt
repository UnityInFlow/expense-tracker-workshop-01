data class Expense(
    val id: Int,
    val description: String,
    val amount: Int,
    val date: String
)

class ExpenseService {
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

    // Filtr — vrati vydaje nad threshold
    fun getAbove(threshold: Int): List<Expense> =
        database.values.filter { it.amount > threshold }

    // Pocet vydaju
    fun count(): Int = database.size

    // Smazat vse a resetovat ID
    fun deleteAll() {
        database.clear()
        nextId = 1
    }
}

fun main() {
    // ============================================
    // Step 4: ExpenseService — RESENI
    // ============================================
    val service = ExpenseService()

    service.add("Obed", 150)
    service.add("Kava", 50)
    service.add("Taxi", 320)

    println("Vsechny: ${service.getAll()}")
    println("Total: ${service.total()} Kc")
    println("Count: ${service.count()}")

    // Filtr nad 100 Kc
    println("Nad 100 Kc: ${service.getAbove(100)}")

    // Smazat vse
    service.deleteAll()
    println("Po deleteAll: count = ${service.count()}")
}
