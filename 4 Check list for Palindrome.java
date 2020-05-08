/* class Node {
  int data;
  Node next;
  Node(){}
  Node(int d) {
    data=d;
  }
} */
class Result {
  static int checkPalindrome(Node head) {
    if(head==null)
      return 0;
    int num=0;
    while(head!=null)
    {
      num=num*10+head.data;
      head=head.next;
    }
    int rev=0,tmp=num;
    while(tmp!=0)
    {
      rev=rev*10+tmp%10;
      tmp/=10;
    }
    if(num==rev)
      return 1;
    return 0;
  }
}
