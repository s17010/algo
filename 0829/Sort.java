//伊波さんのコピーしました。

import java.util.*;

class Sort {
	static void sort(int[][] data) {
		int num = data.length;
		for (int i = 0; i < num - 1; i++) {
			for (int j = 0; j < num - 1; j++) {
				if (data[j][0] < data[j + 1][0]) {
					swap(data,j,j + 1);
				}
			}
		}

		for (int i = 0; i < num - 1; i++) {
			while (data[i][0] == data[i + 1][0]) {
				if (data[i][1] < data[i + 1][1]) {
					swap(data,i,i + 1);
				}
				i++;
			}
		}

		for (int i = 0; i < num - 1; i++) {
			while(data[i][1] == data[i + 1][1]) {
				if(data[i][2] < data[i + 1][2]) {
					swap(data,i,i + 1);
				}
				i++;
			}
		}
	}

	static void swap(int[][] data,int d1,int d2) {
		int[] tmp = data[d1];
		data[d1] = data[d2];
		data[d2] = tmp;
	}
}
