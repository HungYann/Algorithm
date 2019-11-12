import java.util.Arrays;

public class selectionSort {

    public static void main(String args[])
    {
        int[] array = new int[]{1,2,3,5,12,21,13};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array)
    {
        for(int i=0;i<array.length-1;i++)
        {

            int min = array[i];
            int min_index = i;

            for(int j=i+1;j<array.length;j++)
            {
                if(min>array[j]) {
                    min = array[j];
                    min_index = j;
                }
            }
            swap(array,i,min_index);
        }


    }

    public static void swap(int[] array,int i, int j)
    {
        int temp = 0;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
