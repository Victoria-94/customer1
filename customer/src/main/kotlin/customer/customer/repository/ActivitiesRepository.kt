package customer.customer.repository

import customer.customer.entity.Activities
import customer.customer.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ActivitiesRepository : JpaRepository<Activities, Long>{
    fun findById(id: Long?): Activities
}