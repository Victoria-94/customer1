package customer.customer.repository

import customer.customer.entity.Customer
import customer.customer.entity.Leads
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LeadsRepository: JpaRepository<Leads, Long>{
    fun findById(id: Long?): Leads
}