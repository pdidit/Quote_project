package com.quatation.quote.service;

import com.quatation.quote.domain.Client;
import com.quatation.quote.domain.Quote;
import com.quatation.quote.repos.QuoteRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class QuoteService {

    @Autowired
    private QuoteRespository quoteRespository;

    public List<Quote> getAllQuotes(){ return quoteRespository.findAll(); }

    public Page<Quote> getPageQuotes(Pageable pageable) { return quoteRespository.findAll(pageable); }

    public Quote getQuote(Integer ID) { return quoteRespository.getOne(ID); }

    public Quote createQuote(Quote quote) { return quoteRespository.saveAndFlush(quote); }

    public void deleteQuote(Integer ID) { quoteRespository.deleteById(ID); }

    public Quote updateClient(Quote quote){

        //need to finish off.
        Quote existingQuote = quoteRespository.getOne(quote.getID());

        return quoteRespository.saveAndFlush(quote);
    }
}
