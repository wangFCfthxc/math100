package demo;

import java.util.Scanner;

public class math2_4 {

	public static void main(String[] args) {
		/* 賽場計分
		 * 問題:10個評委為參賽選手評分，分數為0~100分。
		 * 選手最後得分為:去掉1個最高分和1個最低分其餘8個分數的平均值。
		 */	
		
		/*
		 * 分析:把10個評委的評分放到陣列裡，透過迴圈，把最大值、最小值求出來，同時累加求和。
		 */
		
		/*
		 * 迴圈輸入10個人分數
		 * 分數全部加起來
		 * 比大小求出最大值、最小值
		 * 結果:(全部分數-最大值-最小值)/8
		 */
		
		int i, max, min ,sum;
		int x[] = new int[10];
		
		max = 0; // 最大值，比max大就是最大值
		min = 100; // 最小值，比min小就是最小值
		sum = 0;
		for(i=0; i<10; i++){
			System.out.print("請輸入第" + (i+1) + "分數:");
			Scanner input = new Scanner(System.in);
			x[i] = input.nextInt(); // 鍵盤輸入分數，存入陣列
			
			sum = sum + x[i]; // 全部分數加起來
			
			// 透過比大小方式求最大值、最小值
			if(x[i]>max){
				max = x[i];
			}
			if(x[i]<min){
				min = x[i];
			}
		}
		System.out.println("去掉最高分、最低分:" + max + "、" + min);
		System.out.println("平均分數:" + (sum-max-min)/8);

	}

}
