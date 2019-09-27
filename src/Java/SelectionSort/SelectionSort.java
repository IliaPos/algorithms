package Java.SelectionSort;

public class SelectionSort {


    public static void main(String[] args) {
        int[] array = new int[10];
        settingArray(array);
        showArray(array);
        System.out.println("///////////////////////////////////");
        initSelectionSort(array);
        showArray(array);
    }

    private static void initSelectionSort(int[] array) {
        int min, temp;
        int length = array.length;
        for (int i = 0; i < length - 1; i++)
        {
            min = i;
            for (int j = i + 1; j < length; j++)
            {
                if (array[j] < array[min])
                {
                    min = j;
                }
            }
            if (min != i)
            {
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    private static void showArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    private static void settingArray(int[] array) { // filling the array
        for(int i = 0; i<array.length; i++){
            int rand = (int)(Math.random() * 10) + 1;
            array[i] = rand + i;
        }
    }
}
