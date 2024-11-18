package customer.customer.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import java.util.Date

class InvoiceDto {

    @NotNull(message = "code is required")
    @NotBlank(message = "code is required")
    var code: String? = null

    @NotBlank(message = "create_at is required")
    @NotNull(message = "create_at is required")
    var create_at: Int = 0


    @NotBlank(message = "total is required")
    @NotNull(message = "total is required")
    var total: Double? = null

}