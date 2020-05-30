/* isFull(), isEmpty(), push(int), int pop() are available functions on Stack. */
class Result {
  static int evalPrefix(CQStack s, String exp) {
    for(int i=exp.length()-1;i>=0;i--)
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
        case '+': s.push(op1 + op2); break;
        case '-': s.push(op1 - op2); break;
        case '*': s.push(op1 * op2); break;
        case '/': s.push(op1 / op2); break;
        case '^': s.push((int)Math.pow(op1,op2)); break;
      }
    }
  }
  return s.pop();
  }
}
