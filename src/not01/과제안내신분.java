package not01;

import java.util.Scanner;

public class 과제안내신분 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[31];
	
	for(int i = 1; i <= 28; i++) {
		int a = sc.nextInt();
		arr[a] = 1;
	}
	
	for(int i = 1; i < arr.length; i++) {
		if(arr[i] != 1) {
			System.out.println(i);
		}
	}
	
  }
}
