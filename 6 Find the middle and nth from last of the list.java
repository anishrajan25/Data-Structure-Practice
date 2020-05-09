/* class Node
{
  int data;
  Node next;
} */

static int findMiddle(Node head) 
{
  if(head==null)
    return -1;
  int size=0;
  Node tmp=head;
  while(tmp!=null)
  {
    size++;
    tmp=tmp.next;
  }
  int m=size/2+1;
  tmp=head;
  while(tmp!=null)
  {
    tmp=tmp.next;
    m--;
    if(m==0)
      return tmp.data;
  }
  return -1;
}

static int findNLast(Node head, int n)
{
  if(head==null)
    return -1;
  int size=0;
  Node tmp=head;
  while(tmp!=null)
  {
    size++;
    tmp=tmp.next;
  }
  if(size>=n)
    return tmp.data;
  int pos=size-n+1;
  tmp=head;
  while(tmp!=null)
  {
    tmp=tmp.next;
    pos--;
    if(pos==0)
      return tmp.data;
  }
  return -1;
}
