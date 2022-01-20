class Solution {
   public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int[] ansArr = new int[num1.length()+ num2.length()];
        for (int i = num1.length()- 1; i >= 0; i--) {
            int x = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {
                int y = num2.charAt(j) - '0';
                ansArr[i + j + 1] += x * y;
            }
        }
        for (int i = num1.length()+ num2.length() - 1; i > 0; i--) {
            ansArr[i - 1] += ansArr[i] / 10;
            ansArr[i] %= 10;
        }
        int index = ansArr[0] == 0 ? 1 : 0;
        StringBuffer ans = new StringBuffer();
        while (index < num1.length()+ num2.length()) {
            ans.append(ansArr[index]);
            index++;
        }
        return ans.toString();
    }
}
