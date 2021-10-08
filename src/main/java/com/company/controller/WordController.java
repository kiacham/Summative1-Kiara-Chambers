package com.company.controller;

import com.company.model.Quote;
import com.company.model.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class WordController
{

    private List<Word> wordList;
    private static int idCounter = 0;

    public WordController()
    {
        wordList = new ArrayList<>();
        wordList.add(new Word("anomaly ", "something that is unusual or unexpected", idCounter++));
        wordList.add(new Word("equivocal", "not easily understood or explained", idCounter++));
        wordList.add(new Word("lucid ", " very clear and easy to understand", idCounter++));
        wordList.add(new Word("precipitate ", "to cause (something) to happen quickly or suddenly", idCounter++));
        wordList.add(new Word("assuage ", "to make (an unpleasant feeling) less intense", idCounter++));
        wordList.add(new Word("erudite", "having or showing great knowledge", idCounter++));
        wordList.add(new Word("opaque ", "not able to be seen through; not easily understood", idCounter++));
        wordList.add(new Word("prodigal ", "wastefully extravagant", idCounter++));
        wordList.add(new Word("enigma ", "a person or thing that is mysterious, puzzling, or difficult to understand", idCounter++));
        wordList.add(new Word("zeal ", "a strong feel of interest and enthusiasm that makes someone very eager or determined to do something", idCounter++));


    }


    @RequestMapping(value = "/word", method = GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Word getWord()
    {
        int randint = (int)(Math.random() * (9 + 1) + 0);

        return wordList.get(randint);
    }
}

