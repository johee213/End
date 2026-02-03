package exam04;
// import (다른대에 있는거 갖고오는거)
//(.= ~안에)  java 안에 util 안에 Scanner있다
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//입력 : Scanner 크래스를 이용. (첫글자 대문자로 클래스인거 유추)
	   //키보드로 콘솔에 입력하기위해 Scanner 사용
		Scanner sc = new Scanner(System.in);
		
		//nextline = 엔터키 치기전까지를 왼쪽변수인 name에 담아라
        // String name = sc.nextLine(); //엔터키 치기전까지 콘솔창에 입력한것만 인식 
		                             //String 랑 nextLine=문자열로인식
        //String name = sc.next();  //스페이스바 공백전까지 콘솔창에 입력한것만 인식)

		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine(); //문자열
		
		System.out.print("국어점수를 입력하세요 : ");
		String kor_ = sc.nextLine();
		System.out.print("영어점수를 입력하세요 : ");
		String eng_ = sc.nextLine();
		System.out.print("수학점수를 입력하세요 : ");
		String mat_ = sc.nextLine();
		sc.close();
		
		//Integer = 괄호안에있는 값을 정수로 바꿔라
		int kor = Integer.parseInt(kor_);
		int eng = Integer.parseInt(eng_);
		int mat = Integer.parseInt(mat_);
		
		int tot = kor+eng+mat;
		double avg= tot / 3.0;  //double avg = (double)tot/3; 가능
		
		if (avg >= 60 ) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		};
		
		System.out.println("-- 프로그램 종료 --");
	
		
		//입력 -> 처리 -> 출력
		
		System.out.println(name + " = "+ kor + " / " + eng + " / " + mat);
		}
};
	//평균내는 다른 방법 (***이해***)
//	int tot = 0; //0
//	tot += kor; //tot = tot + kor; //90
//	tot += eng; //tot = tot + eng; // 90 + 80 =170
//	tot += mat; //tot = tot + mat; // 170 + 70 = 240
	

    //(***중요****)문자열에 모든 자료형을 더하면 문자열 결합(나열)이 된다.
	String message = "";
	Message += name; //message = message + "name"
	message += "님의 평균은 "; //message = "홍길동님의 평균은"
	message += avg + "점 입니다."; // message = message + avg + "점입입니다." (message= 홍길동님의 평균은 80.0점 입니다.

	

