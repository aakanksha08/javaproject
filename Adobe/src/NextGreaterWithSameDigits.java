//Java program to find next greater number with same set of digits.

public class NextGreaterWithSameDigits {
	
	private char[] nextGreater(char ch[]) {
		int len = ch.length;
		boolean flag = false;
		
		for(int i = 0; i< len-1;i++) {
			if(ch[i] < ch[i+1]) {
				flag = true;
			}
			else {
				flag = false;
				break;
			}
		}
		
		if(flag == true) {
			char temp = ch[len-1];
			ch[len-1] = ch[len-2];
			ch[len-2] = temp;
			return ch;
		}
		
		
		for(int i = len-1; i>0;i--) {
			if(ch[i] > ch[i-1]) {
				flag = true;
				break;
			}
			
		}
		
		if(flag == false) {
			return null;
		}
		else {
			// num3 and other numbers
			
			int i = len-1;
			int j = i;
			while(ch[j-1] > ch[j]) {
				j--;
			}
			char temp = ch[j-1];
			ch[j-1] = ch[i];
			ch[i] = temp;
			
			while(j < i) {
				temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				j++;
				i--;
			}
			
		}
		
		
			
		
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextGreaterWithSameDigits n = new NextGreaterWithSameDigits();
	int num1 = 123456789;
	int num2 = 4321;
	//int num3 = 218765;
	int num3 = 534976;
	char[] ch = Integer.toString(num3).toCharArray();
	
	char[] nextNum = n.nextGreater(ch);
	
	if(nextNum == null) {
		System.out.println("not possible");
	}else {
		System.out.print("original Number: "+ num1 +"	Next Greater Number: ");
		for(int i = 0 ;i < nextNum.length;i++) {
			System.out.print(nextNum[i]);
		}
	}
	
	
	}

}
