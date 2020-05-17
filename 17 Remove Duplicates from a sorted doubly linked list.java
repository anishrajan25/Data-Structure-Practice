/* class LinkList
{
  int data;
  LinkList next;
  LinkList prev;
} */
class Result {
  static LinkList removeDupsDLL(LinkList head) {
    if(head==null)
      return head;
    LinkList tmp=head;
    while(tmp.next!=null)
    {
      if(tmp.data==tmp.next.data)
        tmp.next=tmp.next.next;
      else
        tmp=tmp.next;
    }
  return head;
  }
}
