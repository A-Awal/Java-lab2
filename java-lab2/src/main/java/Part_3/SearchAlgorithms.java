package Part_3;

import java.util.Arrays;

public class SearchAlgorithms {

    public static  <T extends Comparable<T>> int  linearSearch(T[] array, T value){
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(value)){
                return i;
            }
        }
        return  -1;
    }

    public static  <T extends Comparable<T>> int binarySearch(T[] array, T value){
        Arrays.sort(array);
        int low = 0;
        int high = array.length - 1;
        while(low <= high){

            int mid = (low + high)/2;
            if(array[mid].equals(value)){

                return mid;
            }
           if(array[mid].compareTo(value) > 0){
               high = mid - 1;
           }else {
               low = mid + 1;
           }

        }
        return -1;
    }
}
