package dfs_bfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 2667번:단지번호붙이기
public class Q_2667_3 {
	private static Scanner sc = new Scanner(System.in);
	private static int n = sc.nextInt(); // N*N

	private static int map[][] = new int[n + 1][n + 1];
	private static int visit[][] = new int[n + 1][n + 1];
	private static int count;

	public static void main(String[] args) {
		// 1은 집이 있는 곳, 0은 집이 없는 곳
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			String str = sc.next();
			for (int j = 1; j <= n; j++) {
				map[i][j] = str.charAt(j - 1) - '0';
				// System.out.println(map[i][j]);
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (map[i][j] == 1 && visit[i][j] == 0) {
					count = 0;
					list.add(dfs(i, j));
				}
			}
		}

		System.out.println(list.size());
		Collections.sort(list);
		for (int i : list) {
			System.out.println(i);
		}
	}

	static int dfs(int x, int y) {
		count++;

		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { 0, 0, -1, 1 };

		visit[x][y] = 1;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx > 0 && nx <= n && ny > 0 && ny <= n) {
				if (map[nx][ny] == 1 && visit[nx][ny] == 0) {
					dfs(nx, ny);
				}
			}
		}
		return count;
	}
}