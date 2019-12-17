import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args)
    {
        InsertionSort insertsort = new InsertionSort();

        int[] Array = {2,5,7,8,2,1,5,7,1};

        insertsort.sort(Array);

        System.out.println(Arrays.toString(Array));


    }

    void sort(int[] array)
    {
        int length = array.length;

        for(int i=1;i<array.length;i++)
        {
            int key = array[i];
            int j = i - 1;

            while(key<array[j]&&j>0)
            {
                array[j+1] = array[j];
                j--;
            }

            array[j] = key;

        }

    }



}
