package Part_1;

public class StudentListManager {
    private String[] students = new  String[10];

    private int counter = 0;
    private double loadFactor = 0.9;

    public void addStudent(String name){
        sizeManager();
        students[counter] = name;
        counter++;
    }
    public int findStudent(String name){

        int index = -1;
        for (int i = 0; i < counter; i++) {
            if(students[i] != null && students[i].equals(name) ){
                index = i;
            }

        }
         return index;

    }

    public boolean removeStudent(String name){

       var index = findStudent(name);
       if(index != -1){
           students[index] = students[counter];
           students[counter] = null;
           counter--;

           return true;
       }
       return false;
    }

    public void displayStudents(){
        for (int i = 0; i < counter; i++) {
            System.out.println(students[i]);
        }
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
