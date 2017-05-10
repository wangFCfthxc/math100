package demo;

import java.util.Scanner;

public class math3_2_2 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int number;
		System.out.print("請輸入一個超過100的整數N:");
		number = input.nextInt(); // 指定判斷範圍
		
		for (int a = 100; a <= number; a++) { // 100~N的範圍
			if (Narcissus(a)) { // 找到印出結果
				System.out.println(a + "是水仙花數");
			}
		}

	}

	public static boolean Narcissus(int i) { // 水仙花數判斷方法
		int s = 0;
		int n = (i + "").length(); // 數字轉為字串
		for (int k = 1; k <= n; k++) { // 處理數字串
			int t1 = (int) (i / Math.pow(10, k - 1)); // 從後往前擷取數字串
			int t2 = (int) Math.pow((t1 % 10), n); // 
			s += t2;
		}
		if(s==i){ // 滿足水仙花條件
			return true;
		}else{ // 不滿足水仙花條件
			return false;
		}
	}
}
