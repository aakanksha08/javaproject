import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;


public class DistinctPairsWithDiffK {

	HashSet<Integer> hset= new HashSet<Integer>();
	HashMap<Integer,Integer> hmap =  new HashMap<Integer,Integer>();
	static int MAX= 1000;

	private int calc_pairs(int arr[], int k) { // int arr []= {1,5,3,4,2};
		int len = arr.length, count =0;
		for(int i= 0 ;i < len;i++){
			int d = Math.abs(arr[i] - k); // need to do if diff comes negative
			//int d = arr[i]-k;

			if(hset.contains(d))
				count++;

			hset.add(arr[i]);
		}
		return count;
	}

	private int calc_distintpairs(int arr[], int k) {
		int len = arr.length, count = 0;
		/* hset = new HashSet<Integer>();

		for(int i= 0 ;i < len;i++){

			if(!hset.contains(arr[i]))
				hset.add(arr[i]);

		}

		for(int i= 0 ;i < len;i++){
			int d1 = arr[i] - k;
			int d2 = arr[i]+k;

			if(hset.contains(d1) ) {
				count++;
				//	hset.remove(arr[i]);
			}

			if(hset.contains(d2) ) {
				count++;
			}
			hset.remove(arr[i]);

		}*/

		for(int i= 0 ;i < len;i++){

			if(!hmap.containsKey(arr[i]))
				hmap.put(arr[i],0);

		}
		
		Iterator<Integer> itr = hmap.keySet().iterator();
		while(itr.hasNext()) {
			int value =itr.next();
			int d1 = value - k;
			int d2 = value + k;

			if(hmap.containsKey(d1)) {
				count++;
				//	hset.remove(arr[i]);
			}

			if(hmap.containsKey(d2)){
				count++;
			}
			itr.remove();
		
		}
		
		return count;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistinctPairsWithDiffK d = new DistinctPairsWithDiffK();
		//int arr []= {1,5,3,4,2,5};
		int arr []= {1,5,3,4,5,2};
		int k = 3;

		//int count1 = d.calc_pairs(arr,k);
		//	System.out.println("count of distinct pairs == "+count1);


		// 2nd way
		int count2 = d.calc_distintpairs(arr,k);
		System.out.println("count of distinct pairs count2== "+count2);


	}

}
