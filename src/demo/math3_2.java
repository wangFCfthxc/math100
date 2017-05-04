package demo;

public class math3_2 {
	/*
	 * 問題:<水仙花數>,是指一個n位數(n >= 3),它的每個位上的數字的n次方之和等於它本身
	 * ex: 1^3 + 5^3 + 3^3 = 153
	 * wiki:嚴格意義來說水仙花數指三位數。 
	 * 求100~999之間的水仙花數
	 */
	
	/*
	 * 分析:
	 * 1.透過迴圈從100~999檢查所有3位數
	 * 2.對數字進行分解，分解出個位,十位,百位
	 * 3.如果滿足(個位,十位,百位三次方之和等於這個數)就印出來
	 */

	public static void main(String[] args) {
		int i, a, b, c;
		
		for(i=100; i<=999; i++){ // i從100開始到999
			a = i / 100; // 百位上的數字
			b = i / 10 % 10; // 十位上的數字
			c = i % 10; // 個位上的數字
			
			if(Narcissus(a) + Narcissus(b) + Narcissus(c) == i){ // 是否水仙花數?
				System.out.println(i + "是水仙花數");
			}
		}

	}

	private static int Narcissus(int n) { // 求3次方
		int m=1;
		for(int i=0; i<3; i++){ // 迴圈連乘3次
			m = m*n;
		}
		return m; // 傳回結果
	}

}
