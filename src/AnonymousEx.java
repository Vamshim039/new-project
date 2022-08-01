
interface Abc{
	void show(int i, int j);
	//void showIn();
}

public class AnonymousEx {

	public static void main(String[] args) {


		Abc obj = (int i, int j) -> {
			//int k = i+j;
			System.out.println(i-j);
			System.out.println("im in show");
		};

//							@Override
//							public void showIn() {
//								System.out.println("im in showIn");
//								
//							}
//							};
		obj.show(1,3);
		//obj.showIn();
	}

}