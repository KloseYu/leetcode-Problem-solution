/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */


/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
 typedef struct TreeNode TREENODE;
 //定义逆向先根遍历
 void ReversePreorder(TREENODE* root,int depthPtr,int* returnSize,int* result)
{
    if(root==NULL)
    return;
//每层右节点可见，存入并且更新*result
    if(depthPtr>*returnSize)
    {
        result[*returnSize]=root->val;
        *returnSize=depthPtr;
    }
 //先遍历右子树，后遍历左子树
   ReversePreorder(root ->right,depthPtr+1,returnSize,result);
   ReversePreorder(root ->left,depthPtr+1,returnSize,result);
}
int* rightSideView(TREENODE* root, int* returnSize)
{
*returnSize=0;//初始化returnSize
int *result=(int*)malloc(sizeof(int)*1000);
ReversePreorder(root,1,returnSize,result);
 return result;
}
