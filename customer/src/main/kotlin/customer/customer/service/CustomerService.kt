package customer.customer.service

import customer.customer.dto.CustomerDto
import customer.customer.entity.Customer
import customer.customer.mapper.CustomerMapper
import customer.customer.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class CustomerService {

    @Autowired
    lateinit var customerRepository: CustomerRepository

    fun list(): List<Customer> {
        return customerRepository.findAll()
    }

    fun save(customerDto: CustomerDto): CustomerDto {
        val customerEntity = CustomerMapper.toEntity(customerDto)
        val savedCustomer = customerRepository.save(customerEntity)
        return CustomerMapper.toDTO(savedCustomer)
    }
}