/*  static int SIZE=4;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];
  These variables are set for the queue. */

  void enqueue(int item)
  {
    if((front==0&&rear==SIZE-1) || (rear==(front-1)%(SIZE-1)))
      return;
    if(front==-1)
      front=rear=0;
    else if(rear==SIZE-1 && front!=0)
      rear=0;
    else
      rear++;
    array[rear]=item;
  }

  int dequeue()
  {
    if(front==-1)
      return -1;
    int item=array[front];
    if(front==rear)
      front=rear=-1;
    else if(front==SIZE-1)
      front=0;
    else
      front++;
    return item;
  }
