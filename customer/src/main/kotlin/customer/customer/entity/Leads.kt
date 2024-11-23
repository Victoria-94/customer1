package customer.customer.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "leads")
class Leads {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    var id: Long? = null

    @Column (nullable = false)
    var fullName: String? = null

    @Column(nullable = false)
    var contact: String? = null

    @Column(nullable = false)
    var status: String? = null

    @Column(nullable = false)
    var createdAt: LocalDate = LocalDate.now()

}