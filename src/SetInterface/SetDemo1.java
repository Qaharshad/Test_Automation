package SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		TreeSet<Integer> values=new TreeSet<>();
		values.add(55);
		values.add(20);
		values.add(99);
		values.add(99);
		values.add(72);
		values.add(66);
		//System.out.println(values);
		for(int e:values) 
		{
			System.out.println(e);
		}

	}

}
