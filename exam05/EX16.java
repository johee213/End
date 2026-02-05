package exam05;

public class EX16 {
	public static void main(String[] args) {
		//문자열에 사용하는 메소드
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		
		int str1Length = str1.length();
		int str2Length= str2.length();
		System.out.println(str1.length()); // 11    String 는()써야함
		System.out.println(str2.length()); // 13
	
		//charAt 에서 char 사용해서 char 사용해야함
		char aaa = str1.charAt(1);`	
		//1번인덱스에 있는 글자 1자 갖고와
	System.out.println(str1.charAt(1));   //e
	
	System.out.println(str1.indexOf('a'));  //7
	System.out.println(str1.lastIndexOf('a'));   //9
	//문자열이라서 큰따옴표씀
	System.out.println(str1.indexOf("Java"));	   //6
	
	if (str2.indexOf("고맙습니다.") !=-1) {
		 System.out.println("있음");
	} else {
		System.out.println("없음");
	}
	}
}