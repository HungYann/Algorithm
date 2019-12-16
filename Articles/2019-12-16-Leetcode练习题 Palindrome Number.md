## 9. Palindrome Number

**Question:**

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

```{}
Input: 121
Output: true

```

Example 2:

```{}
Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```


Example 3:

```{}
Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:
```
Coud you solve it without converting the integer to a string?

***

**Solution:**

解法一：

使用回文数解法，将输入x值分割存储在数组中，然后再取出判断。

```{}
class Solution {
    public boolean isPalindrome(int x) {
            if(x<0)
            {
                return false;
            }
        
            if(x==0)
            {
                return true;
            }
        
            if(x>0)
            {
                String string= x+"";
                int length = string.length();
                int[] index = new int[length];
                int reserve = 0;
                int i =0 ;
                while(x!=0)
                {
                    index[i++] = x%10;
                    x/=10;
                }
                
                for(int j=0;j<length/2;j++)
                {
                  
                    if(index[j]!=index[length-1-j])
                    {
                        return false;
                    }
                   
                }
                
                return true;
                
            }
            return false;
    }
}

```

解法二：

将**x**转化成字符串，然后利用charAt分割求character类型，在进行比较；虽然不符合题意，但是用到双指针知识，个人认为比较简洁。

```{}
public boolean isPalindrome(int x) {
    String str = String.valueOf(x);
    int start = 0;
    int end = str.length() - 1;
    while(start < end){
        if(str.charAt(start++) != str.charAt(end--)) return false;
    }
    return true;
}

```

解法三：

转换一半的数字：



Revert half of the number

**Intuition**

The first idea that comes to mind is to convert the number into string, and check if the string is a palindrome, but this would require extra non-constant space for creating the string which is not allowed by the problem description.

**Second idea would be reverting the number itself, and then compare the number with original number, if they are the same, then the number is a palindrome. However, if the reversed number is larger than \text{int.MAX}int.MAX, we will hit integer overflow problem.**

Following the thoughts based on the second idea, to avoid the overflow issue of the reverted number, what if we only revert half of the **int** number? After all, the reverse of the last half of the palindrome should be the same as the first half of the number, if the number is a palindrome.



For example, if the input is 1221, if we can revert the last part of the number "1221" from "21" to "12", and compare it with the first half of the number "12", since 12 is the same as 12, we know that the number is a palindrome.

Let's see how we could translate this idea into an algorithm.

***

**Algorithm**

First of all we should take care of some edge cases. All negative numbers are not palindrome, for example: -123 is not a palindrome since the '-' does not equal to '3'. So we can return false for all negative numbers.

**Now let's think about how to revert the last half of the number.** For number 1221, if we do 1221 % 10, we get the last digit 1, to get the second to the last digit, we need to remove the last digit from 1221, we could do so by dividing it by 10, 1221 / 10 = 122. Then we can get the **last digit** again by doing a modulus by 10, 122 % 10 = 2, and if we multiply the last digit by 10 and add the second last digit, 1 * 10 + 2 = 12, it gives us the reverted number we want. Continuing this process would give us the reverted number with more digits.

Now the question is, how do we know that we've reached the half of the number?

**Since we divided the number by 10, and multiplied the reversed number by 10, when the original number is less than the reversed number, it means we've processed half of the number digits.**


```
public boolean isPalindrome(int num){
   if(num < 0) return  false; 
   int reversed = 0, remainder, original = num;
   while(num != 0) {
        remainder = num % 10; // reversed integer is stored in variable
        reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
        num  /= 10;  //the last digit is removed from num after division by 10.
    }
    // palindrome if original and reversed are equal
    return original == reversed;
}
```