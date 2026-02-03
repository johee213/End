package exam04;

public class Ex05 {

	public static void main(String[] args) {
		
		int kor_ = 93;
		int eng_ = 82;
		int mat_ = 70;
		
		int kor = Integer.parseInt(kor_);
		int eng = Integer.parseInt(eng_);
		int mat = Integer.parseInt(mat_);
		
		int tot = kor+eng+mat;
				double avg= tot / 3.0; 
		
		if (avg >= 60 ) 
			System.out.println("합격");
		 else 
			System.out.println("불합격");
		
		
		System.out.println("-- 프로그램 종료 --");
	}

}
