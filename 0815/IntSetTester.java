public class IntSetTester {
	public static void main(String[] args) {
		IntSet s1 = new IntSet(20);
		IntSet s2 = new IntSet(20);
		IntSet s3 = new IntSet(20);

		s1.add(10);
		s1.add(15);
		s1.add(20);
		s1.add(25);

		s1.copyTo(s2);
		s2.add(12);
		s2.remove(25);

		s3.copyFrom(s2);

		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);

		System.out.println("集合s1に15は" + (s1.contains(15) ? "含まれる" : "含まれない"));
		System.out.println("集合s2に25は" + (s2.contains(25) ? "含まれる" : "含まれない"));
		System.out.println("集合s1と集合s2は" + (s1.equalTo(s2) ? "等しい" : "等しくない"));
		System.out.println("集合s2と集合s3は" + (s2.equalTo(s3) ? "等しい" : "等しくない"));

		s3.unionOf(s1,s2);

		System.out.println("集合s1と集合s2の和集合は" + s3);
		System.out.println("集合s1は" + (s1.isEmpty() ? "要素無" : "要素有"));
		System.out.println("集合s1は" + (s1.isFull() ? "満タン" : "空き有"));

		s1.clear();
		System.out.println("空っぽにしたs1\n" + s1);
	}
}
