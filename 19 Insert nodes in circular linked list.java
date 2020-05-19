/* class LinkList
{
  int data;
  LinkList next;
  LinkList(int d)
  {
    data=d;
  }
} */

static LinkList insertBeg(LinkList head, int data)
{
  LinkList node=new LinkList(data);
  node.next=head;
  if(head==null)
  {
    node.next=node;
  }
  else
  {
    LinkList tmp=head.next;
    while(tmp.next!=head)
      tmp=tmp.next;
    tmp.next=node;
  }
  head=node;
  return head;
}
static LinkList insertEnd(LinkList head, int data)
{
  LinkList node=new LinkList(data);
  if(head==null)
  {
    node.next=node;
    head=node;
  }
  else
  {
    LinkList tmp=head;
    while(tmp.next!=head)
      tmp=tmp.next;
    node.next=tmp.next;
    tmp.next=node;
  }
  return head;
}
