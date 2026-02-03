package exam05;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//정수 5개를 입력받아ㅅㅓ 그 합을 출력
		
		Scanner sc = new Scanner(System.in); 
	   int[] nums = new int[5]; //{ 0,0,0,0,0}
	    
	   
	   //입력받아야지 
	    for(int i=0 ; i<nums.length; i++) {
	    	System.out.println("숫자입력 : ");
	    	  String num_ = sc.nextLine(); 
	    	  int num = Integer.parseInt(num_); //정수로 변환
	    	  nums[i] = num;
	    }
	    
	    //입력받은거 끄집어 내기
	    //합구하기
	    int hab =0; //누적(합) : 누적할 변수 만들기 (반복문 밖에다가 선언해야함. 안에넣으면 합이 초기화가됨)
	    for (int i=0; i<nums.length; i++) {
	    	hab = hab + nums[i]; 
	    }
	 System.out.println("합:" + hab);
	
	}
}
