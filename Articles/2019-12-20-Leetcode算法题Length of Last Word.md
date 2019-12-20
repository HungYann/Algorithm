

### Length of Last Word


**Question:**


Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

**Example:**

```{}
Input: "Hello World"

Output: 5
```


**Solution:**



```{java}
class Solution {
    public int lengthOfLastWord(String s) { 
      String[] array = s.split(" "); 
      if(array.length==0) return 0;
      return array[array.length-1].length();
    }
}
```

在本题中，使用了split,该函数会将一个字符串分割成字符数组，如果数组的长度为0，则返回0，否则开始检验倒数第一个字符的长度。

需要注意的是，对于空字符数据，如果使用 array[0]进行判断，会出现错误，所以这里一定要警示。array[0]代表的不是空字符数组！