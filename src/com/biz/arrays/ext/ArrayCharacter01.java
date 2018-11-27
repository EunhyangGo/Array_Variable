package com.biz.arrays.ext;

public class ArrayCharacter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum =(int)(Math.random() * (1000000000 - 10000000 + 1)) + 10000000;
		System.out.println(intNum);
		String strNum = String.valueOf(intNum);//숫자를 문자로 바꾼것임.
		char[] charNum = strNum.toCharArray();
	
		int intSum = 0;
		for(int i = 0; i < charNum.length; i++) {
			System.out.print(charNum[i] + ","); //만들어진 숫자를 한개씩 분해해서 보여주는 것.
			int intN = charNum[i] - '0'; //실제 10진수 숫자로 변환시키는 코드
			intSum += intN;
		}

		System.out.println("합계:" + intSum);
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i + ","); //char빼면 아스키코드의 숫자값이나옴.
		}
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + ",");
		}
		System.out.println();
		for(int i = '0'; i <= '9'; i++) {
			System.out.print((char)i + ",");
	}
		System.out.println();
		for(int i = 1; i <= 256; i++) {
			System.out.print((char)i + ","); //코드와 문자열의 관계
}
	}
}
