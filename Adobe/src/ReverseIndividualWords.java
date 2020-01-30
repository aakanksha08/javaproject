import java.util.Stack;
public class ReverseIndividualWords {

	private void reverseWords(String str) {
		
		Stack<Character> stk = new Stack<Character>();
		
		int len = str.trim().length();
		int i =0;
		while(i < len ) {
			if((str.charAt(i))!=' ') {
				stk.push(str.charAt(i));
			}else {
				while(!stk.isEmpty()) 
					System.out.print(stk.pop());
				
				System.out.print(" ");
			}
			i++;
		}
		while (!stk.empty()) { 
	        System.out.print(stk.pop()); 
	          
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ReverseIndividualWords  rev = new ReverseIndividualWords();
		
		String str = "Hello 	World		";
		
		rev.reverseWords(str);
		
	}

}
