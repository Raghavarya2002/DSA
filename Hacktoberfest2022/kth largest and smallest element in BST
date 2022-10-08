import java.util.*;
class Node{
	int data;
	Node left,right;
	Node(int val)
	{
		data=val;
		left=null;
		right=null;
	}
}
public class TUF{

static Node insertBST(Node root,int val)
{
	if(root==null)
	{
		return new Node(val);
	}
	if(val<root.data)
	{
		root.left=insertBST(root.left,val);
	}
	else
	{
		root.right=insertBST(root.right,val);
	}
	return root;
}

static Node kthlargest(Node root,int k[])
{
	if(root==null)
	return null;
	
	Node right=kthlargest(root.right,k);
	if(right!=null)
	return right;
	k[0]--;
	
	if(k[0]==0)
	return root;
	
	return kthlargest(root.left,k);
}

static Node kthsmallest(Node root,int k[])
{
	if(root==null)
	return null;
	
	Node left=kthsmallest(root.left,k);
	if(left!=null)
	return left;
	k[0]--;
	if(k[0]==0)
	return root;
	
	return kthsmallest(root.right,k);
}
public static void main(String args[])
{
	
	int arr[]={10,40,45,20,25,30,50},i;
	
	int k=3;
	Node root=null;
	for(i=0;i<7;i++)
	{
		root=insertBST(root,arr[i]);
	}
	System.out.println();
	
	int p=k;
	Node large=kthlargest(root,new int[]{k});
	k=p;
	Node small=kthsmallest(root,new int[]{k});
	if(large==null)
	{
		System.out.println("Invalid input");
	}
	else
	System.out.println("kth largest element is  "+large.data);
	
	if(small==null)
	{
		System.out.println("Invalid input");
	}
	else
	{
		System.out.println("kth smallest element is  "+small.data);
	}
}
}
