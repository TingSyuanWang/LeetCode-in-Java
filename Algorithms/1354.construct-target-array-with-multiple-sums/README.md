# [1354. Construct Target Array With Multiple Sums](https://leetcode.com/problems/construct-target-array-with-multiple-sums/)

You are given an array `target` of n integers. From a starting array `arr` consisting of `n` 1's, you may perform the following procedure :

- let `x` be the sum of all elements currently in your array.
- choose index `i`, such that `0 <= i < n` and set the value of `arr` at index `i` to `x`.
- You may repeat this procedure as many times as needed.

Return `true` _if it is possible to construct the_ `target` _array from_ `arr` _, otherwise, return_ `false`.

**Example 1:**

```
Input: target = [9,3,5]
Output: true
Explanation: Start with arr = [1, 1, 1]
[1, 1, 1], sum = 3 choose index 1
[1, 3, 1], sum = 5 choose index 2
[1, 3, 5], sum = 9 choose index 0
[9, 3, 5] Done
```

**Example 2:**

```
Input: target = [1,1,1,2]
Output: false
Explanation: Impossible to create target array from [1,1,1,1].
```

**Example 3:**

```
Input: target = [8,5]
Output: true
```

## Solutions
1. [PriorityQueue](./ConstructTargetArrayWithMultipleSums.java)
    - Runtime: faster than 19.19%.
    - Memory usage: less than 84.85%
2. [Recursion](./ConstructTargetArrayWithMultipleSums2.java)
    - Runtime: faster than 98.99%.
    - Memory usage: less than 39.39%
