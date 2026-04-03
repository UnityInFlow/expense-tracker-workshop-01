package dev.workshop.expense

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

// TODO: Add @RestController
// TODO: Add @RequestMapping("/expenses")
class ExpenseController(private val service: ExpenseService) {

    // TODO: Add @GetMapping
    // TODO: fun getAll(): List<Expense> = service.getAll()

    // TODO: Add @PostMapping
    // TODO: fun add(@RequestBody request: CreateExpenseRequest): Expense =
    //           service.add(request.description, request.amount)

    // TODO: Add @DeleteMapping("/{id}")
    // TODO: fun delete(@PathVariable id: Int): Map<String, Any> =
    //           mapOf("success" to service.delete(id))

    // TODO: Add @GetMapping("/total")
    // TODO: fun getTotal(): Map<String, Int> = mapOf("total" to service.total())

    // TODO: Add @GetMapping("/{id}")
    // TODO: fun findById(@PathVariable id: Int): ResponseEntity<Expense>
    //       If exists → ResponseEntity.ok(expense)
    //       If not → ResponseEntity.notFound().build()
}
