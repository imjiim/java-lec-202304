package day07;

public class ArrayExample {

	public static void main (String args[]) {
		
		//1.선언과 공간 할당하는법
		
		//-선언과 공간할당을 따로따로
		//--배열을 선언
		int odd [];
		//-초기화 발법
		odd = new int [4];// [방의 개수]
		
		//--선언과 동시에 공간할당을 만들어 주는 방법
		int odd2[] = new int[4];
		
		//2. 각 방에 값을 넣어주는것
		odd2[0] = 1;
		odd2[1] = 3;
		odd2[2] = 5;
		odd2[3] = 7;
		
		//3.선언과 동시에 방을 생성하면서 값을 넣어주는 방법
		int odd3[] = {1,3,5,7};
		for(int i= 0; i < odd3.length; i++ ) {
			System.out.println(odd2[i]);
		}
		
		//!) 10개짜리 방을만들고 이 안에 홀수를 다 채우고 싶다
		int[] odd4 =new int [10];
		int idx = 0; // 배열의 호수
		for(int x = 1; x <= 100; x++) {
		 
			if(idx > 9) {
				break;
			} 
			if(x %2== 0) {
				continue;
			}
		  System.out.println
		  ("배열의 idx(호실):" + idx+"들어간값:" +x);
		  odd4 [idx++] = x ;
			
		}
		
		
	}
}
