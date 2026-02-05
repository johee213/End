package exam05;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		//입력 : 이름, 국어, 영어, 수학
		//입력종료 : 이름q
		
		Scanner sc = new Scanner(System.in);
		
		//밖에서 
		String info = "";
		//언제끝날지 몰라서 while
		while(true) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
//			if (name.equals("q")|| name.equals("Q")) {
//				break;
//			}
			//소문자도바꿔라 (대문자Q써도 사용가능하게)
// 			if (name.toLowerCase().equals("q")) {
// 				break;
//			};
			if (name.toUpperCase().equals("Q")) {
				break;
			}
			
			System.out.print("국어 : ");
			String kor = sc.nextLine();
			
			System.out.print("영어 : ");
			String eng = sc.nextLine();
			
			System.out.print("수학 : ");
			String mat = sc.nextLine();
			
			String temp = name + "," + kor + "," + eng + "," + mat;
			//첫번째 이름앞에 / 출력됨
			info= info + "/" + temp;
			
			}
		sc.close();
		
		// 맽앞에 슬러시 빼고 다시 info에 담기
		info=info.substring(1); //info. substring(1, info.length());
		
		System.out.println(info);
		System.out.println("--프로그램종료--");
		}
		
		
		
	}


