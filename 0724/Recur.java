//解答を見たという自己申告
//(実はこれ以外にも見てる)

import java.util.Scanner;

class Recur {
	static void recur(int n) {
		int[] nstk = new int[100];
		int[] sstk = new int[100];
		int ptr = -1;
		int sw = 0;

		while (true) {
			if (n > 0) {
				ptr++;
				nstk[ptr] = n;
				sstk[ptr] = sw;

				if (sw == 0)
					n = n -1;
				else if (sw == 1) {
					n = n - 2;
					sw = 0;
				}
				continue;
			}
			do {
				n = nstk[ptr];
				sw = sstk[ptr--] + 1;

				if (sw == 2) {
					System.out.println(n);
					if (ptr < 0)
						return;
				}
			} while (sw == 2);
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数入力:");
		int x = stdIn.nextInt();

		recur(x);
	}
}
