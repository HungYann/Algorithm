import java.util.Arrays;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] ara = new int[]{1,2,3,23,23,1};
        Arrays.sort(ara);
        int key = 5;
        binarySearch(ara,key);
    }

    public static void binarySearch(int[] ara,int key)
    {

        int begin = 0;
        int end = ara.length-1;
        int isFind = 0;


        while(ara[begin]<=ara[end])
        {
            int mid = (begin +end)/2;
            if(ara[mid]>key)
            {
                    end = mid-1;
            }
            else if(ara[mid]<key)
            {
                    begin = mid+1;
            }
            else
            {
                isFind = 1;
                System.out.println(mid);

                break;
            }

        }

        if(isFind==0)
        {
            System.out.println("not find!");
        }else
        {
            System.out.println("find!"+"AND the position is:");
        }

    }
}