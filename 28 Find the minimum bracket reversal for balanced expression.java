class LinkList
{
  public int data; // data item
  public LinkList next; // next link in list
  public LinkList(int dd) // constructor
  { data = dd; }
}
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
class Result
{
  static int minReversal(String expr)
  {
    if(expr.length()%2!=0)
      return -1;
    int rev=0;
    LinkStack st=new LinkStack();
    st.push(expr.charAt(0));
    for(int i=1;i<expr.length();i++)
    {
      char top='-';
      if(!st.isEmpty())
        top=(char)st.pop();
      if(top!='-' && (top=='('&& expr.charAt(i)==')' || top=='{'&& expr.charAt(i)=='}' || top=='['&& expr.charAt(i)==']') )
      {}
      else
      {
        if(top!='-'){
          st.push(top);
        }
        st.push(expr.charAt(i));
      } 
    }
    for(int i=expr.length()/2;i<expr.length() && !st.isEmpty();i++)
    {
      char c=(char)st.pop(),o=(char)st.pop();
      if(o==c)
        rev++;
      else if(o==')'&& c=='(' || o=='}'&& c=='{' || o==']'&& c=='[' )
        rev+=2;
      else if(o=='('&& c==')' || o=='{'&& c=='}' || o=='['&& c==']' )
      {}
      else
        return -1;
    }
    return rev;
  }
}
