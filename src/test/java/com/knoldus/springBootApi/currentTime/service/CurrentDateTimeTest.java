package com.knoldus.springBootApi.currentTime.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {CurrentDateTime.class})
@ExtendWith(SpringExtension.class)
class CurrentDateTimeTest {
    @Autowired
    private CurrentDateTime currentDateTime;

    /**
     * Method under test: {@link CurrentDateTime#getTimeStatus()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTimeStatus() {

        // TODO: Complete this test.
        this.currentDateTime.getTimeStatus();
    }
}

