package exam05;

import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		//입력 : 3명분의 이름, 주민번호, 나이, 성별

		Scanner sc = new Scanner(System.in);
		String info = "";
		for (int i=0; i<3; i++) {
			System.out.print("이름 : ");
			 String name = sc.nextLine();
			 System.out.print("나이 : ");
			 String age = sc.nextLine();
			 System.out.print("성별 : ");
			 String gender = sc.nextLine();
			
			 //참조자료형은 내용이같다는 = 사용안쓰고 변수.equals사용함
		
			 info=  info + "," + name + "/" + age + "/" + gender;
		}
		sc.close();
		info=  info.substring(1);
		System.out.println(info);
		
		
		
	}
	
	
	
}
