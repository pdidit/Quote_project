package com.quatation.quote.controller;

import com.quatation.quote.domain.Job;
import com.quatation.quote.service.JobService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping(value = "/jobs")
    public List<Job> getAllJobs() { return jobService.getAllJobs(); }

    @GetMapping(value = "/jobs/{id}")
    public Optional<Job> getClient(@PathVariable Integer id) { return jobService.getJob(id); }
}
