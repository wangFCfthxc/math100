package demo;

import java.util.Scanner;

public class math4_1 {

	/*
	 * 質數:指不能被分解的數,除了1和它本身之外沒有它數能夠整除
	 */

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		int number;
		System.out.print("(1~N範圍的質數)請輸入一個整數N:");
		number = input.nextInt();
		// 1.
		// for (int i=1; i<=number; i++){
		// boolean isP = true;
		// for (int j=2; j<=i/2; j++){
		// if (i%j==0){ // 如果有i被j整除,就不是質數
		// isP = false;
		// break; // 不是質數就退出
		// }
		// }
		// System.out.print(i + (isP?"*":" ") +" "); // 是質數就印出*
		// if (i%10==0)System.out.println(); // 每10個換行
		// }
		
		// 2.
		math4_1 test = new math4_1(); // 建立物件
		for (int i = 1; i <= number; i++) { // 迴圈檢查每個數是不是質數
			if (test.isP(i) == true) {
				System.out.print(i + "*" +" "); // 是質數
			}else{
				System.out.print(i + "  "); // 不是質數
			}
			if (i%10==0)System.out.println(); // 每10個換行
		}
	}
	// 2.的方法
	public boolean isP(int number) {
		boolean isP = true;	
		for(int j=2; j<=number/2; j++){
			if (number%j==0){ // 如果有i被j整除,就不是質數
				isP = false;
				break; // 不是質數就退出
			}
		}		
		return isP;
	}
}
