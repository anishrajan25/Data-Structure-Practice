/* class LinkList {
  int data;
  LinkList next;
  LinkList() {}
  LinkList(int d) {
    data=d;
  }
} */
class Result {
  static LinkList listCut(LinkList head) {
    if(head==null || head.next==head)
      return head;
    LinkList tmp=head.next,half=head.next;
    int l=1;
    while(tmp!=head){
      tmp=tmp.next;
      l++;
    }
    for(int i=1;i<=l;i++)
    {
      if(i==l/2)
      {
        half=tmp.next;
        tmp.next=head;
        tmp=half;
      }
      if(tmp.next==head)
      {
        tmp.next=half;
        tmp=head;
      }
      else
        tmp=tmp.next;
   }
    return half;
  }
}
