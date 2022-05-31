package Week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1,2,3,4,7,6,8};
		int length=arr.length;
		Arrays.sort(arr);
		Set<Integer> set=new HashSet<Integer>();
		for(int i=1;i<length-1;i++)
		{
			set.add(arr[i]);
			
			if(i!=arr[i-1])
			{
			System.out.println("the missing element is :"+i);
			}

		}
	System.out.println("the set is: "+set);
}
}




