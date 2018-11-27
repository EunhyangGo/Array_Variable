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
			System.out.printf("학번\t");
			System.out.printf("국어\t");
			System.out.printf("영어\t");
			System.out.printf("수학\t");
			System.out.printf("과학\t");
			System.out.printf("총점\t");
			System.out.printf("평균\t");
		}
		
}
