package com.naver;

public class Test3 {
	

	
	public void me5() {
		int [][][][] arr = new int[4][2][1][3];
		for(int[][][] x : arr) {
			for(int[][] y : x) {
				for(int[] z : y) {
					for(int a : z) {
						System.out.println(a);
					}
				}
			}
		}
	
	
	
	}
	
	public void me4() {
		int [][] arr = {
				{10, 11, 12, 13, 14},
				{10, 11, 12, 13, 14},
				{10, 11, 12, 13, 14},
				{10, 11, 12, 13, 14}
		};
		int[][] arr2 = new int[4][5];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = 1;
			}
		}
	}
	
	
	
	
	public void me3() {
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		int[][] arr2 = new int[3][3];
	}
	
	public void me2() {
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {1, 0, 3, 4};
		int[] arr3 = {4, 1, 6, 7};
		
		int[][] arr = {arr1, arr2, arr3};
	}
	
	
	public void me1() {
		int a = 10;
		int b = 20;
		int c = 3;
		int d = 11;
		
		int[] arr = {a, b, c, d};
		
		 
	}
	
}
