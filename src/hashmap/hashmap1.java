package hashmap;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class hashmap1 {

	public static void main(String[] args) {
		Map<String, String> obj = new LinkedHashMap<>();
		obj.put("Emp. 1", "Harshad");
		obj.put("Emp. 2", "Harsh");
		obj.put("Emp. 2", "Harsh");
		obj.put("Emp. 3", "Rohit");
		obj.put("Emp. 4", "Deepali");
		obj.put("Emp. 5", "swati");
		
		
		for (Map.Entry <String, String> abc : obj.entrySet())
		{
			System.out.println("Key is "+abc.getKey()+ "value is " +abc.getValue());
		}
		
		System.out.println("value for given key is "+obj.get(9));

	}

}
