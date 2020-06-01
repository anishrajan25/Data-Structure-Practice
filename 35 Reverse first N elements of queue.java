/* 
class QueueArray
{
  int SIZE=50;
  int front=-1;
  int rear=-1;
  int array[]=new int[SIZE];
  void enqueue(int item);
  void dequeue();
  Abobe is the queue declaration.
*/
static void reverseKelementsQueue(QueueArray q, int K)
{
  int s=q.rear+1,arr[]=new int[s];
  for(int i=0;i<s;arr[i++]=q.dequeue());
  q.front=q.rear=-1;
  for(int i=K-1;i>=0;q.enqueue(arr[i--]));
  for(int i=K;i<s;q.enqueue(arr[i++]));
  
}
