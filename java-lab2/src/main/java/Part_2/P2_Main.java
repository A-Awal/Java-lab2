package Part_2;

public final class P2_Main {
    public  static  void RunCalculator(){

        Calculator calc = new Calculator();

        //add
        calc.addToStack(10);
        calc.addToStack("+");
        calc.addToStack(100);
        var ans = calc.calculate();
        System.out.println(ans);

        //subtact
        calc.addToStack(10);
        calc.addToStack("-");
        calc.addToStack(100);
        var ans0 = calc.calculate();
        System.out.println(ans0);

        //multiply
        calc.addToStack(10);
        calc.addToStack("*");
        calc.addToStack(100);
        var ans1 = calc.calculate();
        System.out.println(ans1);

        // Divide
        calc.addToStack(10);
        calc.addToStack("/");
        calc.addToStack(100);
        var ans2 = calc.calculate();
        System.out.println(ans2);
    }

    public  static  void RunTaskScheduler(){
        TaskScheduler taskScheduler = new TaskScheduler();

        //Add Task
        taskScheduler.schedule("hello");
        taskScheduler.schedule("world");
        taskScheduler.printQueue();

        taskScheduler.comleteTask();
        taskScheduler.printQueue();
        taskScheduler.comleteTask();
        taskScheduler.printQueue();
    }
}
