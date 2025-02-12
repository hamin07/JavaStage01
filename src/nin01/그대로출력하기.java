package nin01;

import java.util.Scanner;

public class 그대로출력하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			String st = sc.nextLine();
			
			System.out.println(st);
		}
		
		sc.close();
	}
}
