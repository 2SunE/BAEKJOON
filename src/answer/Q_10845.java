package answer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

// 하.. "\n" 하나 안해줬다고 틀렸던 문제.. 새벽이라 눈이 침침해서 그런가? 
public class Q_10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
		Queue<Integer> q = new LinkedList<>(); // LinkedList 객체를 Queue 인터페이스 타입으로 변환
		
		// 입출력을 위한 br, bw 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int X = 0; // ex) push 1
		
		for(int i=0; i<N; i++) {
			String arr[] = br.readLine().split(" ");
			if(arr[0].equals("push")) {
				// push X: 정수 X를 큐에 넣는 연산이다.
				X = Integer.parseInt(arr[1]);
				q.offer(X);
			}else if(arr[0].equals("pop")) {
				// pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				if(q.isEmpty()) {
					bw.write("-1" + "\n");
				}else {
					bw.write(q.poll() + "\n");
				}	
			}else if(arr[0].equals("size")) {
				// size: 큐에 들어있는 정수의 개수를 출력한다.
				bw.write(q.size() + "\n");
			}else if(arr[0].equals("empty")) {
				// empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
				if(q.isEmpty()) {
					bw.write("1" + "\n");
				}else
					bw.write("0" + "\n");
			}else if(arr[0].equals("front")) {
				// front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				if(q.isEmpty()) {
					bw.write("-1" + "\n");
				}else
					bw.write(q.peek() + "\n");
			}else if(arr[0].equals("back")) {
				// back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				if(q.isEmpty()) {
					bw.write("-1" + "\n");
				}else
					bw.write(X + "\n");
			}
		}
		// 버퍼에 남아 있는 문자열을 출력한 뒤 버퍼를 비운다.
		bw.flush();
		// 스트림을 닫아준다.
		bw.close();
	}
}