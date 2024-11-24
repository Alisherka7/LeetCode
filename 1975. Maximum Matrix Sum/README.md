# 1975. Maximum Matrix Sum

You are given an n x n integer matrix. You can do the following operation any number of times:

* Choose any two adjacent elements of matrix and multiply each of them by -1.
  
Two elements are considered adjacent if and only if they share a border.

Your goal is to maximize the summation of the matrix's elements. Return the maximum sum of the matrix's elements using the operation mentioned above.

 

### Example 1:
<img width="409" alt="Screenshot 2024-11-24 at 9 17 33 PM" src="https://github.com/user-attachments/assets/dfb40b0f-bbee-44ef-8b2a-4ae5a509f40d">

```
Input: matrix = [[1,-1],[-1,1]]
Output: 4
Explanation: We can follow the following steps to reach sum equals 4:
- Multiply the 2 elements in the first row by -1.
- Multiply the 2 elements in the first column by -1.
```
### Example 2:
<img width="326" alt="Screenshot 2024-11-24 at 9 17 41 PM" src="https://github.com/user-attachments/assets/4b3f4406-f542-4f2e-b989-2b1b3620cb32">

```
Input: matrix = [[1,2,3],[-1,-2,-3],[1,2,3]]
Output: 16
Explanation: We can follow the following step to reach sum equals 16:
- Multiply the 2 last elements in the second row by -1.
```
 

### Constraints:
```
n == matrix.length == matrix[i].length
2 <= n <= 250
-10^5 <= matrix[i][j] <= 10^5
```
