## 7. Reverse  Integer


Description:

Given a 32-bit signed integer, reverse digits of an integer.

**Example 1:**

Input: 123

Output: 321

**Example 2:**

Input: -123

Output: -321

**Example 3:**

Input: 120

Output: 21

Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

```{java}
class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int pop = 0;
        while(x!=0)
        {
            pop = x%10; 
            x = x/10;
            
            if(reversed>Integer.MAX_VALUE/10 || (reversed==Integer.MAX_VALUE/10 && pop>7)){
            return 0;
            }
        
        	if(reversed<Integer.MIN_VALUE/10 || (reversed==Integer.MIN_VALUE/10 && pop<-8)){
            return 0;
            }
            
            reversed = reversed*10+pop;
            
        }
        
        
       
        return reversed;
    }
}
```

在本题中，难点主要是有限整数的翻转和防止值溢出。

- 对于有限整数的翻转，本题采用的方法是用循环，取余，再除以10的方法
- 而对于栈溢出

根据如下公式：
![](https://tva1.sinaimg.cn/large/006tNbRwgy1g9wl7eihufj30tc0bswgd.jpg)


采用：

if (reversed>Integer.MAX_VALUE || (reversed==Integer.MAX_VALUE && pop>7)

if(reversed<Integer.MIN_VALUE || (reversed==Integer.MIN_VALUE && pop<-8))


当然还有一种解法就是使用long型号数组，再转化成（int）, 这里省去了复杂的公式判断；因为在int型中，如果不按照公式进行判断的话，就会溢出，缺点是由于测试数据并未超过long型号的长度，所以也能通过。

```{}
 public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
    }

```
