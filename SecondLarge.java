package Week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SecondLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,2,11,4,6,7};
		int length=a.length;
		Set<Integer> set=new HashSet<Integer>();
		Arrays.sort(a);
		for(int i=0;i<length-1;i++)
		{
			set.add(a[i]);
		}
		System.out.println("the second large is :"+a[length-2]);


	}

}
