package customer.customer.repository

import customer.customer.entity.Customer
import customer.customer.entity.Invoice
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface InvoiceRepository: JpaRepository<Invoice, Long> {
    fun findById(id: Long?): Invoice // findById encontrar por id de la tabla invoice
    fun findByCustomerId(customerId: Long): List<Invoice>?  // todas las tablas dependientes se usa esto// stores o recursos adicionales  debe devocler customer/3/invoice
}