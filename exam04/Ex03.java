package exam04;

public class Ex03 {
	public static void main(String[] args) {

		//국영수 평균을 구해서 60이상이면 합격, 이하면 불합격
		String name = "홍길동";
		int kor = 93;
		int eng = 82;
		int mat = 70;
//	3개다 같은 int라 int로나옴
		int tot = kor + eng + mat;
//		double avg = tot / 3
//		double tot자료형 인트 3인트, 인트 인트 실행은 인트로됨
//		소수점 나올라면 더블이 되야함(결과가 int면 소수점날라감)
//		큰자료형따라가서 둘중하나 실수(double)로 바꾸면 실수가 큰자료형이 되서 double로 바뀜
		double avg = tot / 3.0; //double 평균 = (double) tot / 3; 가능 
		//평균이 60이상이면 합격, 아니면 불합격
		if(avg >= 60) {
			System.out.println(name+"님 합격" + "("+ avg+ "점" +")");
		} else {
			System.out.println("불합격");
		}
	}
}
