package customer.customer.service

import customer.customer.entity.Activities
import customer.customer.repository.ActivitiesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ActivitiesService {
    @Autowired
    lateinit var activitiesRepository: ActivitiesRepository

    @Autowired
    lateinit var viewRepository: ActivitiesRepository


    fun list(): List<Activities>{
        return activitiesRepository.findAll()
        return viewRepository.findAll()
    }

}