class Solution {
    public int reverse(int x) {
        int r = 0, y = x;
        while (y != 0) {
             if (r <Integer.MIN_VALUE / 10 || r > Integer.MAX_VALUE / 10) {
            return 0;
        }
        int digit = y % 10;
        y /= 10;
        r = r * 10 + digit;
        }    
        return r;
    }
}
