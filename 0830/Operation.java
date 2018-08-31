class Operation{
	static void sort(int[][] pop){
		int num = pop.length;
		for(int i=0;i<num-1;i++){//男女合計でソート
			for(int j=0;j<num-1;j++){
				if(pop[j][2] < pop[j+1][2]){
					swap(pop,j,j+1);
				}
				if(pop[j][2] == pop[j+1][2]){
					if(pop[j][0] < pop[j+1][0]){
						swap(pop,j,j+1);
					}
					if(pop[j][0] == pop[j+1][0]){
						if(pop[j][1] < pop[j+1][1]){
							swap(pop,j,j+1);
						}
					}
				}
			}
		}
	}

	static void swap(int[][] pop,int d1,int d2){
		int[] tmp = pop[d1];
		pop[d1] = pop[d2];
		pop[d2] = tmp;
	}

	static void aggregate(String[][] data,int[][] pop){
		int num = data.length;
		for(int i=0;i<num;i++){
			switch(data[i][6]){
				case "北海道":
					if(data[i][3].equals("男")){
						pop[0][0] += 1;
					}
					else{
						pop[0][1] += 1;
					}
					break;

				case "青森県":
					if(data[i][3].equals("男")){
						pop[1][0] += 1;
					}
					else{
						pop[1][1] += 1;
					}
					break;

				case "岩手県":
					if(data[i][3].equals("男")){
						pop[2][0] += 1;
					}
					else{
						pop[2][1] += 1;
					}
					break;

				case "宮城県":
					if(data[i][3].equals("男")){
						pop[3][0] += 1;
					}
					else{
						pop[3][1] += 1;
					}
					break;

				case "秋田県":
					if(data[i][3].equals("男")){
						pop[4][0] += 1;
					}
					else{
						pop[4][1] += 1;
					}
					break;

				case "山形県":
					if(data[i][3].equals("男")){
						pop[5][0] += 1;
					}
					else{
						pop[5][1] += 1;
					}
					break;

				case "福島県":
					if(data[i][3].equals("男")){
						pop[6][0] += 1;
					}
					else{
						pop[6][1] += 1;
					}
					break;

				case "茨城県":
					if(data[i][3].equals("男")){
						pop[7][0] += 1;
					}
					else{
						pop[7][1] += 1;
					}
					break;

				case "栃木県":
					if(data[i][3].equals("男")){
						pop[8][0] += 1;
					}
					else{
						pop[8][1] += 1;
					}
					break;

				case "群馬県":
					if(data[i][3].equals("男")){
						pop[9][0] += 1;
					}
					else{
						pop[9][1] += 1;
					}
					break;

				case "埼玉県":
					if(data[i][3].equals("男")){
						pop[10][0] += 1;
					}
					else{
						pop[10][1] += 1;
					}
					break;

				case "千葉県":
					if(data[i][3].equals("男")){
						pop[11][0] += 1;
					}
					else{
						pop[11][1] += 1;
					}
					break;

				case "東京都":
					if(data[i][3].equals("男")){
						pop[12][0] += 1;
					}
					else{
						pop[12][1] += 1;
					}
					break;

				case "神奈川県":
					if(data[i][3].equals("男")){
						pop[13][0] += 1;
					}
					else{
						pop[13][1] += 1;
					}
					break;

				case "新潟県":
					if(data[i][3].equals("男")){
						pop[14][0] += 1;
					}
					else{
						pop[14][1] += 1;
					}
					break;

				case "富山県":
					if(data[i][3].equals("男")){
						pop[15][0] += 1;
					}
					else{
						pop[15][1] += 1;
					}
					break;

				case "石川県":
					if(data[i][3].equals("男")){
						pop[16][0] += 1;
					}
					else{
						pop[16][1] += 1;
					}
					break;

				case "福井県":
					if(data[i][3].equals("男")){
						pop[17][0] += 1;
					}
					else{
						pop[17][1] += 1;
					}
					break;

				case "山梨県":
					if(data[i][3].equals("男")){
						pop[18][0] += 1;
					}
					else{
						pop[18][1] += 1;
					}
					break;

				case "長野県":
					if(data[i][3].equals("男")){
						pop[19][0] += 1;
					}
					else{
						pop[19][1] += 1;
					}
					break;

				case "岐阜県":
					if(data[i][3].equals("男")){
						pop[20][0] += 1;
					}
					else{
						pop[20][1] += 1;
					}
					break;

				case "静岡県":
					if(data[i][3].equals("男")){
						pop[21][0] += 1;
					}
					else{
						pop[21][1] += 1;
					}
					break;

				case "愛知県":
					if(data[i][3].equals("男")){
						pop[22][0] += 1;
					}
					else{
						pop[22][1] += 1;
					}
					break;

				case "三重県":
					if(data[i][3].equals("男")){
						pop[23][0] += 1;
					}
					else{
						pop[23][1] += 1;
					}
					break;

				case "滋賀県":
					if(data[i][3].equals("男")){
						pop[24][0] += 1;
					}
					else{
						pop[24][1] += 1;
					}
					break;

				case "京都府":
					if(data[i][3].equals("男")){
						pop[25][0] += 1;
					}
					else{
						pop[25][1] += 1;
					}
					break;

				case "大阪府":
					if(data[i][3].equals("男")){
						pop[26][0] += 1;
					}
					else{
						pop[26][1] += 1;
					}
					break;

				case "兵庫県":
					if(data[i][3].equals("男")){
						pop[27][0] += 1;
					}
					else{
						pop[27][1] += 1;
					}
					break;

				case "奈良県":
					if(data[i][3].equals("男")){
						pop[28][0] += 1;
					}
					else{
						pop[28][1] += 1;
					}
					break;

				case "和歌山県":
					if(data[i][3].equals("男")){
						pop[29][0] += 1;
					}
					else{
						pop[29][1] += 1;
					}
					break;

				case "鳥取県":
					if(data[i][3].equals("男")){
						pop[30][0] += 1;
					}
					else{
						pop[30][1] += 1;
					}
					break;

				case "島根県":
					if(data[i][3].equals("男")){
						pop[31][0] += 1;
					}
					else{
						pop[31][1] += 1;
					}
					break;

				case "岡山県":
					if(data[i][3].equals("男")){
						pop[32][0] += 1;
					}
					else{
						pop[32][1] += 1;
					}
					break;

				case "広島県":
					if(data[i][3].equals("男")){
						pop[33][0] += 1;
					}
					else{
						pop[33][1] += 1;
					}
					break;

				case "山口県":
					if(data[i][3].equals("男")){
						pop[34][0] += 1;
					}
					else{
						pop[34][1] += 1;
					}
					break;

				case "徳島県":
					if(data[i][3].equals("男")){
						pop[35][0] += 1;
					}
					else{
						pop[35][1] += 1;
					}
					break;

				case "香川県":
					if(data[i][3].equals("男")){
						pop[36][0] += 1;
					}
					else{
						pop[36][1] += 1;
					}
					break;

				case "愛媛県":
					if(data[i][3].equals("男")){
						pop[37][0] += 1;
					}
					else{
						pop[37][1] += 1;
					}
					break;

				case "高知県":
					if(data[i][3].equals("男")){
						pop[38][0] += 1;
					}
					else{
						pop[38][1] += 1;
					}
					break;

				case "福岡県":
					if(data[i][3].equals("男")){
						pop[39][0] += 1;
					}
					else{
						pop[39][1] += 1;
					}
					break;

				case "佐賀県":
					if(data[i][3].equals("男")){
						pop[40][0] += 1;
					}
					else{
						pop[40][1] += 1;
					}
					break;

				case "長崎県":
					if(data[i][3].equals("男")){
						pop[41][0] += 1;
					}
					else{
						pop[41][1] += 1;
					}
					break;

				case "熊本県":
					if(data[i][3].equals("男")){
						pop[42][0] += 1;
					}
					else{
						pop[42][1] += 1;
					}
					break;

				case "大分県":
					if(data[i][3].equals("男")){
						pop[43][0] += 1;
					}
					else{
						pop[43][1] += 1;
					}
					break;

				case "宮崎県":
					if(data[i][3].equals("男")){
						pop[44][0] += 1;
					}
					else{
						pop[44][1] += 1;
					}
					break;

				case "鹿児島県":
					if(data[i][3].equals("男")){
						pop[45][0] += 1;
					}
					else{
						pop[45][1] += 1;
					}
					break;

				case "沖縄県":
					if(data[i][3].equals("男")){
						pop[46][0] += 1;
					}
					else{
						pop[46][1] += 1;
					}
					break;

				default:
					break;
			}
		}
		for(int i=0;i<pop.length;i++){
			pop[i][2] = pop[i][0] + pop[i][1];
		}
	}
}
