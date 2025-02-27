/* class Node {
  int data; // data used as key value
  Node leftChild;
  Node rightChild;
  public Node()  {
    data=0;  }
  public Node(int d)  {
    data=d;  }
 } Above class is declared for use. */
class Result {
  static void printTopView(Node root) {
    if(root==null)
      return;
    printLeft(root.leftChild);
    System.out.print(root.data+" ");
    printRight(root.rightChild);
  }
  static void printLeft(Node root)
  {
    if(root==null)
      return;
    printLeft(root.leftChild);
    System.out.print(root.data+" ");
  }
  static void printRight(Node root)
  {
    if(root==null)
      return;
    System.out.print(root.data+" ");
    printLeft(root.rightChild);
  }
}
