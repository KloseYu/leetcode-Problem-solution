// 为 Solution 实现一些函数
impl Solution {
    // 定义一个函数 my_pow，接受两个参数 x 和 n，返回 x 的 n 次方
   pub fn my_pow(x: f64, n: i32) -> f64 {
        // 定义两个可变变量 varx 和 varn，分别赋值为 x 和 n
        let mut varx = x;
        let mut varn = n;
        // 如果 varn 等于 0，返回 1.0
        if varn == 0 {
            1.0
        // 如果 varn 小于 0，将 varx 取倒数，将 varn 取相反数
        } else if varn < 0 {
            varx = 1.0 / varx;
            varn = -varn;
            // 调用 fast_pow 函数，返回结果
            Self::fast_pow(varx, varn)
        // 否则，直接调用 fast_pow 函数，返回结果
        } else {
            Self::fast_pow(varx, varn)
        }
    }

    // 定义一个函数 fast_pow，接受两个参数 x 和 n，返回 x 的 n 次方
    fn fast_pow(x: f64, n: i32) -> f64 {
        // 如果 n 等于 0，返回 1.0
        if n == 0 {
            return 1.0;
        }
        
        // 定义一个变量 half，赋值为 fast_pow(x, n / 2) 的结果
        let half = Self::fast_pow(x, n / 2);
        
        // 如果 n 是偶数，返回 half 的平方
        if n % 2 == 0 {
           return half * half; 
        // 否则，返回 half 的平方乘以 x
        } else {
           return half * half * x; 
        }
    }
}
