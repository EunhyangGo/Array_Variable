package com.biz.arrays.ext;

public class ArrayString04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strKorea = "대한민국우리나라만세";
		String[] arrKorea = strKorea.split(""); //따옴표두개 아무것도 아닌 값. 이렇게 자르면 글자별로 잘라짐
		for(int i = 0; i < arrKorea.length; i++) {
			System.out.println(arrKorea[i]);
		}

		String strNum = "1234594059405940";
		String[] arrNum = strNum.split("");
		
		int intSum = 0 ;
		for(int i = 0; i< arrNum.length;i++) {
			intSum += Integer.valueOf(arrNum[i]);
			//stringnum을 낱개로 분해해서 합을 구하라는 말.
			System.out.println(intSum);
		}
	}

}
