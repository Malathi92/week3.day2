package Week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {
		
	int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		Set<Integer> set1=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		set1.add(a[i]);
        System.out.println("first set is :"+set1);
		Set<Integer> set2=new HashSet<Integer>();
		for(int j=0;j<b.length;j++)
		set2.add(b[j]);
        System.out.println("second set is :"+set2);
		if(set1.retainAll(set2))
		{
			System.out.println("the intersection of 2 set is :"+set1);
		}
	}
}
		
		