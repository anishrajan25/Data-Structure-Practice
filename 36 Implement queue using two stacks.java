/* push(int), pop(), isEmpty(), isFull() are available on Stack. */
class Queue
{
  void enqueue(CQStack st1, CQStack st2, int item)
  {
    if(st2.isFull())
      return;
    while(!st2.isEmpty())
      st1.push(st2.pop());
    st1.push(item);
    while(!st1.isEmpty())
      st2.push(st1.pop());
  }

  int dequeue(CQStack st1, CQStack st2)
  {
    if(st2.isEmpty())
      return -1;
    return st2.pop();
  }
}
