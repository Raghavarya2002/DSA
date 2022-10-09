// Problem Statement: -
// Given head, the head of a linked list, determine if the linked list has a cycle in it.
// There is a cycle in a linked list if there is some node in the list that can be reached 
// again by continuously following the next pointer. Internally, pos is used to denote the 
// index of the node that tail's next pointer is connected to. Note that pos is not passed 
// as a parameter.
// Return true if there is a cycle in the linked list. Otherwise, return false.

// Example 1:
// Sample Input : 
// head = [3,2,0,-4], pos = 1
// Output: true
// Explanation: There is a cycle in the linked list, where the tail connects to 
// the 1st node (0-indexed).

import java.util.*;

class Node{
    int Data;
    Node next;
};

public class DetectCycleInList {
    public Node InsertNode(Node Head, int iNo)
    {
        Node newn = new Node();
        newn.Data = iNo;
        newn.next = null;

        if(Head == null)
        {
            Head = newn;
        }
        else
        {
            Node temp = Head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
            newn.next = null;
        }
        return Head;
    }

    public void DisplayList(Node Head)
    {
        Node temp = Head;

        while(temp != null)
        {
            System.out.print("|"+temp.Data+"| ->");
            temp = temp.next;
        }
        System.out.print(" NULL\n");
    }

    public void CreateCycle(Node Head)
    {
        Node temp = Head;
        Node temp1 = Head.next.next;
        temp.next.next.next.next = temp1;
        
    }

    public Node DetectCycle(Node Head)
    {
        HashMap<Node, Integer> address = new HashMap<>();
        Node temp = Head;
        int i = 0;
        while(temp != null)
        {
            if(address.containsKey(temp))
            {
                return temp;
            }
            else 
            {
                address.put(temp, i);
                i++;
            }
            temp = temp.next;
        }
        return temp;
    }

    public boolean Result(Node Head)
    {
        boolean flag = false;
        Node temp = DetectCycle(Head);
        if(temp == null)
        {
            flag = false;
        }
        else
        {
            flag = true;
        }

        return flag;
    }
    
    public static void main(String args[])
    {
        Node Head = null;
        Node temp = null;
        DetectCycleInList cobj = new DetectCycleInList();

        Head = cobj.InsertNode(Head, 3);
        Head = cobj.InsertNode(Head, 2);
        Head = cobj.InsertNode(Head, 0);
        Head = cobj.InsertNode(Head, -4);

        cobj.DisplayList(Head);
        cobj.CreateCycle(Head);
        //cobj.DisplayList(Head);
        temp = cobj.DetectCycle(Head);
        if(temp == null)
        {
            System.out.println("Cycle Is Not Present In The Given Linked List !");
        }
        else
        {
            System.out.println("Cycle Is Present In The Given Linked List !");
        }
    }
}
