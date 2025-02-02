package not01;

import java.util.Scanner;

public class 최소최대 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = -1000001;
		int min = 1000001;
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}
}
