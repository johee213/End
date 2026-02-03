package exam01;

public class Test03 {
	public static void main(String[] args) {
		System.out.println("안녕하세용");
		System.out.println("안녕" + "하세용");
		System.out.println("오늘은" + "춥네용"); //문자열 더하기 문자열  =문자열 결합(나열)
	
	//글자 -> 문자열(큰따옴표로 둘려쌓여 있으면)
	//출력문 : System.out.print("");,system.out.printf("");
	//서식이 없는 출력문 : System.out.print("");
	//서식이 있는 출력문(f사용) : Syttem.out.ptintf(""); (서식=%s,  %d, %f)
	
	//안녕하세요 홍길동님의 나이는 19세 입니다.
	//안녕하세요 이성순님의 나이는 21세 입니다.
	//안녕하세요 장천용님의 나이는 23세 입니다.
	
	System.out.println("안녕하세요 홍길동님의 나이는 19세 입니다.");
	System.out.println("안녕하세요 이성순님의 나이는 21세 입니다.");
	System.out.println("안녕하세요 장천용님의 나이는 23세 입니다.");
	System.out.println("----------------");
	//문자는 글자한자리 문자열은 ""(큰따옴표로 둘러쌓여있다)
	System.out.printf("안녕하세요 %s님의 나이는 %s세 입니다.\n", "홍길동", "19");
	System.out.printf("안녕하세요 %s님의 나이는 %s세 입니다.\n", "이성순", "21");
	
	System.out.printf("안녕하세요 %s님의 나이는 %d세, 신장은%f 입니다.\n", "장천용", 23, 189.5);

	 //소스파일 --> 저장할때 (컴파일 일어남)(컴파일= --> 바이트 코드(.class)가 만들어짐
			//	인터프리터 : 통역 (한마디하고 번역해주고 한마디하고 번역해주고)
	    	//	컴파일 : 번역 (통으로 한방에 실행) <-- 기계어로 번역
	}
	}