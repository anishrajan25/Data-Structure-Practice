/* class LinkList {
  int data;
  LinkList next;
  LinkList() {}
  LinkList(int d) {
    data=d;
  }
} */
class Result {
  static int countNodes(LinkList head) {
    if(head==null)
      return 0;
    int l=1;
    LinkList tmp=head.next;
    while(tmp!=head){
      tmp=tmp.next;l++;
    }
    return l;
  }
}
