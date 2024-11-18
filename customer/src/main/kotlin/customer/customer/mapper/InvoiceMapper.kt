package customer.customer.mapper

import customer.customer.dto.InvoiceDto
import customer.customer.entity.Invoice

object InvoiceMapper {
    fun toEntity(invoiceDto: InvoiceDto): Invoice {
        val invoice = Invoice()
        invoice.code = invoiceDto.code
        return invoice
    }
}
fun toDto(invoice: Invoice): InvoiceDto {
    val invoiceDto = InvoiceDto()
    invoiceDto.code = invoice.code
    return invoiceDto
}