package customer.customer.repository

import customer.customer.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface CustomerRepository: JpaRepository<Customer, Long> {}