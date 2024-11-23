package customer.customer.entity

import jakarta.persistence.*
import java.time.LocalDate
import java.util.*


@Entity
@Table(name = "invoice")
class Invoice {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (updatable = false, unique = true)
    var id: Long? = null

    @Column(nullable = false)
    var code: String? = null

    @Column(nullable = false)
    var createdAt: LocalDate? = null

    @Column(nullable = false, columnDefinition = "Decimal(10, 2)")
    var total: Double? = null


    @ManyToOne
    @JoinColumn(referencedColumnName =  "id")
    var customer: Customer? = null

}
