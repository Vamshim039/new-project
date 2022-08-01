import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {
	int rollno;
	String name;
	int marks;
	public Students(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Students s) {
		return name.length()>s.name.length()?1:-1;
	}
	
}

public class CollectionDemo3 {

	public static void main(String[] args) {

		List<Students> stud = new ArrayList<>();
		stud.add(new Students(11, "Mahi", 550));
		stud.add(new Students(12, "Kamesh", 530));
		stud.add(new Students(13, "Rames", 440));
		stud.add(new Students(14, "Harish", 510));
		
		Collections.sort(stud, (i,j) -> i.marks>j.marks?1:-1);
		
		for(Students s : stud) {
			System.out.println(s);
		}

	}

}
