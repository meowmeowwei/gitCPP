# 字节跳动-抖音C++开发实习一二面凉经

作者：小闸蟹  
链接：[https://www.nowcoder.com/discuss/342523?type=all&order=time&pos=&page=1](https://www.nowcoder.com/discuss/342523?type=all&order=time&pos=&page=1)  
来源：牛客网  
  
一面： 

**longest substring with no duplicate**   


```text
//leetcode question 3 , longest substring 

1) Brute force style 

// for each possible combination, do checking for unique values 
// Time Complexity O(n^3)
// Space Complexity O(min(n.m))

class Solution {
public:
    
    bool allUnique (string s, int start, int end){
        set<char> valueSet;
        for(int i= start; i < end; i++){
            if(valueSet.find(s[i])!= valueSet.end()){
                return false;
            }
            else{
                valueSet.insert(s[i]);
            }
        }
        return true;
    }
    
    
    int lengthOfLongestSubstring(string s) {
        int ans = 0;
        for(int i=0; i< s.size(); i++){
            for(int j = i+1; j < s.size() +1; j++){
                if(allUnique(s, i, j)){
                    ans = max(ans, j-i);
                }
            }
        }
        return ans;
    }
};



2) Sliding window

//Time complexity O(2n)

class Solution {
public:
    
    
    int lengthOfLongestSubstring(string s) {
        int ans=0, i=0, j = 0;
        
        int n = s.size();
        
        set<char> setValues ;
        
        while (i < n && j <n){
            if(setValues.find(s[j]) == setValues.end()){
                setValues.insert(s[j++]);
                ans = max(ans, j-i);
            }
            else{
                setValues.erase(s[i++]);
            }
        }
        return ans;
        
    }
};
```



 **std::unordered\_map vs std::map difference** 

```text
unorded_map 
-> internally implememented using HashTable, key is hashed into a bucket
-> time complexity is about O(1)

map 
-> like a set, implemented using balanced tree
-> time complexity is O(LogN)

```



  
 对智能指针有多少了解？  
 std::weak\_ptr如何转std::shared\_ptr  
 std::weak\_ptr::lock存在的意义是什么  
 C++各种虚函数、重载，看代码写输出  
 实现\#define max\(a, b, c\)  
 对3D有什么了解  
 还有什么要问的吗？  
  
 二面： 你最自豪的事情是什么  
 你的优点是什么  
 有什么值得分享的经历吗  
 如何测试你的项目的  
 如何保证你的项目质量  
 对方满意你的进度吗  
 你自己实现的字符串类支持宽字符吗，实现了多少函数，满足工程需要吗 你说你喜欢研究STL和Qt，为什么呢 你说你喜欢了解C++的新特性，但是不可能组里每个人都因为你使用新特性而更换编译器版本，为什么还要拼命追求那么多新特性呢  
 析构函数可以是纯虚函数吗  
 内存池了解过吗，为什么要有内存池  
 什么是内存碎片，为什么会有内存碎片，如何处理内存碎片  
 C++反射有了解过吗，标准有吗，第三方库呢，说说看  
 命令模式是什么  
 工厂模式是什么，写一个看看  
 不允许分发实际代码让对方修改，但是对方想添加新功能，如何实现，有什么模式可以做到吗  
 详细介绍快排  
 如何选择基准数  
 随机选择基准数万一每次都选到了最坏的情况呢，如何处理？如何确保时间复杂度  
 为什么快排时序列长度短的情况下会选择其他排序，优点在哪  
 如何处理快速排序最坏的情况  
 还有什么问题要问吗  

