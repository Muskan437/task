package algorithms.tree;


public class Task1 {
	 private Node root;

		class Node {
	        public int value;
	        public Node left;
	        public Node right;

	        Node(int value) {
	            this.value = value;
	        }
	    }

	    public boolean insert(int value) {
	        Node newNode = new Node(value);
	        if (root == null) {
	            root = newNode;
	            return true;
	        }
	        Node temp = root;
	        while (true) {
	            if (newNode.value == temp.value) return false;
	            if (newNode.value < temp.value) {
	                if (temp.left == null) {
	                    temp.left = newNode;
	                    return true;
	                }
	                temp = temp.left;
	            } else {
	                if (temp.right == null) {
	                    temp.right = newNode;
	                    return true;
	                }
	                temp = temp.right;
	            }
	        }
	    }

	   public int countOfNodes(Node root) {
	    	if (root == null) {
	            return 0;
	        } else {
	            int leftCount = countOfNodes(root.left);
	            int rightCount = countOfNodes(root.right);
	            return 1 + leftCount + rightCount;
	        }
	    	 }
	    	 public int height(Node root) {
	    		 if (root == null) {
	    		        return -1; // Height of an empty tree is -1.
	    		    } else {
	    		        int leftHeight = height(root.left);
	    		        int rightHeight = height(root.right);
	    		        return 1 + Math.max(leftHeight, rightHeight);
	    		    }
	    	 }
	    	 
	    	 public static void preorder(Node root) {
	    		 if(root==null){
	    			 return; 
	    		 }
	    		 System.out.println(root.value+" ");
	    		 preorder(root.left);
	    		 preorder(root.right);
	    		 
	    	 }
	    	 public static void postorder(Node root) {
	    		 if(root==null) {
	    			 return;
	    		 }
	    		 postorder(root.left);
	    		 postorder(root.right);
	    		 System.out.println(root.value+" ");
	    	 }
	    	 public static void inorder(Node root) {
	    		 if(root==null) {
	    			 return;
	    		 }
	    		 inorder(root.left);
	    		 System.out.println(root.value+" ");
	    		 inorder(root.right);
	    	 }
  
  
	public static void main(String[] args) {
		 Task1 myBST = new Task1();

	        myBST.insert(47);
	        myBST.insert(21);
	        myBST.insert(76);
	        myBST.insert(18);
	        myBST.insert(27);
	        myBST.insert(52);
	        myBST.insert(82);
	        int nodeCount = myBST.countOfNodes(myBST.root);
	        System.out.println("Number of nodes in BST: " + nodeCount);

	        int treeHeight = myBST.height(myBST.root);
	        System.out.println("Height of BST: " + treeHeight);

	        
              
	        System.out.println("using preorder traversing");
	        myBST.preorder(myBST.root);
	        
	        System.out.println("using  postorder traversing");
	        myBST.postorder(myBST.root);
	        
	        System.out.println("using inorder traversing");
	        myBST.inorder(myBST.root);
	        
	     
	}
	        
	}

