package com.biz.arrays.ext;

public class ArrayString04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strKorea = "���ѹα��츮���󸸼�";
		String[] arrKorea = strKorea.split(""); //����ǥ�ΰ� �ƹ��͵� �ƴ� ��. �̷��� �ڸ��� ���ں��� �߶���
		for(int i = 0; i < arrKorea.length; i++) {
			System.out.println(arrKorea[i]);
		}

		String strNum = "1234594059405940";
		String[] arrNum = strNum.split("");
		
		int intSum = 0 ;
		for(int i = 0; i< arrNum.length;i++) {
			intSum += Integer.valueOf(arrNum[i]);
			//stringnum�� ������ �����ؼ� ���� ���϶�� ��.
			System.out.println(intSum);
		}
	}

}
