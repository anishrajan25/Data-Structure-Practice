/* class Node {
  int data;
  Node next;
  Node(){}
  Node(int d) {
    data=d;
  }
} */

class Result {
  static Node addListNumbers(Node head1, Node head2) {
	/*int s1=0,s2=0;
    Node tmp1=head1,tmp2=head2;
    while(tmp1!=null)
      tmp1=tmp1.next;s1++;
    while(tmp2!=null)
      tmp2=tmp2.next;s2++;
    tmp1=head1;tmp2=head2;
    int d=s1-s2;
    if(s1<s2)
      tmp1=head2;tmp2=head1;d=s2-s1;
    while(d!=0)
      tmp1=tmp1.next;
    */
    if(head1==null && head2==null)
      return null;
    if(head1==null)
      return head2;
    if(head2==null)
      return head1;
    int r=0;
    Node sum=new Node((head1.data+head2.data)%10+r),tmp;
    r=(head1.data+head2.data)/10;
    tmp=sum;
    head1=head1.next;
    head2=head2.next;
    while (head1!=null && head2!=null)
    {
      Node next_node=new Node((head1.data+head2.data+r)%10);
      tmp.next=next_node;
      tmp=next_node;
      r=(head1.data+head2.data+r)/10;
      head1=head1.next;
      head2=head2.next;
    }
    
    while(head1!=null)
    {
      Node next_node=new Node((head1.data+r)%10);
      r=(head1.data+r)/10;
      tmp.next=next_node;
      tmp=next_node;
      head1=head1.next;
    }
    while(head2!=null)
    {
      Node next_node=new Node((head2.data+r)%10);
      r=(head2.data+r)/10;
      tmp.next=next_node;
      tmp=next_node;
      head2=head2.next;
    }
    if(r>0)
    {
      Node next_node=new Node(r);
      tmp.next=next_node;
      tmp=next_node;
    }
    tmp.next=null;
    return sum;
  }
}
