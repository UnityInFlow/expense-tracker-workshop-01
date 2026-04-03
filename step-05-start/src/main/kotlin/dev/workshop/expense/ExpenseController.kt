package dev.workshop.expense

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

// TODO: Pridejte @RestController
// TODO: Pridejte @RequestMapping("/expenses")
class ExpenseController(private val service: ExpenseService) {

    // TODO: Pridejte @GetMapping
    // TODO: fun getAll(): List<Expense> = service.getAll()

    // TODO: Pridejte @PostMapping
    // TODO: fun add(@RequestBody request: CreateExpenseRequest): Expense =
    //           service.add(request.description, request.amount)

    // TODO: Pridejte @DeleteMapping("/{id}")
    // TODO: fun delete(@PathVariable id: Int): Map<String, Any> =
    //           mapOf("success" to service.delete(id))

    // TODO: Pridejte @GetMapping("/total")
    // TODO: fun getTotal(): Map<String, Int> = mapOf("total" to service.total())

    // TODO: Pridejte @GetMapping("/{id}")
    // TODO: fun findById(@PathVariable id: Int): ResponseEntity<Expense>
    //       Pokud existuje → ResponseEntity.ok(expense)
    //       Pokud ne → ResponseEntity.notFound().build()
}
