import java.util.*;

public class hashMap {
    public static void main(String[] args)
    {
        int[] arrays = {1,4,5,2,6,1,10,3};
        hashMap(arrays);
    }

    public static void hashMap(int[] arrays)
    {

        HashSet hashset = new HashSet();

        for(Integer a: arrays)
        {
            hashset.add(a);
        }






        HashMap<Integer,Integer> hashMap= new HashMap<Integer,Integer>();
        for(int i=0;i<arrays.length;i++)
        {
            hashMap.put(i,arrays[i]);
        }

        int[][] arr = new int[7][7];

        Iterator iterator = hashset.iterator();


        while (iterator.hasNext())
        {
                int value =(int)iterator.next();
                for(int i=0;i<arrays.length;i++)
                {
//                    System.out.println(value);
//                    System.out.println("-->"+hashMap.get(i));
                     if(hashMap.get(i).equals(value))
                     {
                           arrays[i] = value;
                     }
                 }
        }

        System.out.println(Arrays.toString(arr));

    }
}
