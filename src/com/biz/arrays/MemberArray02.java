package com.biz.arrays;

public class MemberArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberVO[] arrVO = new MemberVO[5];
		
		arrVO[0] = new MemberVO();
		arrVO[0].strName ="È«±æµ¿";
		arrVO[1] = new MemberVO();
		arrVO[1].strName ="¼ºÃáÇâ";
		arrVO[2] = new MemberVO();
		arrVO[2].strName ="Àåº¸°í";
		arrVO[3] = new MemberVO();
		arrVO[3].strName ="ÀÌ¸ù·æ";
		
		for(int i = 0; i<arrVO.length;i++) {
			System.out.println(arrVO[i].strName);
		}
	}

}
