package not01;

import java.util.Scanner;

public class 바구니뒤집기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		int M = sc.nextInt();
		int temp = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			while(a < b) {
				temp = arr[a];
				arr[a] = arr[b];
				arr[b] = temp;
				a++;
				b--;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
