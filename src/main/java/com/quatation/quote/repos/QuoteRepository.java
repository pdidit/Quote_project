package com.quatation.quote.repos;

import com.quatation.quote.domain.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote, Integer> {
}
