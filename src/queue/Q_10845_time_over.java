package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 행복한 시간 초과..
public class Q_10845_time_over {
	public static void main(String[] args) {
		//정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
		int X = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Queue<Integer> q = new LinkedList<>(); // LinkedList 객체를 Queue 인터페이스 타입으로 변환 
	
		for(int i=0; i<N; i++) {
			String arr = sc.next();
			if(arr.equals("push")) {
				// push X: 정수 X를 큐에 넣는 연산이다.
				X = sc.nextInt();
				q.add(X);
			}else if(arr.equals("pop")) {
				// pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				if(q.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(q.poll());
				}	
			}else if(arr.equals("size")) {
				// size: 큐에 들어있는 정수의 개수를 출력한다.
				System.out.println(q.size());
			}else if(arr.equals("empty")) {
				// empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
				if(!q.isEmpty()) {
					System.out.println(0);
				}else
					System.out.println(1);
			}else if(arr.equals("front")) {
				// front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				if(!q.isEmpty()) {
					System.out.println(q.peek());
				}else
					System.out.println(-1);
			}else if(arr.equals("back")) {
				// back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				if(!q.isEmpty()) {
					System.out.println(X);
				}else
					System.out.println(-1);
			}
		}	
	}
}
