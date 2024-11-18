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
    var address: String? = null
    var age: Int? = 0
    var email: String? = null


    @OneToMany(mappedBy = "curses", cascade = [CascadeType.ALL]) //fetch = FetchType.LAZY)
    val students: List<Students> = listOf()

}