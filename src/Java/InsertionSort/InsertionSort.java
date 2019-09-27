package Java.InsertionSort;




public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        settingArray(array);
        showArray(array);
        System.out.println("///////////////////////////////////");
        initInsertionSort(array);
        showArray(array);
    }

    private static void showArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    private static void initInsertionSort(int[] array) {
        for(int i = 1; i<array.length; i++){
            for(int j = i; j>0 && array[j-1]>array[j]; j--){ // while j>0 and cell j-1 > j
                int temp = array[j-1];                      // do swap elements
                array[j-1] = array[j];
                array[j] = temp;

            }
        }
    }

    private static void settingArray(int[] array) { // filling the array
        for(int i = 0; i<array.length; i++){
            int rand = (int)(Math.random() * 10) + 1;
            array[i] = rand + i;
        }
    }
}
