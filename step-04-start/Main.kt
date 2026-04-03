data class Expense(
    val id: Int,
    val description: String,
    val amount: Int,
    val date: String
)

class ExpenseService {
    // private = pristupne POUZE uvnitr tridy
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

    // TODO: Doplnte metodu getAbove(threshold: Int): List<Expense>
    //       Vrati vydaje jejichz castka > threshold
    //       Hint: database.values.filter { it.amount > threshold }

    // TODO: Doplnte metodu count(): Int
    //       Vrati pocet vydaju

    // TODO: Doplnte metodu deleteAll()
    //       Smaze vsechny vydaje a resetuje nextId na 1
    //       Hint: database.clear()
}

fun main() {
    val service = ExpenseService()

    // Pridani vydaju
    service.add("Obed", 150)
    service.add("Kava", 50)
    service.add("Taxi", 320)

    println("Vsechny: ${service.getAll()}")
    println("Total: ${service.total()} Kc")

    // TODO: Otestuj getAbove(100) — melo vratit Obed a Taxi
    // TODO: Otestuj count() — melo vratit 3
    // TODO: Otestuj deleteAll() — count() by mel byt 0
}
