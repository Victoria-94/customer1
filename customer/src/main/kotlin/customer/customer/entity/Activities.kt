package customer.customer.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "activities")
class Activities{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    var id: Long?=null


    @Column(nullable = false)
    var description : String? = null

    @Column(nullable = false)
    var createdAt : LocalDate? = null


    @Column(nullable = false)
    var type : String? = null

}


