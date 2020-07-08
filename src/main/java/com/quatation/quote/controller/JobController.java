package com.quatation.quote.controller;

import com.quatation.quote.domain.Job;
import com.quatation.quote.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping
    public List<Job> getAllJobs() { return jobService.getAllJobs(); }

    @GetMapping
    public Job getClient(@PathVariable Integer ID) { return jobService.getJob(ID); }
}
