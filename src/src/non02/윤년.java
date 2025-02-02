package non02;

import java.util.Scanner;

public class 윤년 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0 && y >0) {
			System.out.println("1");
		} else if(x < 0 && y > 0) {
			System.out.println("2");
		} else if(x < 0 && y < 0) {
			System.out.println("3");
		} else if(x > 0 && y < 0) {
			System.out.println("4");
		}
	
/*		if(x > 0) {
			if(y > 0) {
				System.out.print(1);
			} 
			else {
				System.out.print(4);
			}
		} 
	
		else {
			if(y > 0) {
				System.out.print(2);
			} 
			else {
				System.out.print(3);
			}
		} */
	}
}
