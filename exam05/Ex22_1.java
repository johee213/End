package exam05;

import java.util.Scanner;

public class Ex22_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String msg = "";
		
		for(int i=0; i<3; i++) {
		System.out.print("메모: ");
		String memo = sc.nextLine();
		
		
		if (mag.equals("")) {
			msg =memo;
		} else {
			msg = msg + ","+memo; //
		}
		
		}
		
		sc.close();
		
//		맨앞에 , 뒤에만 살리기
//		msg = msg.substring(1, msg.length()); 
		System.out.println("msg: " +msg);
	}

}
