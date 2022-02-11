int cmp(const void *a, const void *b){
    return *(int*)b - *(int*)a;
}
int minimumDifference(int* nums, int numsSize, int k){
    qsort(nums,numsSize,sizeof(int),cmp);
    int l = 0, r = k-1;
    int min = 100001;
    while(r < numsSize){
        min = nums[l] - nums[r] < min ? (nums[l] - nums[r]) : min;
        l++;
        r++;
    }
    return min;
}

