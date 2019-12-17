public class Fibonacci {



    int fib(int n)
    {
        int[] array = new int[n+1];


        array[0] = 0;
        array[1] = 1;


        for(int j=2;j<=n;j++)
        {
            array[j] = array[j-1]+array[j-2];
        }

        return array[n];

    }




    public static void main(String[] args)
    {
        Fibonacci f = new Fibonacci();

        System.out.println(f.fib(40));
    }

}


