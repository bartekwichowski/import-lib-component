package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleServiceTest {

    @Autowired
    SampleService  sampleService;

    @Test
    public void shouldReturnText() {
        String result = sampleService.getText();
        assertThat(result, equalTo("test"));
    }

}