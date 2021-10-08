package com.company.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class EightBall
{
    //properties

    private String question;
    private String answer;
    private int Id;

    //default constructor
    public EightBall(){}

    //constructor
    public EightBall(String question, String answer, int Id)
    {
        this.question = question;
        this.answer = answer;
        this.Id = Id;
    }

    //getters and setters
    public String getQuestion()
    {
        return question;
    }

    public void setQuestion(String question)
    {
        this.question = question;
    }

    public String getAnswer()
    {
        return answer;
    }

    public void setAnswer(String answer)
    {
        this.answer = answer;
    }

    public int getId()
    {
        return Id;
    }

    public void setId(int id)
    {
        Id = id;
    }

}
