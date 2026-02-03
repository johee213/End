package exam05;

public class Ex10 {
	public static void main(String[] args) {
		
		//2차원배열 - 행과열로 이루어진 배열
		// 대괄호([]) 2개 붙으면 2차원
	/*
				ㅣ행ㅣ  ㅡ ㅡ ㅡ
				ㅣ행ㅣ  열 열 열
				        ㅡ ㅡ ㅡ      */
	//new 가 들어가서 기본{0,0,0} 들어감
		int[][] nums = new int [2][3]; //행2개 열3개 {0,0,0} {0,0,0}
		//0행1열에 50을 넣을경우

	
System.out.println(nums[0][0]);
System.out.println(nums[0][1]);
System.out.println(nums[1][0]);

System.out.println("nums.length:" + nums.length); //행의길이인 2만 나온다.
System.out.println("nums[0].length:" + nums[0].length); //0행의 길이 3이 나온다.


/*              열0 1 2    0 1 2    0 1 2     0  1  2 */
//int[][] nums = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}}; // 2차원 4행3열
/*		        행0        1        2        3        */
	
    nums[0][0]= 10;
    nums[0][1]= 20;
    nums[0][2]= 30;
    nums[1][0]= 40;
    nums[2][1]= 50;
    nums[3][2]= 60;
    
	
	}
}
