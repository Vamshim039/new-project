import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemo2 {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<>();
		values.add(456);
		values.add(898);
		values.add(321);
		values.add(454);
		
		/*Comparator<Integer> c = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				return i%10<j%10?1:-1;
			}
		};
		
		Collections.sort(values, c);*/
		Collections.sort(values, (i,j) -> i%10>j%10?1:-1);
		//Collections.reverse(values);
		for(Integer i : values) {
			System.out.println(i);
		}

	}

}
