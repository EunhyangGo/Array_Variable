package com.biz.arrays.ext;

public class ArrayString03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arrG = {
				"001:»´±Êµø:90:88:79:64:52",
				"002:¿Ã∏˘∑Ê:90:100:72:63:51",
				"003:º∫√·«‚:90:88:98:65:50",
				"004:¿Â∫∏∞Ì:90:84:76:67:54",
				"005:¿”≤©¡§:90:85:77:69:55",
				
	};
		for(int i =0; i <arrG.length;i++) {
			String[] arrS = arrG[i].split(":");
			
			System.out.print(arrS[0] + "\t");
			System.out.print(arrS[1] + "\t");
			System.out.print(arrS[2] + "\t");
			System.out.print(arrS[3] + "\t");
			System.out.print(arrS[4] + "\t");
			System.out.print(arrS[5] + "\t");
			System.out.print(arrS[6] + "\n");
			
			int intSum = 0;
			for(int j= 2; j<6; j++) {
				intSum += Integer.valueOf(arrS[j]);
			}
				System.out.print(intSum + " \t");
				
				float floatAvg = (float)intSum/4;
				System.out.println(floatAvg);
			
			
		}
	}
}

