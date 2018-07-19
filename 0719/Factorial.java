// 階乗値を再帰的に求める

import java.util.Scanner;

class Factorial {

	//--- 非負の整数値nの階乗値を返却 ---//
	static int factorial(int n) {
		int ans =1;
		if (n > 0){
			for(int i = 1; i<=n;i++)
				ans = ans*i;
		return ans;
		}else
			return 0;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数を入力せよ：");
		int x = stdIn.nextInt();

		System.out.println(x + "の階乗は" + factorial(x) + "です。");
	}
}

