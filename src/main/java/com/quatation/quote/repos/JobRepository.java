package com.quatation.quote.repos;

import com.quatation.quote.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

public interface JobRepository extends JpaRepository<Job, Integer> {
}
