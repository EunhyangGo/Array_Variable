package com.biz.arrays;

public class MemberArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberVO[] arrVO = new MemberVO[100];
		for(int i = 0; i < arrVO.length; i++) {
			arrVO[i] = new MemberVO(); //이 코드로 인해 배열로 인한 인덱스 오류는 나지 않게 된다.
		}
	
		for(int i =0; i<arrVO.length;i++) {
			System.out.println(arrVO[i]);
		}
	}
	

}
