package non02;
import java.util.Scanner;

public class 주사위세개 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a != b && b != c && a != c) {
        	int max;
        	// 만약 a > b 라면
        	if (a > b) {
        		// c > a > b 라면
        		if (c > a) {
        			max = c;
        		} 
        		// a > (b, c)
        		else {
        			max = a;
        		}
        	}
        	// b > a 라면	
        	else {
        		// c > b > a 라면
        		if (c > b) {
        			max = c;
        		}
        		// b > (a, c)
        		else {
        			max = b;
        		}
        	}
        	System.out.println(max * 100);
        }
        // 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
        else {
        	// 3개의 변수가 모두 같은 경우
        	if (a == b && a == c) {
        		System.out.println(10000 + a * 1000);
        	}
        	else {
        		// a가 b혹은 c랑만 같은 경우
        		if(a == b || a == c) {
        			System.out.println(1000 + a * 100);
        		}
        		// b가 c랑 같은 경우
        		else {
        			System.out.println(1000 + b * 100);
        		}
        	}
        }
        
//        // 세 주사위의 값이 모두 같을 경우
//        if (a == b && a == c) {
//            System.out.println(10000 + a * 1000);
//        }
//        // 두 주사위의 값이 같을 경우
//        else if (a == b || a == c) {
//            System.out.println(10000 + a * 100);
//        } else if (b == c) {
//            System.out.println(10000 + b * 100);
//        }
//        // 세 주사위 값이 모두 다른 경우
//        else if (a != b && a != c && b != c) {
//            int max;
//            if (a > b) {
//                if (c > a) {
//                    max = c;
//                } else {
//                    max = a;
//                }
//            } else {
//                if (c > b) {
//                    max = c;
//                } else {
//                    max = b;
//                }
//            }
//            System.out.println(max * 100);
//        }
        
    }
}
