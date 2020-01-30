
public class copySetBits {

	private void setBits(int x, int y, int l ,int r) {

		if(l<1 || r >32)
			return ;

		for(int i =l; i<=r ;i++) {

			int m = 1 << (i-1);
			int n = m & y;
			if(n > 1) {
				x = x | m;

			}	
		}
		System.out.println("New value of x = "+x);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copySetBits c= new copySetBits();
		int x = -4;
		int y =13;
		int l =2 , r =3;


		System.out.println("Value of x and y before copying set bits == "+x +" "+y);
		c.setBits(x,y,l,r);
	}

}
