package com.biz.arrays.ext;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNum = new int[10];
		//������ �迭�� �迭�� �����ϸ� ��� ����� ������ 0���� �ڵ� �ʱ�ȭ �ȴ�.
		for(int i = 0 ; i < arrNum.length;i++) {
			System.out.println(arrNum[i]);
		}
		String s1 = "Republic of Korea";
		System.out.println(s1.length());
		//���ڿ��� �迭�� �迭�� �����ϸ� ��� ����� ������ ""���� �ʱ�ȭ �ȴ�.
		//��, sysout..�� ����ؼ� console�� ���̸� null ������ ǥ���Ǵµ�
		//���� null���ϰ�� �ټ� ���̰� �ִ�.
		
		//���ڿ� �迭 ��Ҹ� �̿��ؼ� ���ڿ� ������ Ȯ���ɵ�(.length())�� ����Ϸ��� �ϸ�
		//����� �� ����.
		
		//���� ���ڿ� �迭���� ������ ��Ҵ� � ��(���ڿ�)�� �����ϱ� ������
		//�б� ����� �����ϸ� NullPointException�� �߻��� �Ѵ�.
		String[] arrString = new String[10];
		for(int i = 0 ; i< arrString.length; i++) {
			System.out.println(arrString[i].length());
		}
	
		
	}
	

}
