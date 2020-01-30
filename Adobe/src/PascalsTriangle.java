import java.util.Scanner;
public class PascalsTriangle {

	
	// TC = O(N^2) and SC = O(N^2)
	public void pascalsTriangle (int num) {
		
		int arr[][] = new int [num+1][num+1];
		for(int i =1 ;i<= num;i++) {
			for(int j =1 ;j<= i;j++) {
				arr[i][j] = 1;
			}
		}
		
		
		int i =1, j =1;
		int x =0;
		System.out.println(arr[i][j]);
		
		for(i = 2; i<= num;i++) {
			// System.out.print(arr[i][1]+" ");
			for(j = 2; j<i; j++) {
				arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
			}
		}
		
		for( i =1 ;i<= num;i++) {
			for( j =1 ;j<= i;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	
	//// TC = O(N^2) and SC = O(1)
	
	public static void printPascal(int n) 
	{ 
	    for(int line = 1; line <= n; line++) 
	    { 
	          
	    int C=1;// used to represent C(line, i) 
	    for(int i = 1; i <= line; i++) 
	    {  
	        // The first value in a line is always 1 
	        System.out.print(C+" "); 
	        C = C * (line - i) / i;  
	    } 
	    System.out.println(); 
	    } 
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalsTriangle p = new PascalsTriangle();
		
		System.out.println("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		p.pascalsTriangle(num);
		
		System.out.println("Another method");
		printPascal(num);
	}

}
