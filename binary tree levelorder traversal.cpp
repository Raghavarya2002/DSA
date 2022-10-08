//  binary tree level order traversal

// link-https://leetcode.com/problems/binary-tree-level-order-traversal/
// striver youtube  link-https://www.youtube.com/watch?v=EoAsWbO7sqg&t=427s

// approach

 // 1-for level order traversal we use queue
//  2-then just push the root
//  3-while loop until queue is empty
// 4-form new vector
// 5-traverse the level upto queue size
// 6-form a node and then pop
// 7-check for left and right of the node if exist then push it into queue
// 8-node->val is pushing the nodes into level vector
// 9-at last we just push height by height vector(level) into ans
// finally return the ans

 
 
 vector<vector<int>> levelOrder(TreeNode* root) {
    vector<vector<int>> ans;
    if(root==NULL)
       return ans;
    queue<TreeNode*> q;
    q.push(root);
    while(!q.empty()){

      int size=q.size();
      vector<int> level;
    
    for(int i=0;i<size;i++){
        TreeNode *node=q.front();
        q.pop();
        if(node->left!=NULL)
          q.push(node->left);
        if(node->right!=NULL)
          q.push(node->right)
        level.push_back(node->val);

    }
    ans.push_back(level);

    }
return ans;
 }