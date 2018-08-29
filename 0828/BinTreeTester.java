import java.util.Scanner;

class BinTreeTester {
	static Scanner stdIn = new Scanner(System.in);
	static class Data {
		public static final int NO = 1;
		public static final int NAME = 2;

		private Integer no;
		private String name;

		Integer keyCode() {
			return no;
		}
		public String toString() {
			return name;
		}
		void scanData(String guide, int sw) {
			System.out.println(guide + "するデータを入力してください");
			if ((sw & NO) == NO) {
				System.out.print("番号:");
				no = stdIn.nextInt();
			}
			if ((sw & NAME) == NAME) {
				System.out.print("名前:");
				name = stdIn.next();
			}
		}
	}

	enum Menu {
		ADD("挿入"),
		REMOVE("削除"),
		SEARCH("探索"),
		PRINT("表示"),
		PRINTR("逆表示"),
		TERMINATE("終了");

		private final String message;

		static Menu MenuAt(int idx) {
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}
		Menu(String string) {
			message = string;
		}
		String getMessage() {
			return message;
		}
	}

	static Menu SelectMenu() {
		int key;
		do {
			for (Menu m : Menu.values())
				System.out.printf("(%d) %s ", m.ordinal(), m.getMessage());
			System.out.print(":");
			key = stdIn.nextInt();
		} while (key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());
		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Menu menu;
		Data data;
		Data ptr;
		Data temp = new Data();
		BinTree<Integer, Data> tree = new BinTree<Integer, Data>();

		do {
			switch (menu = SelectMenu()) {
				case ADD :
					data = new Data();
					data.scanData("挿入",Data.NO | Data.NAME);
					tree.add(data.keyCode(), data);
					break;

				case REMOVE :
					temp.scanData("削除", Data.NO);
					tree.remove(temp.keyCode());
					break;

				case SEARCH :
					temp.scanData("探索", Data.NO);
					ptr =  tree.search(temp.keyCode());
					if (ptr != null)
						System.out.println("その番号の氏名は" + ptr + "です");
					else
						System.out.println("該当のデータはありません");
					break;

				case PRINT :
					tree.print();
					break;

				case PRINTR :
					tree.printReverse();
					break;
			}
		}while (menu != Menu.TERMINATE);
	}
}
