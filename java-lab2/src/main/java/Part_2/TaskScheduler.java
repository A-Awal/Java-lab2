package Part_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduler {
    Queue<String> queue = new LinkedList<String>();
    public void schedule(String task) {
        queue.add(task);
    }
    public void comleteTask(){
        queue.remove();
    }
    public void printQueue(){
        Iterator<String> iterator = queue.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
