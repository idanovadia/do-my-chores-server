package com.domychoresserver.domychoresserver.Services;

import com.domychoresserver.domychoresserver.Enteties.JobService;
import com.domychoresserver.domychoresserver.Repositories.JobServiceRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class JobServiceService {

    private final JobServiceRepository jobServiceRepository;

    public JobServiceService(JobServiceRepository jobServiceRepository) {
        this.jobServiceRepository = jobServiceRepository;
    }

    public List<JobService> allJobServices() {
        return jobServiceRepository.findAll();
    }

    public JobService addJobService(JobService jobService) {
        return jobServiceRepository.save(jobService);
    }
}
