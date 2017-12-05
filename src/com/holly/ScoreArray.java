package com.holly;

public class ScoreArray {

	public static void main(String[] args) {
		int scores [][] = new int [5][3];
		scores[0][0] = 77;
		scores[0][1] = 55;
		scores[0][2] = 66;
		scores[1][0] = 11;
		scores[1][1] = 77;
		scores[1][2] = 22;
		scores[2][0] = 66;
		scores[2][1] = 77;
		scores[2][2] = 88;
		scores[3][0] = 55;
		scores[3][1] = 33;
		scores[3][2] = 77;
		scores[4][0] = 66;
		scores[4][1] = 77;
		scores[4][2] = 55;
		
		for(int i=0; i<5; i++){
			System.out.println(scores[i][0]+"\t"+ scores[i][1]+"\t" +scores[i][2]+
					"\t");
			
		}
	}

}
