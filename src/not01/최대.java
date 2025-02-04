package not01;

import java.util.Scanner;

public class 최대 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt() };
		sc.close();
		
		int count = 0;
		int max = 0;
		int index = 0;
        
		for(int a : arr) {
			count++;
            
			if(a > max) {
				max = a;
				index = count;
			}
		}
		System.out.print(max + "\n" + index);
		
	}
}
