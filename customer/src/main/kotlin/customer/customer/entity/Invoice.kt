package customer.customer.entity

import jakarta.persistence.*
import java.util.*


@Entity
@Table(name = "invoice")
class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (updatable = false, unique = true)
    var id: Long? = null
    var code: String? = null
    var createdAt: Date? = null
    var total: Int = 0


    @ManyToOne
    @JoinColumn(name = "customer_id")
    var customer: Customer? = null

}
