#define MAX(a, b) ((a) > (b) ? (a) : (b))
int findLUSlength(char * a, char * b) {
    if (strcmp(a, b) != 0) return MAX(strlen(a), strlen(b)) ; else return -1; 
}
