package customer.customer.service

import customer.customer.dto.InvoiceDto
import customer.customer.entity.Invoice
import customer.customer.mapper.InvoiceMapper
import customer.customer.repository.InvoiceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class InvoiceService {
    @Autowired
    lateinit var invoiceRepository: InvoiceRepository


    fun listar(): List<Invoice> {
        return invoiceRepository.findAll()
    }
    fun save(invoiceDto: InvoiceDto): InvoiceDto {
        val invoiceEntity =InvoiceMapper.toEntity(invoiceDto)
        val savedInvoice = invoiceRepository.save(invoiceEntity)
        return InvoiceMapper.toDTO(savedInvoice)
    }
}