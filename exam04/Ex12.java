package exam04;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
//입력 : 숫자 1개를 입력받아서(스캐너사용) 숫자10개를찍는 프로그램.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		
		 //문자로받아라
		String num_ = sc.nextLine();
		sc.close ();
		
		//정수로바꾸기
		int num = Integer.parseInt(num_);
		for (int i=num; i<(num+10); i++) {
		System.out.println(i);
	}
}
}