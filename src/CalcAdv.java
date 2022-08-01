
public class CalcAdv extends Calc {

	public int sub(int i, int j) {
		return i-j;
	}
	public static void main(String[] args) {
		CalcAdv c1 = new CalcAdv();
		System.out.println(c1.sub(7, 3));
		System.out.println(c1.add(3,6));

	}

}
