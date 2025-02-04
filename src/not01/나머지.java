package not01;

import java.util.Scanner;

public class 나머지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] arr = new boolean[42];
		int count = 0;
		
		for(int i = 0; i < 10; i++ ) {
			int a = sc.nextInt();
			arr[a % 42] = true;
		}
		
		for(boolean k : arr) {
			if(k) {
				count++;
			}
		}
		System.out.println(count);
	}
	
}
