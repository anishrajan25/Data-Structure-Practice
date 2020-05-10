/* class Node {
  int data;
  Node next;
  Node(){}
  Node(int d) {
    data=d; next=null;
  }
} */
class Result {
  static Node reverseList(Node head) {
    Node next=null,curr=head,prev=null;
    while(curr!=null)
    {
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    head=prev;
    return head;
  }
}
