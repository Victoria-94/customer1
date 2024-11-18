package customer.customer.controller

import customer.customer.dto.CustomerDto
import customer.customer.entity.Customer
import customer.customer.service.CustomerService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customer")
class CustomerController {
    @Autowired
    lateinit var customerService: CustomerService

    @GetMapping
    fun list(): List<Customer> {
        return customerService.list()
    }

    @PostMapping
    fun save(@RequestBody @Valid customerDto: CustomerDto): CustomerDto {
        return customerService.save(customerDto)
    }
}