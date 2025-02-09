package nin01;

import java.util.Scanner;

public class 문자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); 
		String arr[] = new String[T];
		
		for(int i=0;i<T;i++) {
			String st = sc.next();
			arr[i] = st.substring(0,1)+ st.substring(st.length()-1,st.length());
		}
		
		sc.close();
		
		for(int i=0;i<T;i++) {
			System.out.println(arr[i]);
		}
	}
}
