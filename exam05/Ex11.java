package exam05;

public class Ex11 {
	public static void main(String[] args) {
		//2차원배열([][]) = 표( 행(가로)열(세로)), 0부터시작한다(인덱스개념) 배열안에 배열이 들어간거
		
		int[][] score = new int[3][4]; // {0,0,0,0},{0,0,0,0},{0,0,0,0}
		
		System.out.println("배열의길이 : " + score.length); //3 (행의수)
		
		//행돌리는거, 행3개 주소3개나옴 
		for (int i=0; i<score.length;i++) {
			System.out.println(score[i][0] + "/" + score[i][1] + "/" +score[i][2] + "/" +score[i][3] + "/");
			for( int j=0; j<score[i].length; j++) {
				System.out.println(i + ","  +j+ " => "+ score[i][j]);
			}
		}
		
		
	}
}
