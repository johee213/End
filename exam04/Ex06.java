package exam04;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		//입력(Scanner) : 이름, 국어, 영어, 수학 
		//출력			: 이름, 국어, 영어, 수학 총점 평균 등급
		/*
		등급조건 (평균기준) 
		1등급 :  90점이상
		2등급 :  80점이상
		3등급 :  70점이상
		4등급 :  60점이상
		5등급 :  60점미만
	*/
		
		Scanner sc = new Scanner(System.in);
		
		
				
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("국어점수 : ");
				String kor_ = sc.nextLine();
				System.out.print("영어점수 : ");
				String eng_ = sc.nextLine();
				System.out.print("수학점수 : ");
				String mat_ = sc.nextLine();
				
				int kor=Integer.parseInt(kor_);
				int eng=Integer.parseInt(eng_);
				int mat=Integer.parseInt(mat_);
				
				int tot = kor + eng + mat;
				double avg = tot / 3.0;
						
				
				String grade;
				
				if (avg >= 90) {
					grade = "1";
				}else if (avg >= 80) {
					grade = "2";
				}else if (avg >= 70) {
					grade = "3";
				}else if (avg >= 60) {
					grade = "4";
				}else {
					grade = "5";
				}
				System.out.println(grade+"등급입니다.");
	}

}
