package customer.customer.mapper

import customer.customer.dto.CustomerDto
import customer.customer.entity.Customer

object CustomerMapper {
    fun toEntity(customerDto: CustomerDto): Customer {
        val customer = Customer()
        customer.fullName = customerDto.fullName
        customer.nui= customerDto.nui
        customer.address= customerDto.address
        customer.age= customerDto.age
        customer.address= customerDto.address
        return customer
    }
    fun toDTO(customer: Customer): CustomerDto {
        val customerDto = CustomerDto()
        customerDto.fullName = customer.fullName
        customerDto.nui = customer.nui
        customerDto.address = customer.address
        customerDto.age = customer.age
        customerDto.address = customer.address
        return customerDto

    }
}