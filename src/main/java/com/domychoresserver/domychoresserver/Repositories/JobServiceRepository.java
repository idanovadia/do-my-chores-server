package com.domychoresserver.domychoresserver.Repositories;

import com.domychoresserver.domychoresserver.Enteties.JobService;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobServiceRepository extends MongoRepository<JobService,Integer> {

}
