/* class LinkList
{
  int data;
  LinkList next;
  LinkList prev;
} */

static LinkList rearrangeList(LinkList head)
{
  if(head==null)
    return head;
  LinkList tmp=head,pos=head,curr;
  int i;
  for( i=1;tmp!=null;i++)
  {
    curr=tmp;
    tmp=tmp.next;
    if(tmp==null && i%2==0)
    {
      curr.prev.next=curr.next;
      curr.prev=pos.prev;
      if(pos.prev!=null)
        pos.prev.next=curr;
      else
        head=curr;
      pos.prev=curr;
      curr.next=pos; 
    }
    if(i%2==0)
    {
      curr.prev.next=curr.next;
      curr.next.prev=curr.prev;
      curr.prev=pos.prev;
      if(pos.prev!=null)
        pos.prev.next=curr;
      else
        head=curr;
      pos.prev=curr;
      curr.next=pos;
    }
  }
  return head;
}
