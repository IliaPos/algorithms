package Java.BubbleSort;

import java.util.ArrayList;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        settingArray(array);
        showArray(array);
        System.out.println("///////////////////////////////////");
        initBubbleSort(array);
        showArray(array);

    }
    private static void settingArray(int[] array) { // filling the array
        for(int i = 0; i<array.length; i++){
            int rand = (int)(Math.random() * 10) + 1;
            array[i] = rand + i;
        }
    }

    private static void showArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    private static void initBubbleSort(int[] array) {
        for(int i=0; i<array.length - 1; i++){
            for(int j = i+1; j<array.length; j++){
                    if(array[j] < array[i]){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
            }
        }
    }


}