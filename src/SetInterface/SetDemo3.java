package SetInterface;

import java.util.Collections;
import java.util.TreeSet;

public class SetDemo3 {

	public static void main(String[] args) {
		TreeSet<Integer> values = new TreeSet<>(Collections.reverseOrder());
		System.out.println("This is descending order tree set");

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

		TreeSet<Integer> values1 = new TreeSet<>();
		System.out.println("This is Ascending order tree set");

		values1.add(55);
		values1.add(20);
		values1.add(89);
		values1.add(79);
		values1.add(99);
		values1.add(72);
		values1.add(66);
		for(int e:values1) 
		{
			System.out.println(e);
		}

	}

}
