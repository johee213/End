package exam04;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		// 구구단 : 3단

				/*
				3*1=3
				3*2=6
				....  		 
				3*9=27
				 */
				//시작할값알고,증가값알고,끝나는거 알때 for로
				//3 은반복, 1은 1씩증가, 결과는 계산으로하면됨		
		
		//직접입력해서 단을 쓸수있게 Scanner
	Scanner sc = new Scanner(System.in);
	System.out.println("단을입력하세요 : ");
	
	String dan_= sc.nextLine();
	//정수로 바꿔주기위한
	int dan = Integer.parseInt(dan_);
	
	for (int i=1; i<10; i++) {
		//문자열 문자든 숫자든 연결하면 = String
	String result = dan +" * " + i + " = "+ (dan * i);
		System.out.println(result);
	}
}
}
/*	홀수만찍기
//for (int=1; i<10; i=i+1) {
//if (i%2==0) {
} else
} String부터 똑같이 */
