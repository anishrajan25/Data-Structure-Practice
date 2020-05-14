/* class LinkList
{
  int data;
  LinkList next;
  LinkList prev;
} */

static void swapNodes(LinkList head, int x, int y)
{
  LinkList posx=null,posy=null,last=head;
  while(last!=null)
  {
    if(last.data==x)
      posx=last;
    if(last.data==y)
      posy=last;
    last=last.next;
  }
  if(posx==null || posy==null)
    return;
  int val=posx.data;
  posx.data=posy.data;
  posy.data=val;
  
}
