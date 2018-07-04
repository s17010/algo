// 左下側が直角の二等辺三角形を表示

import java.util.Scanner;

public class Java1_17 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("三角形を表示します。");

		do {
			System.out.print("段数は：");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-(i+1); j++){
				System.out.print(" ");
			}
			for(int k=0; k<(i+1)*2-1; k++) {
				System.out.print((i+1)%10);
			}
			System.out.println();
		}
	}
}

