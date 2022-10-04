package SetInterface;

import java.util.ArrayList;
import java.util.HashSet;

public class SetDemo4 {

	public static void main(String[] args) {
		HashSet<Integer> values=new HashSet<>();
		values.add(55);
		values.add(20);
		values.add(99);
		values.add(99);
		values.add(72);
		values.add(66);
		//System.out.println(values);
		ArrayList <Integer> list=new ArrayList<>(values);
		System.out.println(list);
		System.out.println(list.get(3));

	}

}
