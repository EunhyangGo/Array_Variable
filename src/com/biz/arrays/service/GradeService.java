package com.biz.arrays.service;

import com.biz.arrays.vo.GradeVO;

public class GradeService {

	public GradeVO gradeVO;
	
	public GradeService() {
		gradeVO = new GradeVO();
	}
	
	public void makeTotal() {
		// TODO �� ������ ������ �о ������ ��� ���
		
		int intSum = gradeVO.getIntKor();
		intSum += gradeVO.getIntEg();
		intSum += gradeVO.getIntMath();
		intSum += gradeVO.getIntSci();
		
		gradeVO.setIntSum(intSum);
		
		float floatAvg = (float)intSum/4;
		gradeVO.setFloatAvg(floatAvg);
	}
	public void viewGrade() {
		// TODO �� �л��� ������ ���ٿ� ���
		System.out.print(gradeVO.getStrNum()+"\t");
		System.out.print(gradeVO.getIntKor()+"\t");
		System.out.print(gradeVO.getIntEg()+"\t");
		System.out.print(gradeVO.getIntMath()+"\t");
		System.out.print(gradeVO.getIntSci()+"\t");
		System.out.print(gradeVO.getIntSum()+"\t");
		System.out.print(gradeVO.getFloatAvg()+"\n");
	}
	
	public int makeScore() {
		// TODO 50���� 100���� ������ ���� ���� ����
		return (int)(Math.random() *(100-50+1)) + 50;
	}
	public void makeScoreAll() {
		//TODO ��ü����(4����)�� ������ ���Ƿ� ����
		/*
		gradeVO.setIntKor( (int)(Math.random() *(100-50+1)) + 50); 
		gradeVO.setIntEg( (int)(Math.random() *(100-50+1)) + 50); 
		gradeVO.setIntMath( (int)(Math.random() *(100-50+1)) + 50); 
		gradeVO.setIntSci( (int)(Math.random() *(100-50+1)) + 50); 
		*/
		gradeVO.setIntKor(this.makeScore());
		gradeVO.setIntEg(this.makeScore());
		gradeVO.setIntMath(this.makeScore());
		gradeVO.setIntSci(this.makeScore());
		
	}
}
