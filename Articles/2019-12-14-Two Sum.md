
## 1 Two Sum:


- [Question](#1)

- [Solution](#2)

- [知识点总结](#3)

- [常见方法](#4)

- [HashMap由value获得key](#5)




<h3 id="1"> Question：</h3>
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].


<h3 id="2"> Solution:</h3>



```{java}
class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            hashmap.put(nums[i],i);
        }
        
        int v1=0,v2=0;
        for(int m=0;m<nums.length;m++)
        {
            int complement = target-nums[m];
            if (hashmap.containsKey(complement)&&( hashmap.get(complement)!=m))
            {
                return new int[] {m,hashmap.get(target-nums[m])};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
       
        
    }
}

```


<h3 id="3"> 知识点总结：</h3>


ClassMap<K,V>

*K* - the type of keys maintained by this map

*V* - the type of mapped values


<h3 id="4"> 常见方法：</h3>


- **clear**:

Removes all of the mappings from this map.

- **containsKey**:

Returns true if this map contains a mapping for the specified key.

- **containsValue**:

Returns true if this map maps one or more keys to the specified value.

- **get**:

Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.

- **put**:

Associates the specified value with the specified key in this map.

- **size**:

Returns the number of key-value mappings in this map.

- **replace**:

Replaces the entry for the specified key only if it is currently mapped to some value.

- **isEmpty**:

Returns true if this map contains no key-value mappings.

- **remove**:

Removes the mapping for the specified key from this map if present.

- **keySet**:

Returns a Set view of the keys contained in this map.


<h3 id="5">  HashMap由value获得key:</h3>

由于hashmap中key值唯一，而value值不唯一；所以一般都是通过get函数实现,获得value值；而如果想通过value获得key这需要自己写，可通过如下操作；

- 查找一个key值：

```{}
public class HashMap
{
	public static String getKey(HashMap<Integer,Integer> hashmap,int v alue)
	{
		int findValue = 0;
		//迭代循环
		for(Integer getKey:hashmap.keySet())
		{
			if(hashmap.get(getKey).equals(findValue))
			{
				findValue = getKey
			}
		}
		
		return findValue;
	}
}
```


- 查找一个key集合

```{}
public static List<Integer> getKeyList(HashMap<Integer,Ingeger> hashmap, int value)
{
	List<Integer> list = new ArrayList();
	for(Integer getKey:hashmap.keySet())
	{
		if(hashmap.get(getKey).equals(value))
		{
			list.add(getKey);
		}
	}
	return list;
}


```

**References:**


[HashMap API](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)	