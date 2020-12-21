package string;

import java.util.Scanner;

// 2675번 문자열 반복
public class Q_2675 {

	public static void main(String[] args) {
		/*문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
		즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
		S에는 OR Code "alphanumeric" 문자만 들어있다.*/
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		String p = "";
		
		for(int i=0; i<t; i++) {
			int r = sc.nextInt(); // 3
			String s = sc.next(); // ABC
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<r; k++) {
					p += s.charAt(j);
				}
			}
			System.out.println(p);
			p="";
		}
	}

}
