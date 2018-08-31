import java.util.*;
//番号,氏名,氏名(カナ),性別,電話番号,郵便番号,県,市区町村,字,番地,部屋番号(あれば),生年月日
//[0], [1], [2],	[3],[4],	[5],[6],[7]    ,[8],[9],[10],		[11]

class Tester{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();
		String line[] = new String[num];
		String data[][] = new String[num][12];
		String ken[] = {"　北海道","　青森県","　岩手県","　宮城県","　秋田県","　山形県","　福島県","　茨城県","　栃木県","　群馬県","　埼玉県","　千葉県","　東京都","神奈川県","　新潟県","　富山県","　石川県","　福井県","　山梨県","　長野県","　岐阜県","　静岡県","　愛知県","　三重県","　滋賀県","　京都府","　大阪府","　兵庫県","　奈良県","和歌山県","　鳥取県","　島根県","　岡山県","　広島県","　山口県","　徳島県","　香川県","　愛媛県","　高知県","　福岡県","　佐賀県","　長崎県","　熊本県","　大分県","　宮崎県","鹿児島県","　沖縄県"};
		int pop[][] = new int[47][4];//人口格納 [男][女][合計][県の番号]
		for(int i=0;i<47;i++){
			pop[i][3] = i;
		}


		for(int i=0;i<num;i++){
			line[i] = scn.next();
		}
		for(int i=0;i<num;i++){
			for(int j=0;j<12;j++){
				data[i][j] = line[i].split(",")[j];
			}
		}

		Operation.aggregate(data,pop);
		Operation.sort(pop);

		for(int i=0;i<pop.length;i++){
			System.out.printf("%s %3d %d %d\n",ken[pop[i][3]],pop[i][2],pop[i][0],pop[i][1]);
		}
	}
}
