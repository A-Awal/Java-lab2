package com.amalitech.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Consumer of calculator dependency
 */
@Component
public class ServiceConsumer {
    @Autowired
    private Calculator calc;

    public void calculate(){
        calc.addToStack(2);
        calc.addToStack("+");
        calc.addToStack(7);

        System.out.println(calc.calculate());
    }
}
