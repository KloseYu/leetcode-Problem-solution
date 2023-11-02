impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        for i in 0..nums.len() { // 枚举 i
            for j in i + 1..nums.len() { // 枚举 i 右边的 j
                if nums[i] + nums[j] == target { // 满足要求
                    return vec![i as i32, j as i32]; // 返回两个数的下标
                }
            }
        }
        unreachable!() // 题目保证有解，循环中一定会 return
    }
}
