package com.company.controller;

import com.company.model.EightBall;
import com.company.model.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class EightBallController
{
    private List<EightBall> eightBallList = new ArrayList<>();

    String[] response = {"It is certain", "Reply hazy, try again", "My reply is no", "Without a doubt", "Cannot predict now", "Very doubtful"};
    int idCounter;

    @RequestMapping(value = "/magic", method = POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public EightBall createEightBall ( @RequestBody EightBall eightBall)
    {
        String[] response = {"It is certain", "Reply hazy, try again", "My reply is no", "Without a doubt", "Cannot predict now", "Very doubtful"};
        int randint = (int)(Math.random() * (5 + 1) + 0);

        eightBall.setId(idCounter++);
        eightBall.setAnswer(response[randint]);
        eightBallList.add(eightBall);

        return eightBall;
    }
}
