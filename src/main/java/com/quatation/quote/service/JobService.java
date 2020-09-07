package com.quatation.quote.service;

import com.quatation.quote.domain.Job;
import com.quatation.quote.repos.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs() { return jobRepository.findAll(); }

    public Optional<Job> getJob(Integer ID) { return jobRepository.findById(ID); }

    public Page<Job> getPageJobs(Pageable pageable) { return jobRepository.findAll(pageable); }

    public Job createJob(Job job) { return jobRepository.saveAndFlush(job); }

    public void deleteJob(Integer ID) { jobRepository.deleteById(ID); }

    public Job updateJob(Job job){

        //need to finish off.
        Job existingQuote = jobRepository.getOne(job.getID());

        return jobRepository.saveAndFlush(job);
    }

}
