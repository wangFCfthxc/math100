package demo;

public class math2_3 {
	/*
	 * 問題:大學四年生活費，使用整存零取的方式，控制每月月初取1000原使用，請算出一開始至少需要存多少錢?(假設銀行整存零取的年息1.71%)
	 */

	/*
	 * 分析:4年48個月，每月取1000，最後一個月正好取完。 第48個月存摺裡錢為:連本帶息為1000
	 * 第47個月存摺裡錢為:1000+第48個月的錢數/(1+0.00171/12)
	 * 第46個月存摺裡錢為:1000+第47個月的錢數/(1+0.00171/12)...
	 * 第01個月存摺裡錢為:1000+第02個月的錢數/(1+0.00171/12)
	 */

	/*
	 * 公式:money[i-1] = 1000 + money[i]/(1+MoneyRate/12);
	 */

	public static final double MoneyRate = 0.0171; // 存款利率

	public static void main(String[] args) {
		// 定義一個長度為48的陣列，用來裝每個月月初還剩下的錢
		double money[] = new double[48];

		// 第48個月月初1000元
		money[47] = 1000;
		System.out.printf("第48個月月初剩餘錢為:%.2f元\n", money[47]);
		// 透過迴圈逆推出前一個月的剩餘的錢
		for (int i = 47; i > 0; i--) {
			money[i - 1] = 1000 + money[i] / (1 + MoneyRate / 12);
			System.out.printf("第%d個月月初剩餘錢為:%.2f元\n", i, money[i - 1]);
		}

		// 最初要存入的錢
		System.out.printf("最初要存入%.2f元",money[0]);
	}

}
