/**********************************************************
	Following is the Binary Tree Node class structure

	template <typename T>
	class BinaryTreeNode {
    	public : 
    	T data;
    	BinaryTreeNode<T> *left;
    	BinaryTreeNode<T> *right;

    	BinaryTreeNode(T data) {
        	this -> data = data;
        	left = NULL;
        	right = NULL;
    	}
	};

***********************************************************/

#include <queue>
void zigZagOrder(BinaryTreeNode<int> *root) {
    if(root==NULL)
        return;
    queue<BinaryTreeNode<int>*> q;
    q.push(root);
    int level = 0;//for keeping a check on levels
    while(1)
    {
        int nodecount = q.size();
        if(nodecount==0)
            break;
        vector<int>v;//making a vector of int type
        while(nodecount>0)//if it get false that means all node of a specific level are pushed in vector
        {
            BinaryTreeNode<int>* front = q.front();
            q.pop();
            v.push_back(front->data);//pushing front ka data in vector becoz vector is of int type
          //now pushing the children in queue
                if(front->left!=NULL)
                    q.push(front->left);
                if(front->right!=NULL)
                    q.push(front->right);
            nodecount--;//reducing the count 
        }
        if(level%2==0)//now checking on which level we are and accordingly printing the data
        {
            for(int i=0;i<v.size();i++)
            {
                cout<<v[i]<<" ";
            }
        }
        else
        {
            for(int i=v.size()-1;i>=0;i--)
            {
                cout<<v[i]<<" ";
            }
        }
        cout<<endl;
        level++;//increasing the level as now this level is done
    }
}
int level = 0;
while(1)
{
    
}
