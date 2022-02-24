static inline void swap(char *l, char *r) {
    *l^= *r;
    *r^= *l;
    *l^= *r;
}
char *reverseOnlyLetters(char *s){
    int n = strlen(s);
    int left = 0, right = n - 1;
    while (true) {
        while (left < right && !isalpha(s[left])) { // 判断左边是否扫描到字母
            left++;
        }
        while (right > left && !isalpha(s[right])) { // 判断右边是否扫描到字母
            right--;
        }
        if (left >= right) {
            break;
        }
        swap(s + left, s + right);
        left++;
        right--;
    }
    return s;
}


