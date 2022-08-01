
public class ExceptionDemo {

	public static void main(String[] args) {
		
		int i = 17;
		int j = 9;
		try {
			int k = i/j;
			if(k==1)
				throw new DemoException("this is not possible");
			System.out.println(k);
		}
		catch(DemoException e) {
			System.out.println("Error : "+e.getMessage());
		}
	}

}
