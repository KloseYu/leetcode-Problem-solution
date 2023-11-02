impl Solution {
    pub fn multiply(num1: String, num2: String) -> String {
        let m = num1.len();
        let n = num2.len();

        let mut res = Vec::new();
        res.resize(m + n, 0);


        for i in (0..m).rev() {
            for j in (0..n).rev() {
                let mul = (num1.as_bytes()[i] - '0' as u8) * (num2.as_bytes()[j] - '0' as u8);

                let p1 = i + j;
                let p2 = i + j + 1;
                let sum = mul + res[p2];

                res[p1] += sum / 10;
                res[p2] = sum % 10;
            }
        }
        let mut i = 0;
        while i < res.len() && res[i] == 0 {
            i += 1;
        }

        let mut res_str = String::new();
        while i < res.len() {
            res_str.push(char::from_digit(res[i] as u32, 10).unwrap());//unwrap包含关系
            i += 1;
        }

        if res_str.len() == 0 {
            "0".to_string()
        } else {
            res_str
        }
    }
}