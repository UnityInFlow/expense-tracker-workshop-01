package dev.workshop.expense

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

// @RestController = class accepts HTTP requests
// @RequestMapping = base URL for all endpoints
@RestController
@RequestMapping("/expenses")
class ExpenseController(private val service: ExpenseService) {

    // GET /expenses — returns the list of all expenses
    @GetMapping
    fun getAll(): List<Expense> = service.getAll()

    // POST /expenses — adds a new expense (JSON body → CreateExpenseRequest)
    @PostMapping
    fun add(@RequestBody request: CreateExpenseRequest): Expense =
        service.add(request.description, request.amount)

    // DELETE /expenses/{id} — deletes an expense by ID
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int): Map<String, Any> =
        mapOf("success" to service.delete(id))

    // GET /expenses/total — returns the total sum
    @GetMapping("/total")
    fun getTotal(): Map<String, Int> = mapOf("total" to service.total())

    // GET /expenses/{id} — finds an expense by ID, returns 404 if not found
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): ResponseEntity<Expense> {
        val expense = service.findById(id)
        return if (expense != null) ResponseEntity.ok(expense)
               else ResponseEntity.notFound().build()
    }
}
