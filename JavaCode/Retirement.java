import sun.security.provider.Sun;

//递归学习

import java.util.Arrays;

public class Retirement {
    public static  void main(String[] args)
    {
        int[] array = {3,1,2,5,6,12};


        System.out.println(Sum(array));

    }

    public static int Sum(int[] array)
    {

        if(array.length<=1)
        {
           return array[0];
        }
        else
        {

            int newArray[];

            newArray  = Arrays.copyOfRange(array,1,array.length);

            return array[0]+Sum(newArray);

        }
    }

}
