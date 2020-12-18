package answer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q_2667 {
	static Scanner sc = new Scanner(System.in);

	static int N = sc.nextInt(); // 지도의 크기 N (정사각형)
	static int arr[][] = new int[N][N];
	static int visit[][] = new int[N][N]; // 집을 방문했는지 체크

	static ArrayList<Integer> list = new ArrayList<>();

	static int total = 0; // 총 단지수

	static int bfs(int x, int y) {
		// 상(-1,0) 하(1,0) 좌(0,-1) 우(0,1)
		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { 0, 0, -1, 1 };
		
		int house = 0; // 각 단지내 집의 수

		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { x, y });
		visit[x][y] = 1;

		total++;
		house++;

		// 상 하 좌 우 검사
		while (!q.isEmpty()) {
			int temp[] = q.peek();
			q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = temp[0] + dx[i];
				int ny = temp[1] + dy[i];

				// 범위 밖에 나가지 않을 때
				if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
					if (arr[nx][ny] == 1 && visit[nx][ny] == 0) {
						q.offer(new int[] { nx, ny });		
						visit[nx][ny] = 1;
						house++;
					}
				}
			}
		}
		return house;
	}

	public static void main(String[] args) {
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			for (int j = 0; j < N; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 1 && visit[i][j] == 0) {
					list.add(bfs(i, j));
				}
			}
		}
		System.out.println(total);
		Collections.sort(list);
		for (int num : list) {
			System.out.println(num);
		}
	}
}