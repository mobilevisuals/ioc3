package com.example.qualifierexample;

import org.springframework.stereotype.Component;

@Component
public class FooFormatter implements Formatter {

    public String format() {
        return "foo";
    }
}
