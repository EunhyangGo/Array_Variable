package com.biz.arrays.ext;

public class ArrayCharacter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum =(int)(Math.random() * (1000000000 - 10000000 + 1)) + 10000000;
		System.out.println(intNum);
		String strNum = String.valueOf(intNum);//���ڸ� ���ڷ� �ٲ۰���.
		char[] charNum = strNum.toCharArray();
	
		int intSum = 0;
		for(int i = 0; i < charNum.length; i++) {
			System.out.print(charNum[i] + ","); //������� ���ڸ� �Ѱ��� �����ؼ� �����ִ� ��.
			int intN = charNum[i] - '0'; //���� 10���� ���ڷ� ��ȯ��Ű�� �ڵ�
			intSum += intN;
		}

		System.out.println("�հ�:" + intSum);
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i + ","); //char���� �ƽ�Ű�ڵ��� ���ڰ��̳���.
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
			System.out.print((char)i + ","); //�ڵ�� ���ڿ��� ����
}
	}
}
