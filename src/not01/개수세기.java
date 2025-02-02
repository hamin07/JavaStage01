package not01;

import java.util.Scanner;

public class 개수세기 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int count = 0;
		 int N = sc.nextInt();
		 int arr[] = new int[N];
		
		 for(int i = 0; i < N; i++) {
			 arr[i] = sc.nextInt();
		 }
		 
		 int a = sc.nextInt();
		 
		 for(int j = 0; j < N; j++) {
			 if(a==arr[j]) {
				 count++;	
			 }
		 }
		 System.out.println(count);
		 
		 
	}
}
