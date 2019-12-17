import java.util.Arrays;

public class Shell {
    public static void main(String[] args)
    {
        int[] Array = {2,5,7,8,2,1,5,7,1};
        shellSort(Array);
        System.out.println(Arrays.toString(Array));
    }

    public static void shellSort(int[] array)
    {
       int length = array.length;

       for(int gap=length/2;gap>0;gap/=2)
       {


            for(int i = gap;i<length;i++)
            {
                    int temp = array[i];
                    int j;
                    for (j=i;(j-gap>=0)&&(temp<array[j-gap]);j-=gap)
                    {
                        array[j] = array[j-gap];
                    }
                    array[j] = temp;
            }
       }
    }
}
