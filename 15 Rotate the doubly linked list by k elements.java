/* class LinkList
{
  int data;
  LinkList next;
  LinkList prev;
} */

static LinkList rotateByK(LinkList head, int k)
{
  if(k==0 || head==null)
    return head;
  LinkList last=head,tmp;
  while(last.next!=null)
    last=last.next;
  for(int i=0;i<k;i++)
  {
    tmp=last;
    last=last.prev;
    last.next=null;
    tmp.next=head;
    head.prev=tmp;
    head=tmp;
    tmp.prev=null;
  }
  return head;
}
