package com.biz.arrays.ext;

import com.biz.arrays.service.GradeService;

public class ArrayGrade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GradeService[] arrGS = new GradeService[10];
		for(int i = 0; i <arrGS.length;i++) {
			arrGS[i] = new GradeService(); //->�ʱ�ȭ�ؾߵ�
			arrGS[i].gradeVO.setStrNum(""+i+1);
			arrGS[i].gradeVO.setStrNum(String.valueOf(i+1));
			arrGS[i].makeScoreAll();
			arrGS[i].makeTotal();
			
		}
		makeLine();
		System.out.print("�й�\t");
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.print("���\n");
		
		for(int i =0 ; i<50;i++) {
			
			System.out.print("=");
		}
		System.out.println();
		
		for(int i = 0; i <arrGS.length;i++) {
			arrGS[i].viewGrade();
			/*
			System.out.print(arrGS[i].gradeVO.getStrNum() + "\t");
			System.out.print(arrGS[i].gradeVO.getIntKor() + "\t");
			System.out.print(arrGS[i].gradeVO.getIntEg() + "\t");
			System.out.print(arrGS[i].gradeVO.getIntMath() + "\t");
			System.out.print(arrGS[i].gradeVO.getIntSci() + "\t");
			System.out.print(arrGS[i].gradeVO.getIntSum() + "\t");
			System.out.print(arrGS[i].gradeVO.getFloatAvg() + "\n");
			*/
			
		}
		
		}

	public static void makeLine() {
		for(int i =0 ; i<50;i++) {
			System.out.print("=");
		}
		System.out.println();
	}
}
