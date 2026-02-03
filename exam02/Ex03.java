package exam02;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//타입변환(형변환) : 강제형변환 (casting)
		//실수3.54 더을타입을 인트타입에 넣을려니까 안들어가
		//값을 강제로 바꿔 
		int v1 =(int) 3.54; //강제형변환 = casting
		System.out.println(v1);
		
		long v2 = 30;//자동형변환 = promotion
		System.out.println(v2);

	}

}
