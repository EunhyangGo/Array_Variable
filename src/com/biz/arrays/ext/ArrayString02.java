package com.biz.arrays.ext;

public class ArrayString02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭�ϰ� ���ڿ��� ���迡�� ���ڿ��� �迭�� �ٲٴ� ��� ���׿� ���� ���캸��
		String strNation = "Rebulic of Korea";
		String[] arrWord = strNation.split(" ");
		for(int i = 0; i < arrWord.length ; i++) {
			System.out.println(arrWord[i]);
		}

		strNation = "�� �� �� �� ����";
		arrWord = strNation.split(" ");
		System.out.println(arrWord.length);
		for(int i = 0; i < arrWord.length; i++) {
			System.out.println(arrWord[i]);
		}
		
		String strGrade = "001: ȫ�浿: 98:88:87:67";
		String[] arrGrade = strGrade.split(":");
		
		System.out.println("�й�:" + arrGrade[0]);
		System.out.println("�й�:" + arrGrade[1]);
		System.out.println("����:" + arrGrade[2]);
		System.out.println("����:" + arrGrade[3]);
		System.out.println("����:" + arrGrade[4]);
		System.out.println("����:" + arrGrade[5]);
		
		int intKor = Integer.valueOf(arrGrade[2]);
		int intEng= Integer.valueOf(arrGrade[3]);
		int intMath= Integer.valueOf(arrGrade[4]);
		int intSci= Integer.valueOf(arrGrade[5]);
		
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		intSum += intSci;
		
		intSum = 0;
		for(int i = 2 ; i<6;i++) {
			intSum += Integer.valueOf(arrGrade[i]);
		}
		
		
	}
	

}
