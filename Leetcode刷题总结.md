已解决的问题：



|#|Title|
|---|---|
| 1|[Two Sum](#1) |
|7|[Reverse Integer](#2) |
|9|Palindrome Number|
|13|Roman to Integer|
|14|Longest Common Prefix|
|26|[Remove Duplicates from Sorted Array](#26)|
|27|Remove Element |
|35|Search Insert Position|
|58|Length of Last Word|
|704|Binary Search |




<h5 id="1">1 Two Sum</h5>

在解决Two Sum问题时，可以利用hashmap来解决此问题；利用put函数放入键和序列，再利用
containsKey函数查找target-nums[m]的值，如果返回值不为0；则可以返回键的序列值；

<h5 id="2">7 Reverse Integer</h5>

在本题中，难点主要是有限整数的翻转和防止值溢出。

- 对于有限整数的翻转，本题采用的方法是用循环，取余，再除以10的方法
- 而对于栈溢出

根据如下公式：
![](https://tva1.sinaimg.cn/large/006tNbRwgy1g9wl7eihufj30tc0bswgd.jpg)


采用：

**if (reversed>Integer.MAX__VALUE || (reversed==Integer.MAX__VALUE && pop>7)**

**if(reversed<Integer.MIN__VALUE || (reversed==Integer.MIN__VALUE && pop<-8))**


当然还有一种解法就是使用long型号数组，再转化成（int）, 这里省去了复杂的公式判断；因为在int型中，如果不按照公式进行判断的话，就会溢出，缺点是由于测试数据并未超过long型号的长度，所以也能通过。

<h5 id="26">26 Remove Duplicates from Sorted Array</h5>

移除重复值这一题挺让人困惑的，因为题目要求整数，但是返回值是数组

题目中描述需要返回一个没有重复序列的数组，并且不能使用额外的内存开销。我的解法思路是两个指针，和官方答案差不多。

由于数组已经是排序好的了，我们可以设置两个指针**i**和**j**,**i**比**j**慢，因为**i**用来存储新数组的长度。而**j**用来判断。

- 1.如果*nums[i] == nums[j]*,则我们增加**j**的值略过；
- 2.如果*nums[i] != nums[j]*,则我们将**nums[j]**的值给**nums[i+1]**,因为只有这样**i**中才能不是重复的值；
- 3.重复以上两步直到**j**到达数组的末尾；