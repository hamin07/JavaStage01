package non01;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		        // Scanner 객체를 생성하여 사용자로부터 입력 받기
		        Scanner scanner = new Scanner(System.in);

		        // 첫 번째 세 자리 숫자를 입력받음
		        int a = scanner.nextInt();
		        // 두 번째 세 자리 숫자를 입력받음
		        int b = scanner.nextInt();

		        // number2의 1의 자리와 number1의 곱 출력
		        System.out.println(a * (b % 10));

		        // number2의 10의 자리와 number1의 곱 출력
		        System.out.println(a * ((b / 10) % 10));

		        // number2의 100의 자리와 number1의 곱 출력
		        System.out.println(a * (b / 100));

		        // number1과 number2의 전체 곱 출력
		        System.out.println(a * b);
		       
	 }
}
