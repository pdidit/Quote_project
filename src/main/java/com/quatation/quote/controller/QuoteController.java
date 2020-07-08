package com.quatation.quote.controller;

import com.quatation.quote.domain.Quote;
import com.quatation.quote.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quote")
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping
    public List<Quote> getAllQuotes() { return quoteService.getAllQuotes(); }

    @GetMapping
    public Quote getQuote(@PathVariable Integer ID) { return quoteService.getQuote(ID); }

}
