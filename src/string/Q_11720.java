package string;

import java.util.Scanner;

// 11720번 숫자의 합
public class Q_11720 {

	public static void main(String[] args) {
		// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오
		// ex) 입력 > 5 54321, 출력 > 15 
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		
		for(int i=0; i<n; i++) {
			sum += str.charAt(i) - '0';
		}
		System.out.println(sum);
		
	}

}
