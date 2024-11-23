package customer.customer.entity

import jakarta.persistence.*


@Entity
@Table(name = "customer")
class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, unique = true)
    var id: Long? = null

    var nui: String? = null
    var fullName: String? = null
    var addres: String? = null
    var age: Int? = 0
    @Column(updatable = false, unique = true)
    var email: String? = null

}