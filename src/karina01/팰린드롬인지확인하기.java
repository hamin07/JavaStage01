package karina01;

import java.util.Scanner;

public class 팰린드롬인지확인하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        String st = sc.nextLine();
        
        StringBuilder reversed = new StringBuilder();

        for(int i = st.length()-1; i>=0;i--) { //역순정렬
            reversed.append(st.charAt(i));
        }
        
        if (st.equals(reversed.toString())) { //비교
            System.out.println(1);
        }else {
            System.out.println(0);
        }
	}
}
