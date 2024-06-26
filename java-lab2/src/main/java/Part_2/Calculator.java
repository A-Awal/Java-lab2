package Part_2;
import java.util.Stack;


public class Calculator {
    Stack<Object> inputs = new Stack<>();

    void addToStack(Object s) {

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

    Number calculate(){
        int lastInput = (int)inputs.pop();
        OperatorFunction fn = (OperatorFunction) inputs.pop();
        int firstInput = (int)inputs.pop();
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
    public  interface OperatorFunction{
        Number operate(int a, int b);
    }
//
//    @FunctionalInterface
//    public  interface DivisionFunction{
//        double operate(int a, int b);
//    }
}
