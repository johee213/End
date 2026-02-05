package exam05;

public class Ex14 {
	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2= str1;
		// 기존에 있던 java및 그주소는 없어지고 새로운 주소를 가진 Python을 만들어진다.
		
		str1 = "Python";
		
		//String 은 주소가 찍히는게 아니고 문자열을 그대로 갖고옴
		System.out.println(str1); // "Python"
		System.out.println(str2); // "java"
		
//		String안에 "Java"를 만들어서 그주소를 str5에 넣어라
		String str5 = new String("Java");
		
		
		
	}
		
}
