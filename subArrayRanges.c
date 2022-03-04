#define MAX(a, b) ((a) > (b) ? (a) : (b))
#define MIN(a, b) ((a) < (b) ? (a) : (b)) 
long long subArrayRanges(int* nums, int numsSize){
      long long ret = 0;
      for (int i = 0; i < numsSize;i++) { 
       int minVal = INT_MAX, maxVal = INT_MIN; 
       for (int j = i; j < numsSize; j++) { 
       minVal = MIN(minVal, nums[j]); maxVal = MAX(maxVal, nums[j]);
        ret += maxVal - minVal; }
         } return ret; 
}
