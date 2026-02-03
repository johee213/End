package exam02;

public class Ex01 {
	public static void main(String[] args) {
// 자료형 정수 = 값;
		//-----------
		//변수(그릇이름=num)선언 및 초기화가 같이 이루어졋다
		//5라는 정수를 num에 담아라 byte란 자료만 닮을수있다.
		//선언(byte num)(선언은한번만) 및 초기화(값을 찍는다)(num = 5)
		byte num = 5;
       //(=(1개)는 오른쪽에있는 값을 왼쪽에 담아라)
	   System.out.println(num);
	   // 위에서 byte num 이라고 선언해서 다음부터는 num만 사용
	   num = 10;
	   System.out.println(num);
	   num = 127;
	   System.out.println(num);	
	
	   byte num2;
	   num2 = 20;
	   System.out.println(num2);

	   short s1 = 30;
	   System.out.println(s1);
	   s1 = 1000;
	   System.out.println(s1);
	   
	   int i1 = 50000;
	   System.out.println(i1);
	   
	   
	}
}
