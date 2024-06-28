package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		
		int sum = 0 ;
		
		for(int i = 0; i<5; i++) {
			int numb = sc.nextInt();
			sum += numb;
		}
		
		System.out.println("평균은" + (sum/5.0) + "입니다");
		
	}

}
