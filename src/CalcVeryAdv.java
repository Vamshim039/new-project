
public class CalcVeryAdv extends CalcAdv {

	public int mul(int i, int j) {
		return i*j;
	}
	public static void main(String[] args) {
		CalcVeryAdv c1 = new CalcVeryAdv();
		System.out.println(c1.add(4,6,7,8));
		System.out.println(c1.sub(9, 3));
		System.out.println(c1.mul(4, 8));
	}
}
