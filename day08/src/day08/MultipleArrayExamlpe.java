package day08;

public class MultipleArrayExamlpe {

	public static void main(String[] args) {
		//1. 1차원배열 선언
		//1-1 선언
		int[] a;
		//2.선언과 (빈) 방만들기
		int [] a1 =new int [3]; //-- 방 3개짜리 1층 건물을 만드세여 
		//1-3. 선언과 동시에 방 갯수 + 값까지 채우기
		int [] a2 = {1,2,3};
		//1-4. for문 으로 전체 출력
		for(int x = 0; x < a2.length; x++) {
			System.out.println(a2[x]);
		}
		
		
		//2. 2차원 배열
		//2-1. 선언
		int [][] b; //층 /방
		//2-1. 선언과 (빈)방만들기 방3개짜리 2층집 만들기
		int[][] b1 = new int[2][3];
		//2-3. 선언과 동시에 방 갯수 +값까지 채우기
		int[][] b2 = {
				{1,2,3},
				{3,4,5,}// 한층에 방 3개
				};
		//2-4. for 문으로 전체 출력
		System.out.println("2 차원 배열 출력");
		for(int y = 0; y< b2.length ; y++) {// 층으로 접슨
			for(int x= 0; x < b2[y].length; x ++) {//방으로 접근
				System.out.println(b2[y][x]);
				
			}
		}
		
				
	}
}
