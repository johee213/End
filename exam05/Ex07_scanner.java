package exam05;

import java.util.Scanner;

public class Ex07_scanner {
	public static void main(String[] args) {
		// 입력 : 국어, 영어, 수학, 과학, 역사
		// 입력 : 국어, 영어, 수학, 과학, 역사, 총점, 평균
		
	   int[] score = new int [5];
		Scanner sc = new Scanner(System.in); 
	   
	     
	   for(int i=0; i<score.length; i++) {
	    	 System.out.println("점수입력 : ");
	    	  String score_ = sc.nextLine(); // sc.nextLine(); 키보드입력한걸 문자열로 받아라 (문자열로 저장)
	    	  int score1 = Integer.parseInt(score_); //정수변환
	    	  score[i] = score1;
	    	  hab= +score[i]
	    			  
	  int total = 0;
	  for (int i=0; i<score.length; i++) {
		  total=total + score[i];
	  }
	  
	  double aver = total / 5.0;
	  System.out.println(total + "/" + aver);
	  }
		
	}
}
	
	
	
