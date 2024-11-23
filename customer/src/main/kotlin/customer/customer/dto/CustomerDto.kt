package customer.customer.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class CustomerDto {
    @NotNull(message = "Customer nui cannot be null")
    @NotBlank(message = "Customer nui cannot be null")
    var nui: String? = null

    @NotNull(message = "fullname cannot be null")
    @NotBlank(message = "fullname cannot be null")
    var fullName: String? = null


    @NotNull(message = "address cannot be null")
    @NotNull(message = "address cannot be null")
    var addres: String? = null


    @NotNull(message = "age cannot be null")
    @NotBlank(message = "age cannot be null")
    var age: Int? = null


    @NotNull(message = "email cannot be null")
    @NotBlank(message = "email cannot be null")
    var email: String? = null
}