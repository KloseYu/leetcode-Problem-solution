#define MAX(a, b) ((a) > (b) ? (a) : (b))
int maxDepth(char * s){
    int ans =0;
    int size =0;
    for(int i=0; i<strlen(s);i++){
         if (s[i] == '(') {
            ++size;
            ans = MAX(ans, size);
        } else if (s[i] == ')') {
            --size;
        }
    }
    return ans;
}

