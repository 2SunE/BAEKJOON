package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class Q_10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		Stack<Integer> s = new Stack<>(); // Stack

		// 입출력을 위한 br, bw 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int x = 0;

		while (N-- > 0) {
			String arr[] = br.readLine().split(" ");
			switch (arr[0]) {
			case "push":
				x = Integer.parseInt(arr[1]);
				s.push(x);
				break;
			case "top":
				if (!s.isEmpty()) {
					bw.write(s.peek() + "\n");
				} else
					bw.write("-1" + "\n");
				break;
			case "size":
				bw.write(s.size() + "\n");
				break;
			case "pop":
				if (!s.isEmpty()) {
					bw.write(s.pop() + "\n");
				} else
					bw.write("-1" + "\n");
				break;
			case "empty":
				if (!s.empty()) {
					bw.write("0" + "\n");
				} else
					bw.write("1" + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}
