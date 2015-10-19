//upload to github

// Program to detect cycles in the linked list
// Use Floyy'd cycle detection method
/*
  Detect cycle in the list
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

int HasCycle(Node head) {

    Node slow = head;
    Node fast = head;
    
    //if first node is null return no loop present
    if(head==null)
        return 0;
    
    //if list is not empty >  go to next nodes with hops 1 & 2, if loop exists, slow & fast will be same & if no loop exists, we will encounter null for either slow or fast
    while(true){
        slow=slow.next;
        
        if(fast.next!=null)
            fast=fast.next.next;
        else 
            return 0;
        
        if(slow==fast)
            return 1;
        
        if(slow==null || fast==null)
            return 0;
    }
}