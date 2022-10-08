// link-https://leetcode.com/problems/add-one-row-to-tree/
// youtube vedio link-https://www.youtube.com/watch?v=Za2OFfRLp70

// approach
// frist codition is for depth==1 just create newode and assign new nodes left to the old root value
// then just  basic procedure of level order traversal
// forming queue
// creating new variable level to just keep count the height
// 

TreeNode* addOneRow(TreeNode* root, int val, int depth) {
    if(depth==1)
     {
        TreeNode* curr=new TreeNode(val);
        curr->left=root;
        return curr;
     }
  
  queue<TreeNode*> q;
  q.push(root);
  int level=0;
  bool check=false;

  while(!q.empty()){
    int size=q.size();
    // as we entered in the root so level become 1
    level++;

    for(int i=0;i<size;i++){
          
          TreeNode* curr=q.front();
          q.pop();
        //   now just store the current nodes left and right into temporary left and right
        TreeNode* templ=curr->left;
        TreeNode* tempr=curr->right;

        if(level==(depth-1))
        {
            // now assign curr->left a value and same for curr->right
        curr->left=new TreeNode(val);
        curr->right=new TreeNode(val);
        // now just assigne curr->left->left with temp l and same for  curr->right->right
        curr->left->left=templ;
        curr->right->right=tempr;
        check=true;

        }
        if(templ) 
          q.push(templ);

        if(tempr)
          q.push(tempr);
    }
    // lastly just check check if it is true that means we have added the new row;
    if(check)
       break;

    }
    return root;
  }









