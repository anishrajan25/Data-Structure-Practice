/* class Node {
  int data;
  Node next;
  Node(int d) {
    data=d;
  }
} */
class Result {
  static Node findIntersection(Node head1, Node head2) {
    int s1=0,s2=0;
    Node tmp1=head1,tmp2=head2;
    /*while(tmp1!=null)
      tmp1=tmp1.next;s1++;
    while(tmp2!=null)
      tmp2=tmp2.next;s2++;
    Node small=head2,large=head1;
    if(s1<s2)
      small=head1;large=head2;*/
    Node intersection=new Node(),tmpint=intersection;
    while(tmp1!=null)
    {
      tmp2=head2;
      while(tmp2!=null){
        if(tmp1.data==tmp2.data){
          tmpint.data=tmp2.data;
          Node next_node=new Node();
          tmpint.next=next_node;
          tmpint=tmpint.next;
          break;
        }
        tmp2=tmp2.next;
      }
      tmp1=tmp1.next;
    }
    tmpint.next=null;
    //sorting
    for(tmp1=intersection;tmp1!=null;tmp1=tmp1.next)
    {
      for(tmp2=tmp1.next;tmp2!=null;tmp2=tmp2.next)
      {
        if(tmp1.data>tmp2.data)
        {
          int val=tmp1.data;
          tmp1.data=tmp2.data;
          tmp2.data=val;
        }
      }
    }
    if(intersection.data==0)
      intersection=intersection.next;
	return intersection;
  }
}
