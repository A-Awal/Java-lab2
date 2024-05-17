package com.amalitech.Services;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * My service to be injected 
 * A simple calculator app
 */
@Component
public class Calculator {
    Stack<Object> inputs = new Stack<>();

    public void addToStack(Object s) {
        System.out.println("Adding " + s + " to stack");
        if(s == "+"){
            addOperatorToStack(this::addition);
        }
        else if(s == "-"){
            addOperatorToStack(this::subtraction);
        }
        else if(s == "*"){
            addOperatorToStack(this::multiplication);
        }
        else if(s == "/"){
            addOperatorToStack(this::division);
        }
        else{
            inputs.push(s);
        }

    }

    public Number calculate(){
        int lastInput = (int)inputs.pop();
        OperatorFunction fn = (OperatorFunction) inputs.pop();
        int firstInput = (int)inputs.pop();
        System.out.println("Estimated result is:");
        return  fn.operate(firstInput, lastInput);
    }

    void addOperatorToStack(OperatorFunction op){
        inputs.push(op);
    }

    int addition(int a, int b) {
        return a+b;
    }
    int subtraction(int a, int b) {
        return a-b;
    }
    int multiplication(int a, int b) {
        return a*b;
    }
    double division(int a, int b) {
        return (double)a /b;
    }


    @FunctionalInterface
    private  interface OperatorFunction{
        Number operate(int a, int b);
    }
}
