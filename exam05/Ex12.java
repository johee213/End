package exam05;

public class Ex12 {
	public static void main(String[] args) {
		
		int [][]arr = {
				{10,20,30}, //0행
				{40,50,60}  //1행
		};
		
		// 행1번 돌고 열은3번도는 규칙 찾음
		System.out.println(arr[0]); // 0행 주소나옴
		System.out.println(arr[0][0]); // 10나옴
		
		System.out.println("배열의 길이(행의길이) : " + arr.length); //2
		System.out.println("배열의 0번째 인덱스의 길이(열의길이) : " + arr[0].length); //3
		
		 
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
			
			System.out.println("nums[" + i + "] [" + j + "] :" + arr[i][j]);
		}
	}
}
