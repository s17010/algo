//-----------A--------------//
import java.util.Scanner;
import java.util.Comparator;

public class LinkedListTester {
	static Scanner stdIn = new Scanner(System.in);

	static class Data {
		static final int NO = 1;
		static final int NAME = 2;

		private Integer no;
		private String name;

		public String toString() {
			return "(" + no + ")" + name;
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

		public static final Comparator<Data> NO_ORDER = new NoOrderComparator();
		private static class NoOrderComparator implements Comparator<Data> {
			public int compare(Data d1, Data d2) {
				return (d1.no > d2.no) ? 1 : (d1.no < d2.no) ? -1 : 0;
		}
	}

	public static final Comparator<Data> NAME_ORDER = new NameOrderComparator();
	private static class NameOrderComparator implements Comparator<Data> {
		public int compare(Data d1, Data d2) {
			return d1.name.compareTo(d2.name);
		}
	}
}

//-------------B-------------//

enum Menu {
	ADD_FIRST("先頭にノードを挿入"),
	ADD_LAST("末尾にノードを挿入"),
	RMV_FIRST("先頭ノードを削除"),
	RMV_LAST("末尾ノードを削除"),
	RMV_CRNT("着目ノードを削除"),
	CLEAR("全ノードを削除"),
	SEARCH_NO("番号で探索"),
	SEARCH_NAME("氏名で探索"),
	NEXT("着目ノードを進める"),
	PRINT_CRNT("着目ノードを表示"),
	DUMP("全ノードを表示"),
	PURGE("先頭以外削除"),
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
		for (Menu m : Menu.values()) {
			System.out.printf("(%d) %s ", m.ordinal(), m.getMessage());
			if ((m.ordinal() % 3) == 2 &&
					m.ordinal() != Menu.TERMINATE.ordinal())
				System.out.println();
		}
		System.out.print(":");
		key = stdIn.nextInt();
	} while (key  < Menu.ADD_FIRST.ordinal() ||
			key > Menu.TERMINATE.ordinal());
	return Menu.MenuAt(key);
}

public static void main(String[] args) {
	Menu menu;
	Data data;
	Data ptr;
	Data temp = new Data();

	LinkedList<Data> list = new LinkedList<Data>();

	do {
		switch (menu = SelectMenu()) {
			case ADD_FIRST :
				data = new Data();
				data.scanData("先頭に挿入",Data.NO | Data.NAME);
				list.addFirst(data);
				break;

			case ADD_LAST :
				data = new Data();
				data.scanData("末尾に挿入", Data.NO | Data.NAME);
				list.addLast(data);
				break;

			case RMV_FIRST :
				list.removeFirst();
				break;

			case RMV_LAST :
				list.removeLast();
				break;

			case RMV_CRNT :
				list.removeCurrentNode();
				break;

			case SEARCH_NO :
				temp.scanData("探索",Data.NO);
				ptr = list.search(temp, Data.NO_ORDER);
				if (ptr == null)
					System.out.println("その番号のデータはありません");
				else
					System.out.println("探索成功:" + ptr);
				break;

			case SEARCH_NAME :
				temp.scanData("探索",Data.NAME);
				ptr = list.search(temp, Data.NAME_ORDER);
				if (ptr == null)
					System.out.println("その名前のデータはありません");
				else
					System.out.println("探索成功:" + ptr);
				break;

			case NEXT :
				list.next();
				break;

			case PRINT_CRNT :
				list.printCurrentNode();
				break;

			case DUMP :
				list.dump();
				break;

			case CLEAR :
				list.clear();
				break;

			case PURGE :
				list.purge(Data.NO_ORDER);
		}
	} while (menu != Menu.TERMINATE);
}
}
