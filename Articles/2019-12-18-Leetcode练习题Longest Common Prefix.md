**Question:**


Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

**Example 1:**


```{}
Input: ["flower","flow","flight"]
Output: "fl"
```

**Example 2:**

```{}
Input: ["dog","racecar","car"]
Output: ""

```


Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters **a-z**.


我的解法思路是：

首先比较第一个和第二个字符的第i字母，如果第一个和第二个字符的第i个字母相同，则比较第二个和第三个的第i个字母，如果都相等，则将第i个字母加入最后的str中，i的大小从0开始，直到循环最后。


存在的问题是：


```{java}
class Solution {
    public String longestCommonPrefix(String[] strs) {
      
        int Strslength = strs.length;


        if(Strslength>1)
        {

            int minLength = strs[0].length();
            //O(n)
            for(String str:strs)
            {
                int strLength = str.length();
                if(minLength > strLength)
                {
                    minLength = strLength;
                }
            }

            //Store output ;
            String str = "";


           label:for(int i=0;i<minLength;i++)
            {

                for(int j=1;j<strs.length;j++)
                {

                    if((strs[j-1].charAt(i))!=(strs[j].charAt(i)))
                    {

                            break label;
                        
                    }

                }

            str+= strs[0].charAt(i);
            }
            return str;

        }
        else if(Strslength==1)
        {
            return strs[0];
        }
        else
        {
            return "";
        }

       

       
    }
}
```

![](https://tva1.sinaimg.cn/large/006tNbRwgy1ga11mrbnq7j30x20leq63.jpg)

其他人的解法：





![](https://tva1.sinaimg.cn/large/006tNbRwgy1ga15dg0wcmj308e0imabq.jpg)

在这个解法中，作者主要通过找到两个string中相等的那个值，然后返回结果作为字串继续寻找使用**indexOf**函数，找到第一个相等的位置。

```{}
    public static String longestCommonPrefix(String[] strs) {
            if(strs.length==0){return "";}
            String  prefix = strs[0];
            for(int i=1;i<strs.length;i++)
            {
                while (strs[i].indexOf(prefix)!=0)
                {
                    prefix= prefix.substring(0,prefix.length()-1);
                }
            }

            return prefix;
    }
```

