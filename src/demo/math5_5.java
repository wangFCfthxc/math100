package demo;

import java.util.Scanner;

public class math5_5 {
	/*
	 * 雞兔同籠
	 * 中國古代的數學名題,最早紀載於1500年前的(孫子算經)。原文如下:
	 * 今有雉、兔同籠，上有三十五頭，下九十四足。問雉、兔各幾何？
	 * 問題；在一個籠子裡關著許多隻雞和許多隻兔,從上面數共有35個頭,從下面數共有94只腳,問雞、兔數量各是多少?
	 */
	
	/*
	 * 分析:用數學方法,假設雞、兔的個數分別為x、y
	 *  x  +  y = head
	 * 2x  + 4y = foot
	 * y = (foot -(2*head))/2
	 * x = (2*head) - (foot/2)
	 */

	public static void main(String[] args) {
		int[] tu = {0};
		int[] ji = {0};
		int head, foot;
		System.out.println("雞兔同籠問題求解!");
		System.out.printf("輸入頭數:");
		Scanner input = new Scanner(System.in);
		head = input.nextInt();	// 輸入頭數
		System.out.printf("輸入腳數:");
		foot = input.nextInt();	// 輸入腳數
		
		doJTTL(head, foot, tu, ji);	// 呼叫雞兔同籠方法求解
		System.out.printf("雞有:%d隻,兔子有:%d隻。\n", ji[0],tu[0]);
	}
	
	/*
	 * 參數head,頭數
	 * 參數foot,腳數
	 * 參數tu,儲存兔子的個數
	 * 參數ji,儲存雞的個數
	 */
	private static void doJTTL(int head, int foot, int[] tu, int[] ji){
		tu[0] = (foot-(2*head))/2;
		ji[0] = (2*head) - (foot/2);
	}

}
