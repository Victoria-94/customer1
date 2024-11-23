package customer.customer.controller

import customer.customer.dto.InvoiceDto
import customer.customer.entity.Invoice
import customer.customer.service.InvoiceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/invoice")
class InvoiceController {
    @Autowired
    lateinit var invoiceService: InvoiceService

    @GetMapping
    fun list(): List<Invoice> {
        return invoiceService.listar()
    }
    @PostMapping
    fun save(@RequestBody invoiceDto: InvoiceDto): InvoiceDto {
        return invoiceService.save(invoiceDto)
    }
}