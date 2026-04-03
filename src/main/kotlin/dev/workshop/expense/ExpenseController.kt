package dev.workshop.expense

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

// TODO: Add import io.swagger.v3.oas.annotations.Operation
// TODO: Add import io.swagger.v3.oas.annotations.tags.Tag

// TODO: Add @Tag(name = "Expense Tracker", description = "API for managing expenses")
@RestController
@RequestMapping("/expenses")
class ExpenseController(private val service: ExpenseService) {

    // TODO: Add @Operation(summary = "Returns the list of all expenses")
    @GetMapping
    fun getAll(): List<Expense> = service.getAll()

    // TODO: Add @Operation(summary = "Adds a new expense")
    @PostMapping
    fun add(@RequestBody request: CreateExpenseRequest): Expense =
        service.add(request.description, request.amount)

    // TODO: Add @Operation(summary = "Deletes an expense by ID")
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int): Map<String, Any> =
        mapOf("success" to service.delete(id))

    // TODO: Add @Operation(summary = "Returns the total sum of all expenses")
    @GetMapping("/total")
    fun getTotal(): Map<String, Int> = mapOf("total" to service.total())

    // TODO: Add @Operation(summary = "Finds an expense by ID")
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): ResponseEntity<Expense> {
        val expense = service.findById(id)
        return if (expense != null) ResponseEntity.ok(expense)
               else ResponseEntity.notFound().build()
    }
}
