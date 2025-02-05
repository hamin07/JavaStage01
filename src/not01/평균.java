package not01;

import java.util.Scanner;

public class 평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
        double[] arr = new double[N];
        
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        //최댓값 찾기
        double max = 0;
        for(int i = 0; i < N; i++){
            if(arr[i] > max) max = arr[i];
        }
    
        //평균 계산하기
        double sum = 0;
        for(int i = 0; i < N; i++){
            sum += (arr[i]/max)*100;
        }
        System.out.println(sum/N);
	}
}
