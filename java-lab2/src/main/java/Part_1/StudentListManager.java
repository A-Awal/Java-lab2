package Arrays_and_Linkedlist;

import java.io.Console;

public class StudentListManager {
    private String[] students = new  String[10];

    private int counter = 0;
    private double loadFactor = 0.9;

    void addStudent(String name){
        sizeManager();
        students[counter] = name;
        counter++;
    }
    int findStudent(String name){
        for (int i = 0; i < counter; i++) {
            if(students[i] == name){ return i; }
        }

        return -1;
    }

    boolean removeStudent(String name){

       var index = findStudent(name);
       if(index != -1){
           students[index] = students[counter];
           students[counter] = null;
           counter--;

           return true;
       }
       return false;
    }

    void displayStudents(){
        Console.pr(students.toString());
    }

    void sizeManager(){
        var isSizeAvaliable = (double) counter/students.length >= loadFactor;
        if(isSizeAvaliable){
            String[] newArray = new String[students.length+10];
            System.arraycopy(students, 0, newArray, 0, students.length);
            students = newArray;
        }
    }
}
