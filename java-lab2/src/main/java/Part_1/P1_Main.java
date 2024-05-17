package Part_1;

public final class P1_Main {
    /**
     * Tests Student List manager
     */
    public static void RunStudentListManger(){

        // create student manager
        StudentListManager studentListManager = new StudentListManager();


        studentListManager.addStudent("student1");
        studentListManager.addStudent("student2");
        studentListManager.addStudent("student3");
        studentListManager.addStudent("student4");

        //Display students in list
        studentListManager.displayStudents();

        var students = new String[]{
                "student1",
                "student99",
                "student10",
                "student4",
                "student6"
        };

        //Finding student
        for (int i = 0; i < students.length; i++) {
            if(studentListManager.findStudent(students[i]) < 0){
                System.out.println(students[i] + " is not our student!");
            }
        }

        //Adding more students
        for (int i = 0; i < students.length *100; i++) {
            studentListManager.addStudent("student" + i);
        }

        studentListManager.displayStudents();

        //Removing student
        for (int i = 0; i < students.length * 100; i++) {
            if(i > 6){
                studentListManager.removeStudent("student" + i);
            }
        }

        studentListManager.displayStudents();
    }
    /**
     * Tests Linked List Exercise
     * */
    public static void RunLinkedListExercise(){
        //Create a new Linked List
        IntegerLinkedList linkedList = new IntegerLinkedList();

        //Add elements to head
        linkedList.addToHead(8);
        linkedList.addToHead(83);
        linkedList.addToHead(92);

        linkedList.display("Head Addition");


        // add elements to tail
        linkedList.addToTail(12);
        linkedList.addToTail(32);
        linkedList.addToTail(32);

        linkedList.display("Tail Addition");

        //Add to index
        linkedList.addToIndex(2, 9);

        linkedList.display("Index Addition");


        // delete
        linkedList.deleteFromIndex(2);
        linkedList.display("Delete From Index");
    }
}
