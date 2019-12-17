import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args)
    {
        int[] arrays = {1,4,5,2,6,1,10,3};
        hashset(arrays);
    }

    public static void hashset(int[] arrays)
    {
        HashSet hashset = new HashSet();
        for(Integer a: arrays)
        {
            hashset.add(a);
        }


        Iterator iterator = hashset.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
