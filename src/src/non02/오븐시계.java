package non02;

import java.util.Scanner;

public class 오븐시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int T = sc.nextInt();
		
/*		M += T;	 
		 H += M / 60;  
		 H %= 24;
		 System.out.println(H + " " + M);      
		 sc.close(); */
		
		M = H * 60 + M;
		M = M + T;
		
		H = (M/60) % 24;
		int Minute = M % 60;
		
		System.out.println(H + " " + Minute);
		 
	}
}


