package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6] ;
		
		for (int i = 0 ; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45 ) +1;
			for (int j = 0 ; j < i ; j++) {
				if (lotto[i] == lotto[j] && i != j) {
					lotto[i] = (int)(Math.random()*45 ) +1;
					j = 0;
				}
			}
			System.out.print(lotto[i] + "	");
		}
			
	}

}
