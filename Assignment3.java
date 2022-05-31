package Week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers={4,6,7,2,3,1,9,10,8,8,6,2};
		int length=numbers.length;
		Arrays.sort(numbers);
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<length;i++)
		{
			set.add(numbers[i]);
		}
		System.out.println("the set is: "+set);
		int size=set.size();
		for(int j=1;j<size-1;j++)
		{
			if(!set.contains(j))
			{			
				System.out.println("the missing element is :"+j);		
			}
		}
	}
}
























