package tree;

import java.util.Stack;

import LL.Node;

public class ChkBSTpossibleOfGivenArray {
	
	Node root;
	
	public boolean canRepresentBST(int[] arr, int length) {
		
		Stack<Integer> stk = new Stack<Integer>();
		int min = Integer.MIN_VALUE;
		
		for( int i =0;i < length;i++) {

			if(arr[i] < min)
				return false;


			while(!stk.isEmpty() && stk.peek() < arr[i]) {
				min = stk.peek();
				stk.pop();
				
			}
			
				stk.push(arr[i]);
			

		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChkBSTpossibleOfGivenArray bst = new ChkBSTpossibleOfGivenArray(); 
	        int[] pre1 = new int[]{40, 30, 35, 80, 100}; 
	        int n = pre1.length; 
	        if (bst.canRepresentBST(pre1, n) == true) { 
	            System.out.println("true"); 
	        } else { 
	            System.out.println("false"); 
	        } 
	        int[] pre2 = new int[]{40,30,20,10,15,35,32,37,80}; //{40, 30, 35, 20, 80, 100}; // {40,30,20,10,15,35,32,37,80}
	        int n1 = pre2.length; 
	        if (bst.canRepresentBST(pre2, n) == true) { 
	            System.out.println("true"); 
	        } else { 
	            System.out.println("false"); 
	        } 
	}

}
