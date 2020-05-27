public void push(int j) // put item on top of stack
{
  if(isFull())	
  {}
  stackArray[++top]=j;
}

public int pop() // take item from top of stack
{
  if(isEmpty())
    return -1;
  return stackArray[top--];
}

public int getMin()
{
  int min=stackArray[top];
  for(int i=0;i<top;i++)
    if(stackArray[i]<min)
      min=stackArray[i];
  return min;
}
