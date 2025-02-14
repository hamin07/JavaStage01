package karina01;

import java.util.Scanner;

public class 단어공부 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[26];
		String st = sc.next();
		
		for(int i=0; i<st.length(); i++) {
			if (65 <= st.charAt(i) && st.charAt(i) <= 90) { // 대문자 범위
				arr[st.charAt(i) - 65]++;	// 해당 인덱스의 값 1 증가
			}
		    
			else {	// 소문자 범위
				arr[st.charAt(i) - 97]++;
			}
			
		}
		int max = -1;
		char ch = '?';
 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
			}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
 
		System.out.print(ch);
	}

	
}
