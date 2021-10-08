package com.company.controller;

import com.company.model.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class QuoteController
{

    private List<Quote> quoteList;
    private static int idCounter = 0;

    public QuoteController ()
    {
        quoteList = new ArrayList<>();
        quoteList.add(new Quote("Peter Buffett", "It didn’t matter how big our house was; it mattered that there was love in it.", idCounter++));
        quoteList.add(new Quote("Michael J. Fox", "Family is not an important thing. It’s everything.", idCounter++));
        quoteList.add(new Quote("Dalai Lama", "The purpose of our lives is to be happy.", idCounter++));
        quoteList.add(new Quote("John Lennon", "Life is what happens when you're busy making other plans.", idCounter++));
        quoteList.add(new Quote("James Baldwin", "Not everything that is faced can be changed, but nothing can be changed until it is faced.", idCounter++));
        quoteList.add(new Quote("James Baldwin", "The most dangerous creation of any society is the man who has nothing to lose.", idCounter++));
        quoteList.add(new Quote("Toni Morrison", "As you enter positions of trust and power, dream a little before you think.", idCounter++));
        quoteList.add(new Quote("Michelle Obama", "Whether you come from a council estate or a country estate, your success will be determined by your own confidence and fortitude", idCounter++));
        quoteList.add(new Quote("Michelle Obama", "Your story is what you have, what you will always have. It is something to own", idCounter++));
        quoteList.add(new Quote("Maya Angelou", "Nothing will work unless you do.", idCounter++));

    }


    @RequestMapping(value = "/quote", method = GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuote()
    {
        int randint = (int)(Math.random() * (9 + 1) + 0);

        return quoteList.get(randint);
    }


}
