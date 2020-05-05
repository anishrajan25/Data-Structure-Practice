/* class Node
{
  int data;
  Node next;
} */

static void forwardPrint(Node head)
{
	Node tmp=head;
  while(tmp!=null)
  {
    System.out.print(tmp.data+"-");
    tmp=tmp.next;
  }
}

static void backwardPrint(Node head)
{
	Node tmp=head;
  if(tmp!=null)
  {
    backwardPrint(tmp.next);
    System.out.print(tmp.data+"-");
  }
}
