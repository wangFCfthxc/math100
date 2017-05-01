package demo;

public class math3_1 {

	/*
	 * 問題:0~9這10個數字可以組成多少個不重複的3位數?
	 */

	/*
	 * 分析:3位數的範圍，最小100~最大999 可以從100開始透過迴圈檢查，一個一個數字進行判斷 如果是計數器就+1
	 */

	public static void main(String[] args) {
		int a, b, c; // a代表百位數,b代表十位數,c代表個位數
		int count = 0; // 計數器

		for (int i = 100; i <= 999; i++) { // 迴圈從100開始檢查
			a = i / 100;
			b = i / 10 % 10;
			c = i % 10;
			if (a != b && a != c && b != c) { // a, b ,c不重複時執行
				System.out.print(i + " "); // 輸出數字，後面加空格
				count++;
				if (count % 10 == 0) { // 每10個數字換行
					System.out.println();
				}
			}
		}
		System.out.println("\n一共有" + count +"個不重複的3位數");
	}

}
