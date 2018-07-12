import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

class PhysExamSearch {

	//--- 身体検査データ ---//
	static class PhyscData {
		private String name;			// 氏名
		private int    height;		// 身長
		private double vision;		// 視力

		//--- コンストラクタ ---//
		public PhyscData(String name, int height, double vision) {
			this.name = name;  this.height = height;  this.vision = vision;
		}

		//--- 文字列化 --//
		public String toString() {
			return name + " " + height + " " + vision;
		}

		//--- 身長昇順用コンパレータ ---//
		public static final Comparator<PhyscData> VISION_ORDER =
										 new VisionOrderComparator();

		private static class VisionOrderComparator
										implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.vision > d2.vision) ?  1 :
						 (d1.vision < d2.vision) ? -1 : 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = {					// 配列の要素は視力・降順でなければならない
			new PhyscData("赤坂一", 172, 0.3),
			new PhyscData("飯田二重", 168, 0.4),
			new PhyscData("植松三瓶", 169, 0.8),
			new PhyscData("遠藤四葉", 181, 1.1),
			new PhyscData("大岡五十鈴", 173, 1.5),
			new PhyscData("加藤六郎", 164, 1.8),
			new PhyscData("木下七海", 175, 2.0),
		};
		System.out.print("視力がいくつの人を探しますか：");
		double vision = stdIn.nextDouble();				// キー値の読込み
		int idx = Arrays.binarySearch(
						x,				// 配列xから
						new PhyscData("", 0, vision),// 視力がvisionの要素を
						PhyscData.VISION_ORDER		// VISION_ORDERによって探索
					 );

		if (idx < 0)
			System.out.println("その値の要素は存在しません。");
		else {
			System.out.println("その値はx[" + idx + "]にあります。");
			System.out.println("データ：" + x[idx]);
		}
	}
}
