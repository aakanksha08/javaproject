
public class EquilibriumIndexOfArray {

	public void equilibrium(int arr[]) {
		int size = arr.length;
		int sum =0;
		for(int i  =0 ;i < size;i++)
			sum += arr[i];
		int l_sum =0, r_sum = sum;
		for(int i =0 ;i < size; i++) {
			
			r_sum -= arr[i];
			
			if(r_sum == l_sum)
				System.out.println("index == "+ i);
			
			l_sum += arr[i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EquilibriumIndexOfArray equi = new EquilibriumIndexOfArray(); 
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; // {1,2,1,2}
      
        System.out.println("equilibrium indexs " );
        equi.equilibrium(arr);
	}

}
