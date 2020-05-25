/* isFull(), isEmpty(), push(int item), pop();
Above functions are available to you for use on stack, So just complete the below function as per specifications. */

static String reverseString(CQStack s, String st)
{
  for(int i=0;i<st.length();s.push(st.charAt(i++)));
  st=new String();
  while(!s.isEmpty())
    st+=(char)s.pop();
  return st;
}
