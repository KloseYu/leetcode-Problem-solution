/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findBall(int** grid, int gridSize, int* gridColSize, int* returnSize) {
    int n = gridColSize[0];
    int * ans = (int *)malloc(sizeof(int) * n);
    memset(ans, - 1, sizeof(int) * n);
    for (int j = 0; j < n; ++j) {
        int col = j; // 球的初始列
        for (int i = 0; i < gridSize; i++) {
            int dir = grid[i][col];
            col += dir; // 移动球
            if (col < 0 || col == n || grid[i][col] != dir) { // 到达侧边或 V 形
                col = -1;
                break;
            }
        }
        if (col >= 0) {  // 成功到达底部
            ans[j] = col;
        }
    }
    *returnSize = n; 
    return ans;
}



