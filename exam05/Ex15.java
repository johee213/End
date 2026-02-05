package exam05;

public class Ex15 {
	public static void main(String[] args) {
		String str = "     Welcome to My Site!!!";
		//주소가 아니고 문자열 찍힘
		System.out.println(str); //Welcome to My Site!!!
		
		//trim 은 글자의 좌우 공백 제거 
	System.out.println(str.trim());
	
	String aaa = "                ";
	System.out.println("[" + aaa + "]" );   //[                ]
	System.out.println("[" + aaa.trim( )+ "]");   //[]
	
	//대문자로 변경
	System.out.println("3." + str.toUpperCase());
	//소문자로 변경
	System.out.println("4." + str.toLowerCase());
	//Site 라는 글자가 들어있냐?
	System.out.println("5." + str.contains("Site")); 
	//해당 인덱스 빼고 삭제
	System.out.println("6." + str.substring(3,5)); //Welcome to My Site!!! 에서 자르고 co 출력 (인덱스0부터시작)
	
	//치환(앞에껄 뒤에글자로 바꿔라)
    System.out.println("8." + str.replace("헤헤", "ㅎㅎ"));
    
    String jumsu= "90,80,70,60,50";
    String kor_=jumsu.substring(0,2);
    int kor= Integer.parseInt(kor_); //인테저.파스인트
    System.out.println("국어:" + kor);
    
    //indexOf = , 인덱스 몇번째에있는데? (여러개 있을경우 첫번째있는경우)
    System.out.println(jumsu.indexOf(","));
    
    String jumsu = "90,80,70,60,50";
    //split = 콤마를 기준으로(공통되는 구분자) 배열을 만들어라?
    String[] jumsus = jumsu.split(","); //{"90","80","70","60","50"}
 
    String kor_=jumsus[0];
    String eng_=jumsus[1];
    String mat_=jumsus[2];
    String sci_=jumsus[3];
    String his_=jumsus[4];
    
    int kor = Integer.parseInt(kor_);
    int eng = Integer.parseInt(eng_);
    int mat = Integer.parseInt(mat_);
    int sci = Integer.parseInt(sci_);
    int his = Integer.parseInt(his_);
    
	}
}
