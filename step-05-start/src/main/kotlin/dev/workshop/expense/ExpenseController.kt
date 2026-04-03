package dev.workshop.expense

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

// TODO: Pridejte @RestController
// TODO: Pridejte @RequestMapping("/expenses")
class ExpenseController(private val service: ExpenseService) {

    // TODO: Pridejte @GetMapping
    // TODO: Implementujte metodu getAll() ktera vrati service.getAll()

    // TODO: Pridejte @PostMapping
    // TODO: Implementujte metodu add(@RequestBody request: CreateExpenseRequest)
    //       ktera vrati service.add(request.description, request.amount)

    // TODO: Pridejte @DeleteMapping("/{id}")
    // TODO: Implementujte metodu delete(@PathVariable id: Int)
    //       ktera vrati mapOf("success" to service.delete(id))

    // TODO: Pridejte @GetMapping("/total")
    // TODO: Implementujte metodu getTotal()
    //       ktera vrati mapOf("total" to service.total())

    // TODO: Pridejte @GetMapping("/{id}")
    // TODO: Implementujte metodu findById(@PathVariable id: Int)
    //       Pokud vydaj existuje, vradte ResponseEntity.ok(expense)
    //       Pokud ne, vradte ResponseEntity.notFound().build()
}
