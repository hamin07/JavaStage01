package nin01;

import java.util.Scanner;

public class 문자와문자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		int n = sc.nextInt()-1;
		
		System.out.println(st.charAt(n));
	}
}
