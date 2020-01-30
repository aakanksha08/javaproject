// program to put spaces between words starting  with capital letters. 

public class PutSpaceBetweenChar {

	public static void put_Spaces(String s) {

		StringBuilder resultStr = new StringBuilder();
		for(int i =0;i < s.length(); i++) {
			int a = (int)s.charAt(i);
			
			if((a>= 65  && a< 91) ) {
				
				resultStr.append(" "); // will append space at the start also
				int b = a-65;
				char c = (char) ((char)97+b);
				resultStr.append(String.valueOf(c));
			}else{
				resultStr.append(String.valueOf(s.charAt(i)));
			}
		}
		
		/*
		 if (str[i]>='A' && str[i]<='Z') 
            { 
                str[i] = (char)(str[i]+32); 
                  
                // Print space before it 
                // if its an uppercase character 
                if (i != 0) 
                    System.out.print(" "); 
      
                // Print the character 
                System.out.print(str[i]); 
            } 
      
            // if lowercase character 
            // then just print 
            else
            System.out.print(str[i]); 
        } 
		 */
		System.out.println("Converted String -->"+resultStr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "HelloWorld";
		System.out.println("Original String -->"+str);
		put_Spaces(str);
	}

}
