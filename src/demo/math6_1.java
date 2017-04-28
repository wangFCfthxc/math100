package demo;

import java.util.Scanner;

public class math6_1 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int m, n, answer;
		System.out.print("請輸入第一個整數:");
		m = input.nextInt();
		System.out.print("請輸入第二個整數:");
		n = input.nextInt();

		answer = GCD(m, n); // 呼叫最大公因數
		System.out.println("最大公因數:" + answer);
	}

	// // 1.wiki 輾轉相除
	// private static int GCD(int a, int b) {
	// if (b == 0){
	// return a;
	// }
	// return a % b == 0 ? b : GCD(b, a % b);
	// }

	// // 2.math100 輾轉相除
	// private static int GCD(int a, int b) {
	// int temp;
	// // 大數放a中,小數放b中
	// if(a<b){
	// temp = a;
	// a = b;
	// b = temp;
	// }
	// // 求a%b的餘數
	// // 若temp = 0,則b為最大公因數
	// // 若temp != 0,則把b的值給a,temp的值給a,直到temp == 0
	// while(b !=0){
	// temp = a % b;
	// a = b;
	// b = temp;
	// }
	// return a;
	// }

	// 3.輾轉相減,但是不能跟0比
	private static int GCD(int a, int b) {
		int temp;
		while ((a != b)) {
			// 大數放a中,小數放b中
			if (a < b) {
				temp = a;
				a = b;
				b = temp;
			}
			a = a - b;
		}
		return a;
	}
}
