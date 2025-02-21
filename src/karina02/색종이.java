package karina02;

import java.util.Scanner;

public class 색종이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p[][] = new int[100][100];
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int j = a; j < a + 10; j++) {
		            // 사각형 부분에 1을 넣어주기
		                for (int k = b; k < b + 10; k++) {
		                    p[k][j] = 1;
		                }
		            }

		        }

		        // 2차원 배열 출력. 1인 숫자만 더하기.
		        int res = 0;
		        for (int i = 0; i < 100; i++) {
		            for (int j = 0; j < 100; j++) {
		                if (p[i][j] == 1) {
		                    res += p[i][j];
		                }
		            }
		        }
		        System.out.println(res);

		}
		
	}

