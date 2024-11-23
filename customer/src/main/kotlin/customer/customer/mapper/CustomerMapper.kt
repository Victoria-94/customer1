package customer.customer.mapper

import customer.customer.dto.CustomerDto
import customer.customer.entity.Customer

object CustomerMapper {
    fun toEntity(customerDto: CustomerDto): Customer {
        val customer = Customer()
        customer.fullName = customerDto.fullName
        customer.nui= customerDto.nui
        customer.addres= customerDto.addres
        customer.age= customerDto.age

        return customer
    }
    fun toDTO(customer: Customer): CustomerDto {
        val customerDto = CustomerDto()
        customerDto.fullName = customer.fullName
        customerDto.nui = customer.nui
        customerDto.addres = customer.addres
        customerDto.age = customer.age

        return customerDto

    }
}