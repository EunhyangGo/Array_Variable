package com.biz.arrays;

public class Scores02 {
	public static void main(String[] args) {
		int[] intKor = {
				88,
				87,
				98,
				78,
				95,
				76
		};
		int[] intEng = {88, 74, 36, 55, 65, 65 };
		
		System.out.println(intKor[0]);
		System.out.println(intKor[2]);
		System.out.println(intKor[1]);
		System.out.println(intKor[4]);
		//intKor �迭�� ����� ���� �����ʹ� ��� 6���̴�.
		// �� �����ʹ� index 0������ index6������ ����Ǿ� �ִ�.
		// �׷��� index 7�� ��ġ�� �����͸� �������� �õ��Ͽ��⶧���� 
		//Array Index out of Bound ����(Exception)�� �߻��ߴ�.
		//System.out.println(intKor[7]);
		
	}

}
