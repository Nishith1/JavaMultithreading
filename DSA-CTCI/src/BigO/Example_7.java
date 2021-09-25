package BigO;

public class Example_7 {
	
	public static void main(String[] args) {
		Node root = new Node(0);
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		Node six = new Node(6);
		root.left = one;
		root.right = two;
		one.left = three;
		one.right= four;
		two.left = five;
		two.right= six;	
		
		System.out.println(binaryNodesSum(root));
	}
	
	static int binaryNodesSum(Node node) {
		if(node==null) {
			return 0;
		}
		return binaryNodesSum(node.left) + node.key + binaryNodesSum(node.right);
	}
	
	static class Node{
	 int key;
	 Node left, right;
	 
	 public Node(int item){
	    key = item;
	    left = right = null;
	 }
	}

}

