import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {

		List values = new ArrayList();
		values.add(7);
		values.add(3);
		values.add(9);
		values.add(5);
		values.add(2, 6);
		
		
//		Iterator itr = values.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		for(int i=0;i<values.size();i++) {
//			System.out.println(values.get(i));
//		}
		
		Collections.sort(values);
		Collections.reverse(values);
		for(Object o : values) {
			System.out.println(o);
		}
	}

}
