package Arrays_and_Linkedlist;

import java.util.LinkedList;

public class IntegerLinkedList {
    private LinkedList<Integer> studentAge = new LinkedList<Integer>();

    void addToHead(Integer student) {
        studentAge.addFirst(student);
    }
    void addToTail(Integer student) {
        studentAge.addLast(student);
    }
    void addToIndex(Integer index, Integer age) {
        studentAge.add(index, age);
    }
    int find(Integer age) {
        return studentAge.indexOf(age);
    }
    void deleteFromIndex(Integer index) {
        studentAge.remove(index);
    }
}
