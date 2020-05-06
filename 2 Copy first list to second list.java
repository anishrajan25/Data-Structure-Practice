/* class Node
{
  int data;
  Node next;
} */

static Node copyList(Node org)
{
  if(org==null)
    return null;
  Node list2=new Node(org.data);
  org=org.next;
  Node tmp=list2;
  while(org!= null)
  {
    Node next_node=new Node(org.data);
    org=org.next;
    tmp.next=next_node;
    tmp=tmp.next;
  }
  tmp.next=null;
  return list2;
}
