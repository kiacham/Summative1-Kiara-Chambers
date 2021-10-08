package com.company.controllerTest;

import com.company.controller.QuoteController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(QuoteController.class)

public class QuoteControllerTest
{

    @Autowired
    public MockMvc mockMvc;

    public ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturnRandomQuote() throws Exception
    {

        mockMvc.perform(get("/quote"))                // Perform the GET request
                .andDo(print())                          // Print results to console
                .andExpect(status().isOk());

    }

}
