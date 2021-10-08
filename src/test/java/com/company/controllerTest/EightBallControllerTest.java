package com.company.controllerTest;

import com.company.controller.EightBallController;
import com.company.model.EightBall;
import com.company.model.EightBall;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(EightBallController.class)

public class EightBallControllerTest
{

    @Autowired
    public MockMvc mockMvc;

    public ObjectMapper mapper = new ObjectMapper();


    @Test
    public void shouldReturnNewRecordOnPostRequest() throws Exception {
        // ARRANGE
        EightBall inputEightBall = new EightBall();
        inputEightBall.setQuestion("Will I have a good day tomorrow?");

        // Convert Java Object to JSON
        String inputJson = mapper.writeValueAsString(inputEightBall);

        // ACT
        mockMvc.perform(
                        post("/magic")                            // Perform the POST request
                                .content(inputJson)                       // Set the request body
                                .contentType(MediaType.APPLICATION_JSON)  // Tell the server it's in JSON format
                )
                .andDo(print())                                // Print results to console
                .andExpect(status().isCreated());              // ASSERT (status code is 201)
    }
}
