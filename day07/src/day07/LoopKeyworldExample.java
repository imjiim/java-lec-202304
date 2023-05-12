package day07;
//loop문 (반복문)에서 사용되는 키워드
//2개 break,continue

public class LoopKeyworldExample {

	public static void main (String[] args) {

		//break
		//1부터 100까지 합이 400을 넘으면 출력하지 않도록 
		//하는 프로그램을 만드세요 
        int sum = 0;
        for(int i  =1; i<= 100; i++) {
         	sum +=i; //sum = sum+ i;
         	if(sum >= 400) {
         		break; // 탈출
         	}
        }
        
        System.out.println("총합:" + sum);
        
        
        // continue;
        //반복문에만 존재
        // ex) 짝수만 출력하고 싶을때(범위는 1-100)
        
        for(int x = 1; x <= 100; x++) {
        	
        	if(x % 2!= 0) {
        		continue;//for문 사이에 있으면 무시하고 위로 올라감(조건식으로)        		
        	}
        	System.out.println(x);
        	
        }//위를 while 문의로 변경했을때
        int x =1;
        
        while(x <= 100) {
        	
        	x++;
        	if (x % 3 != 0) {
        		continue;
        	}
        	System.out.println(x);
        	
        }
        
	}
}

/* (흐름에 대한)제어문(조건문/반복문)
 * 
 * 1. 조건문은 위에서 아래로 해석하는것은 똑같다, 양갈래길에서 어디로 갈것인지 정하는 문장
 * a) if, if else, if~else if~else
 * if (조건비교), 조건 비교의 결과값은 참/거짓
 * else if(조건비교)
 * 
 * b) switch~ case(break;)
 * switch (변수/상수)
 * case 값:(변수/상수==값)
 * 실행문 break;
 * default: 실행문
 * 
 * 2. 반복문  while, do~while, for
 * 
 *a) while(조건비교식)
 *c) do~ while (조건비교식);
 *c) for (초기화;조건비교;증감)
 * *) break; countinue;
 *  a) braek; 를 만나면 반복문 탈출
 *  b) countinue 를 만난순간부터 상위로 이동 (for,while...)
 *  
 *  for (int x = 2;x <=9;x++){
 *  for (int y= 1;y <=9; y++{
 *   if(y == 3) break;
 *   }// break룰 만나면 여기로 온다 
 *  } 이 경우 가장 가까운 포문으로 탈출한다 혹은 컨티뉴함
 */


