package com.biz.arrays.ext;

public class Array02 {
 /*
  * �迭�� ����(����� �ʱ�ȭ�� ���� �ϴ� ��)
  * 1. ������ ���� �����ϴ� ���
  * 2. �����͸� �����ؼ� �����ϴ� ���
  * 3.���� �ϰ� �ٽ� �ʱ�ȭ �ϴ� ���
  * 4. method�� �̿��ؼ� 
  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arrStr1 = new String[10];
		String[] arrStr2 = {"���ѹα�","�츮����"};
		String[] arrStr3 ; // ����
		arrStr3 = new String[3];
		
		String[] arrStr4 ;
		arrStr4 = new String[] {"�츮����","���ѹα�"};
		
		String[] arrStr5;
		arrStr5 = makeStrings();
		
		int[] arrI = makeInteger();
		for(int i = 0; i<arrI.length;i++) {
			
		}
		
	}
	
	public static String[] makeStrings() {
	
		return new String[10];
	}
	public static int[] makeInteger() {
		int[] arrInt = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		return arrInt;
	}
	}
		
