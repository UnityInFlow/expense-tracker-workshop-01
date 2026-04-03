package dev.workshop.expense

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

// TODO: Pridejte import io.swagger.v3.oas.annotations.Operation
// TODO: Pridejte import io.swagger.v3.oas.annotations.tags.Tag

// TODO: Pridejte @Tag(name = "Expense Tracker", description = "API pro spravu vydaju")
@RestController
@RequestMapping("/expenses")
class ExpenseController(private val service: ExpenseService) {

    // TODO: Pridejte @Operation(summary = "Vrati seznam vsech vydaju")
    @GetMapping
    fun getAll(): List<Expense> = service.getAll()

    // TODO: Pridejte @Operation(summary = "Prida novy vydaj")
    @PostMapping
    fun add(@RequestBody request: CreateExpenseRequest): Expense =
        service.add(request.description, request.amount)

    // TODO: Pridejte @Operation(summary = "Smaze vydaj podle ID")
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int): Map<String, Any> =
        mapOf("success" to service.delete(id))

    // TODO: Pridejte @Operation(summary = "Vrati celkovou sumu vsech vydaju")
    @GetMapping("/total")
    fun getTotal(): Map<String, Int> = mapOf("total" to service.total())

    // TODO: Pridejte @Operation(summary = "Najde vydaj podle ID")
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): ResponseEntity<Expense> {
        val expense = service.findById(id)
        return if (expense != null) ResponseEntity.ok(expense)
               else ResponseEntity.notFound().build()
    }
}
