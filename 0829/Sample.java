//伊波さんのコピーしました。

import java.util.*;

class Sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] line = new String[num];
		int data[][] = new int[num][3];

		for (int i = 0; i < num; i++) {
			line[i] = sc.next();
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 3; j++) {
				data[i][j] = Integer.parseInt(line[i].split(",")[j]);
			}
		}
		Sort.sort(data);

		for (int i = 0; i < num; i++) {
			System.out.printf("%d %d %d\n", data[i][0],data[i][1], data[i][2]);
		}
	}
}
