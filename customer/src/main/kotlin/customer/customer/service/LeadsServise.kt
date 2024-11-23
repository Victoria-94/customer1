package customer.customer.service

import customer.customer.entity.Leads
import customer.customer.repository.LeadsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LeadsServise {
    @Autowired
    lateinit var leadsRepository: LeadsRepository

    fun list() : List<Leads> {
        return leadsRepository.findAll()
    }
}