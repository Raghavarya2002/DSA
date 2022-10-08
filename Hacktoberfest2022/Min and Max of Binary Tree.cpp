/*
	The first value of the pair must be the minimum value in the tree and 
	the second value of the pair must be the maximum value in the tree
*/
#include <climits>
#include <algorithm>

pair<int,int>  getMinAndMax(BinaryTreeNode<int> *root) {
    pair<int,int> answer;
    answer.first = INT_MAX;
    answer.second = INT_MIN;
    if(root==nullptr)
        return answer;
    // Initialize answer as root node data
    pair<int,int>  left =  getMinAndMax(root->left);
    pair<int,int> right =  getMinAndMax(root->right);
    answer.first = min(root->data, min(left.first, right.first));
    answer.second = max(root->data, max(left.second, right.second));
    return answer;
}
