/* class LinkList
{
  public int data; // data item
  public LinkList next; // next link in list
  public LinkList(int dd) // constructor
  { data = dd; }
} The LinkList class is given as above
*/

class LinkStack
{
  private LinkList first; // ref to first item on list
  public LinkStack() // constructor
  {
    first=null;
  }

  public boolean isEmpty()
  {
    return first==null;
  }

  public void push(int dd)
  {
    LinkList tmp=new LinkList(dd);
    tmp.next=first;
    first=tmp;
  }

  public int pop()
  {
    if(isEmpty())
      return -1;
    int val=first.data;
    first=first.next;
    return val;
  }
}
