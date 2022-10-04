package SetInterface;

import java.util.LinkedHashSet;

public class SetDemo2 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> values=new LinkedHashSet<>();
		values.add(55);
		values.add(20);
		values.add(89);
		values.add(79);
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
