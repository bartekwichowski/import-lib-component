package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @Autowired
    SampleComponent sampleComponent;

    public String getText() {
        return sampleComponent.getText();
    }

}
