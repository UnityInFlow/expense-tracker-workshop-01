package dev.workshop.expense

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

// @RestController = trida prijima HTTP requesty
// @RequestMapping = bazova URL pro vsechny endpointy
@RestController
@RequestMapping("/expenses")
class ExpenseController(private val service: ExpenseService) {

    // GET /expenses — vrati seznam vsech vydaju
    @GetMapping
    fun getAll(): List<Expense> = service.getAll()

    // POST /expenses — prida novy vydaj (JSON body → CreateExpenseRequest)
    @PostMapping
    fun add(@RequestBody request: CreateExpenseRequest): Expense =
        service.add(request.description, request.amount)

    // DELETE /expenses/{id} — smaze vydaj podle ID
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int): Map<String, Any> =
        mapOf("success" to service.delete(id))

    // GET /expenses/total — vrati celkovou sumu
    @GetMapping("/total")
    fun getTotal(): Map<String, Int> = mapOf("total" to service.total())

    // GET /expenses/{id} — najde vydaj podle ID, vrati 404 pokud neexistuje
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): ResponseEntity<Expense> {
        val expense = service.findById(id)
        return if (expense != null) ResponseEntity.ok(expense)
               else ResponseEntity.notFound().build()
    }
}
