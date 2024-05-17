package Part_1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Linked list fo managing integers
 */
public class IntegerLinkedList {
    private LinkedList<Integer> studentAge = new LinkedList<Integer>();

    public void addToHead(Integer age) {
        studentAge.addFirst(age);
    }
    public void addToTail(Integer age) {
        studentAge.addLast(age);
    }
    public void addToIndex(Integer index, Integer age) {
        ListIterator<Integer> it = studentAge.listIterator();
        int indexToAdd = 0;
        while (it.hasNext()) {
            indexToAdd++;
            it.next();
            if(index == indexToAdd) {
                it.add(age);
            }
        }
        studentAge.add(index, age);
    }
    public int find(Integer age) {
        return studentAge.indexOf(age);
    }
    public void deleteFromIndex(Integer index) {
        Iterator<Integer> it = studentAge.iterator();
        int indexToDelete = 0;
        while (it.hasNext()) {
            indexToDelete++;
            it.next();
            if (indexToDelete == index) {
                it.remove();
            }
        }
    }

    public void display(String mesage) {
        Iterator<Integer> iterator = studentAge.iterator();
        System.out.println(mesage);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
