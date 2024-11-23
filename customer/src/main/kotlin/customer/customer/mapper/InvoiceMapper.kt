package customer.customer.mapper

import customer.customer.dto.InvoiceDto
import customer.customer.entity.Invoice

object InvoiceMapper {
    fun toEntity(invoiceDto: InvoiceDto): Invoice {
        val invoice = Invoice()
        invoice.code = invoiceDto.code
        invoice.createdAt = invoiceDto.createAt
        invoice.total = invoiceDto.total
        return invoice
    }

    fun toDTO(invoice: Invoice): InvoiceDto {
        val invoiceDto = InvoiceDto()
        invoiceDto.code = invoice.code
        invoiceDto.createAt = invoice.createdAt
        invoiceDto.total = invoice.total
        return invoiceDto
    }

}