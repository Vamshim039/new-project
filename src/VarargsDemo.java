class Calc
{
	public int add(int ... n)
	{
		int sum=0;
		for(int k : n) {
			sum = sum + k;
		}
		return sum;
		
	}
}

public class VarargsDemo {

	public static void main(String[] args) {
		Calc obj = new Calc();
		System.out.println(obj.add(5, 6, 4, 8, 1));
		System.out.println("hi");

	}

}
