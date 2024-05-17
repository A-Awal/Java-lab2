package Part_3;

public class P3_Main {
    public static void RunSearchAgos() {
        String[] str = new String[]{"hello", "world", "foo"};

        //Trying linear search
        System.out.println("linear search test test");
        if(SearchAlgorithms.linearSearch(str, "foo") > 0){
            System.out.println("Found Linear Search Algorithm");
        }
        else {
            System.out.println("Not Found Linear Search Algorithm");
        }

        //trying binary search
        System.out.println("binary search test test");
        if(SearchAlgorithms.binarySearch(str, "foo") >= 0){
            System.out.println("Found Binary Search Algorithm");
        }else {
            System.out.println("Not Found Binary Search Algorithm");
        }

    }

    public static void runSortAlgos() {
        String[] str = new String[]{"c","d","a","b"};

        //trying Selection sort

        System.out.println("selection sort test");
        for (int i = 0; i < str.length; i++) {
            System.out.println(SortAlgorithms.selectionSort(str)[i]);
        }

        //trying bubble sort
        System.out.println("bubble sort test");
        for (int i = 0; i < str.length; i++) {

            System.out.println(SortAlgorithms.bubbleSort(str)[i]);
        }
    }
}
