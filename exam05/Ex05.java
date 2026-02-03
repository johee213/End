package exam05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
	
	//입력 : 5명의 친구 이름
    //출력 : 5명의 친구 이름
	
	  Scanner sc = new Scanner(System.in); 
      String[] names = new String [5];
    
      // 인덱스에 이름 입력하는거
      for (int i=0; i<=5; i++) {
    	  System.out.println("이름을 입력하세요: ");
    	  String name = sc.nextLine();
    	  names[i] = name;
 //{"홍길동", "이성순", "장천용", "김춘삼", "정원겸"}
      }
      
      sc.close();
      System.out.println(names); //주소
      System.out.println(names.length); // 배열의 크기(길이)      
	  System.out.println(Arrays.toString(names)); //배열안에 뭐있나 확인가능
	  System.out.println(names[0]); //0번째 인덱스에 있는거 갖고와
	
	  //배열 뭐뭐있나 출력해보는거
	  for (int i=0, i<names.length; i++) {
		  System.out.println(names[i]);
	  }
	
	}	
	
}
