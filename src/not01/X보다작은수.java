package not01;

import java.util.Scanner;

public class X보다작은수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		int X = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			arr[i] = A;
			
			if(arr[i] < X) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}
