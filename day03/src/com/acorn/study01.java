package com.acorn;

public class study01 {

	public static void main(String[] args) {
		System.out.println("JAVA1");
		System.out.println("JAVA2");
		System.out.println("JAVA3");
		
		// for JAVA + "일련번호" 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("JAVA" + (i+1));
		}
		int[] iCountArr = {3, 4, 5, 4, 5, 6, 7};
		char[] cInfoArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		
		for(int i = 0; i < iCountArr.length; i++) {
			System.out.println(iCountArr[i]);
			for (int j = 0; j < iCountArr[i]; j++) {
				System.out.print(cInfoArr[j]);
			}
			System.out.println("\n");
		}
		char[] cInfoArr1 = {
				'a', 'b', 'c', 'd', 'e', 'f', 'g',
				'g', 'f', 'e', 'd', 'c', 'b', 'a',
				'a', 'b', 'c', 'd', 'e', 'f', 'g',
				'g', 'f', 'e', 'd', 'c', 'b', 'a',
				'g', 'f', 'e', 'd', 'c', 'b', 'a'
		};
		
		// 직관적으로 보려고 재선언한 것 (의미 X)
		iCountArr[0] = 3;
		iCountArr[1] = 4;
		iCountArr[2] = 5;
		iCountArr[3] = 4;
		iCountArr[4] = 5;
		iCountArr[5] = 6;
		iCountArr[6] = 7;
		int iStartIndex = 0;
		for (int i = 0; i < iCountArr.length; i++) {
			
			for (int j = iStartIndex; j < (iCountArr[i] + iStartIndex); j++) {
				System.out.print(cInfoArr1[j]);
			}
			System.out.println("\n");
			iStartIndex = iStartIndex + iCountArr[i];
		}
	}

	
	
	
	
	
}
