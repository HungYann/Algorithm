## Leetcode练习题Remove Element


### Question：

Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

**Example 1:**

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

It doesn't matter what you leave beyond the returned length.


**Example 2:**

Given nums = [0,1,2,2,3,0,4,2], val = 2,

Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.

Note that the order of those five elements can be arbitrary.

It doesn't matter what values are set beyond the returned length.

### Solution:

```{java}
class Solution {
    public int removeElement(int[] nums, int val) {
    
      int newIndice = 0;
    
      for(int i=0;i<nums.length;i++)
      {
             if(nums[i]!=val)
             {
                 nums[newIndice++] = nums[i];
             }
      }
      
        
      return newIndice;
        
    }
}
```
在本题中，主要考点是利用两个指针来实现数组内的内容判断和复制。比如，在本题中我利用newIndice来作为一个比原始指针慢的指针来指向过滤后内容的值，并自增，就实现了目标，得到了新的数组。

另外有趣的是，我将本题看成计算数组中有多少个不重复数组的值；另外延伸一下，再计算每个不重复值的个数；

接下来我们一次考虑：

- 计算数组中有多少个不重复的值：

思路是使用Hashset来计算，因为HashSet中，每个值仅允许出现一次，所以当我们将值都add进去的时候。




```{java}
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

```





