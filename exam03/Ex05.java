package exam03;

public class Ex05 {

	public static void main(String[] args) {
		
		//삼항연산자 ( 자료형 변수 = (조건) ? 참 일때 : 거짓 일때 값; )

		//		if(조건) {
//			       조건만족하면 여기꺼 실행하고나가}
//		    else {
//			       아니면 여기꺼 성립하면 여기꺼 실행하고 종료}

		int k = 5;
		 int a = (k >3) ? 100 : 200;
//		 k>3) 경우 k가 5, 참이니까 100을 a에 넣어\		 
		 
		 int value3 = 3;
		 System.out.println( ( value3 % 2 == 0 ) ? "짝수" : "홀수");
	}

}
