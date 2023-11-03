class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> T getNodeValue(Node<T> head, int index) {
    //create separate counter
    int countIndex = 0; 

    //iterate while head != null 
    while (head != null){
      //if index and countIndex match
      if (index == countIndex){
        //return the value 
        return head.val; 
      }
      head = head.next; 

    }
    //if not found return null
    return null; 
  }
  
  public static void main(String[] args) {
    Node<String> node1 = new Node<>("banana");
    Node<String> node2 = new Node<>("mango");
    Node<String> node3 = new Node<>("kiwi");

    node1.next = node2;
    node2.next = node3;

    // banana -> mango -> kiwi

    System.out.println(ECSource.getNodeValue(node1, 1));
    System.out.println(ECSource.getNodeValue(node1, 0));
  }
}