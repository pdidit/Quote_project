package com.quatation.quote.service;

import com.quatation.quote.domain.Quote;
import com.quatation.quote.repos.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuoteService {

    @Autowired
    private QuoteRepository quoteRepository;

    public List<Quote> getAllQuotes(){ return quoteRepository.findAll(); }

    public Page<Quote> getPageQuotes(Pageable pageable) { return quoteRepository.findAll(pageable); }

    public Optional<Quote> getQuote(Integer ID) { return quoteRepository.findById(ID); }

    public Quote createQuote(Quote quote) { return quoteRepository.saveAndFlush(quote); }

    public void deleteQuote(Integer ID) { quoteRepository.deleteById(ID); }

    public Quote updateClient(Quote quote){

        //need to finish off.
        Quote existingQuote = quoteRepository.getOne(quote.getID());

        return quoteRepository.saveAndFlush(quote);
    }
}
