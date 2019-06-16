package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.example.demo")
@Component
@ConditionalOnProperty(
        value="component.enabled",
        havingValue = "true")
public class SampleComponent {

    public String getText() {
        return "test";
    }

}
