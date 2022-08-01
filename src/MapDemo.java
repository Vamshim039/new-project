import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<>();
		map.put("name", "Mahesh");
		map.put("place", "Hyderabad");
		map.put("number", "9895656589");
		
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		for(String key : keys)
		{
			System.out.println(key + " " +map.get(key));
		}
		System.out.println(map.get("place"));
		

	}

}
