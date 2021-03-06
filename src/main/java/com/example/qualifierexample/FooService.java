package com.example.qualifierexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FooService {


    private Formatter formatter;


    @Autowired
    public void setFormatter(@Qualifier("barFormatter") Formatter formatter) {
        this.formatter = formatter;
    }
}
