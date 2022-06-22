package com.knoldus.springBootApi.currentTime.controller;

import static org.mockito.Mockito.when;

import com.knoldus.springBootApi.currentTime.service.CurrentDateTime;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {CurrentTimeController.class})
@ExtendWith(SpringExtension.class)
class CurrentTimeControllerTest {
    @MockBean
    private CurrentDateTime currentDateTime;

    @Autowired
    private CurrentTimeController currentTimeController;

    /**
     * Method under test: {@link CurrentTimeController#getTimeStatus()}
     */
    @Test
    void testGetTimeStatus() throws Exception {
        when(this.currentDateTime.getTimeStatus()).thenReturn("Time Status");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/status");
        MockMvcBuilders.standaloneSetup(this.currentTimeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Time Status"));
    }

    /**
     * Method under test: {@link CurrentTimeController#getTimeStatus()}
     */
    @Test
    void testGetTimeStatus2() throws Exception {
        when(this.currentDateTime.getTimeStatus()).thenReturn("Time Status");
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/status");
        getResult.contentType("https://example.org/example");
        MockMvcBuilders.standaloneSetup(this.currentTimeController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Time Status"));
    }
}

