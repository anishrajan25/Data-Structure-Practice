import java.util.*;
class QueueNode
{
  int data;
  QueueNode next;

  public QueueNode(int data) 
  {
    this.data = data;
  }
}

class QueueLinkedList
{
  public QueueNode front=null, rear=null;

  /*  Function to EnQueue an element to the Queue */
  public void EnQueue(int data)
  {
    QueueNode tmp = new QueueNode(data);
    if(rear==null){
      front=rear=tmp;
      return;
    }
    rear.next=tmp;
    rear=tmp;
  }    

  /*  Function to DeQueue an element from the Queue */
  public int DeQueue()
  {
    if(front==null)
      return -1;
    int val=front.data;
    front=front.next;
    if(front==null)
      rear=null;
    return val;
  }    
}
