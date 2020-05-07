/* class Node
{
  int data;
  Node next;
} */

static Node shiftSmallLarge(Node org)
{
  if (org==null)
    return org;
  Node small=org,large=org,tmp=org.next;
  while(tmp!=null)
  {
    if(tmp.data<small.data)
      small=tmp;
    if(tmp.data>large.data)
      large=tmp;
    tmp=tmp.next;
  }
  //shifting smallest to head
  if(org.data!=small.data)
  {
    tmp=org;
    while(tmp.next != small)
      tmp=tmp.next;
    tmp.next=tmp.next.next;
    Node s=new Node(small.data);
    s.next=org;
    org=s;
  }
  //shifting largest to tail
  if(large.next!=null)
  {
    tmp=org;
    while(tmp.next != null)
    {
      if(tmp.next==large)
        tmp.next=tmp.next.next;
      tmp=tmp.next;
    }
    Node l=new Node(large.data);
    tmp.next=l;
    l.next=null;
  }
  
  return org;
}
