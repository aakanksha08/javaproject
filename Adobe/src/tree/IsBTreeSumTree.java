package tree;

public class IsBTreeSumTree {
	Node root;
	int lt = 0, rt = 0;
	
	private int isSumTree(Node root) {
		if(root == null)
			return 0;

    if(root.left == null &&  root.right == null) {
        return root.data;

    }

	int lt  = isSumTree(root.left);
	int rt =  isSumTree(root.right);
	 
	 
	
	if(root.data == lt+ rt) {
        return root.data + rt +lt;
	}
	else if(root.data != lt+ rt) {
	
		return 0;
	}
	
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IsBTreeSumTree tree = new IsBTreeSumTree(); 
        tree.root = new Node(26); 
        tree.root.left = new Node(10); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(6); 
        tree.root.right.right = new Node(3); 
        
        int ans_check =tree.isSumTree(tree.root) ;
        
        if (ans_check!= 0) 
            System.out.println("The given tree is a sum tree"); 
        else
            System.out.println("The given tree is not a sum tree"); 
    
	}

}
