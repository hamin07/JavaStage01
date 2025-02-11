package nin01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 단어의개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		sc.close();
		
		StringTokenizer st = new StringTokenizer(s," ");
		
		System.out.println(st.countTokens());
	}
}
		// StringTokenizer  분리 기준을 공백으로 지정해주면 공백을 기준으로 나뉘어 토큰에 저장해준다, countTokens 