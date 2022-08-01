import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WrapperDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {

//
////		String str = "123";
////		int n = Integer.parseInt(str);
////		System.out.println(n);
//		//System.out.println("enter the first number");
//		//Scanner sc = new Scanner(System.in);
//		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		//int n = Integer.parseInt(sc.nextLine());
//		//int n = Integer.parseInt(br.readLine());
//		System.out.println("enter the second number");
//		//int m = Integer.parseInt(sc.nextLine());
//		int m = Integer.parseInt(br.readLine());
//		int k = n + m;
//		System.out.println(k);
		System.out.println("enter the firstname");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println("enter the lastname");
		String str2 = sc.nextLine();
		String str = str1+" "+str2;
		System.out.println(str);

	}

}
