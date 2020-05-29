/* isEmpty(), isFull(), push(int) and int pop() functions available on Stack. */

static int evalPostfix(CQStack s, String exp)
{
  for(int i=0;i<exp.length();i++)
  {
    char c=exp.charAt(i);
    int op1,op2;
    if(Character.isDigit(c))
      s.push(c -'0');
    else
    {
      op1 = s.pop();
      op2 = s.pop();
      switch (c)
      {
        case '+': s.push(op2 + op1); break;
        case '-': s.push(op2 - op1); break;
        case '*': s.push(op2 * op1); break;
        case '/': s.push(op2 / op1); break;
        case '^': s.push((int)Math.pow(op2,op1)); break;
      }
    }
  }
  return s.pop();
}
