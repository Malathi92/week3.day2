package Week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length=arr.length;
		int count;
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<length-1;i++)
		{
			set.add(arr[i]);
			count=0;
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println("duplicates are:" +arr[i]);
			}
		}
		
		System.out.println("set without duplicates :"+set);
	}
	

}
