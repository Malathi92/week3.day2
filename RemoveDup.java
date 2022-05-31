package Week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String text=  "We learn java basics as part of java sessions in java week1";

		String[] split=text.split(" ");
		Set<String> obj = new LinkedHashSet<String>();
		for (String var : split)
		{
			obj.add(var);
		}
		
  System.out.println(obj);
}
}