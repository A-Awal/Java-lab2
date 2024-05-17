package Part_3;

/**
 * Contain sort algorithm of exercise 3
 */
public final class SortAlgorithms {

    /**
     * Sorts an array using bubble sort
     * @param array array to be sorted
     * @return Sorted array
     * @param <T> type of array to be sorted
     */
    public static  <T extends Comparable<T>> T[]  bubbleSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length-2; j++) {
                if(array[j].compareTo(array[j+1]) > 0 ){
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * Sorts an array using selection sort
     * @param array array to be sorted
     * @return Sorted array
     * @param <T> type of array to be sorted
     */
    public static  <T extends Comparable<T>> T[] selectionSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j].compareTo(array[minIndex]) < 0){
                    minIndex = j;
                }
            }
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

        }
        return array;
    }


}
