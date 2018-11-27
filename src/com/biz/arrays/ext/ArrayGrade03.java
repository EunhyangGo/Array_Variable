package com.biz.arrays.ext;

import com.biz.arrays.service.GradeService;

public class ArrayGrade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeService[] gs = new GradeService[10];
		makeDLine();
		makeTitle();
		makeSLine();
		
		for(int i =0; i <gs.length;i++) {
			
			gs[i] = new GradeService();
			gs[i].gradeVO.setStrNum(""+(i+1));
			gs[i].makeScoreAll();
			gs[i].makeTotal();
			gs[i].viewGrade();
		}
		makeDLine();
		
	}
		public static void makeDLine() {
			for(int i = 0; i < 55; i++) {
				System.out.print("=");
			}
			System.out.println();
	}
	
	public static void makeSLine() {
		for(int i = 0; i < 55; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static void makeTitle() {
			System.out.printf("�й�\t");
			System.out.printf("����\t");
			System.out.printf("����\t");
			System.out.printf("����\t");
			System.out.printf("����\t");
			System.out.printf("����\t");
			System.out.printf("���\t");
		}
		
}
