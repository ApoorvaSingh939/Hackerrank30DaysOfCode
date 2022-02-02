import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{

    public static Node removeDuplicates(Node head) {
      //Write your code here

if(head == null || head.next== null){
    return head;
}
else{
    Node current = head;
    
    while(current.next!=null){
        if(current.data == current.next.data){
            current.next = current.next.next;
        }
        else{
            current = current.next;
        }
    }
    return head;
    }
}

	 public static  Node insert(Node head,int data)
