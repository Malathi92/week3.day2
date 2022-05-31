package Week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="babu";
		char[] a=input.toCharArray();
		Set set=new HashSet();
		for(int i=0;i<a.length;i++)
		{
			if(!set.add(a[i]))
			{


				set.remove(a[i]);


			}
		}
		System.out.println(set);
	}
}
