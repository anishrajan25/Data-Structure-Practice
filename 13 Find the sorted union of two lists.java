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
/* class Node
{
  int data;
  Node next;
} */

static Node findUnion(Node head1, Node head2) 
{
  if(head1==null&&head2==null)
    return null;
  if(head1!=null&&head2==null)
    return head1;
  if(head1==null&&head2!=null)
    return head2;
  Node tmp1=head1,tmp2=head2;
  Node union=new Node(tmp1.data),tmpint=union;
  tmp1=tmp1.next;
  while(tmp1!=null)
  {
    Node next_node=new Node(tmp1.data);
    tmpint.next=next_node;
    tmpint=tmpint.next;
    tmp1=tmp1.next;
  }
  while(tmp2!=null)
  {
    Node next_node=new Node(tmp2.data);
    tmpint.next=next_node;
    tmpint=tmpint.next;
    tmp2=tmp2.next;
  }
  tmpint.next=null;
  //sorting
  for(tmp1=union;tmp1!=null;tmp1=tmp1.next)
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
  tmp1=union;
  while(tmp1.next!=null){
    if(tmp1.data==tmp1.next.data){
      tmp1.next=tmp1.next.next;
    }
    if(tmp1.next!=null)
      tmp1=tmp1.next;
  }
  return union;
}
