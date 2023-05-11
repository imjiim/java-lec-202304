import java.util.Scanner;

public class WhileExample {
	public static void main (String[] args) {
	
		System.out.println("숫자를 1에서부터 몇까지 출력할까여?:");
	    Scanner sc= new Scanner(System.in);
		int maxNum = sc.nextInt();
		int startNum= 1;
		
		//--while(조건식) 에서 조건식이 true일때(까지 -false)
		//--{} 내 실행문을 반복 실행시킨다

		while(maxNum >= startNum) {// 조건부터 true 인지 검증한다
			System.out.println((startNum ++ ) + "|t");
		}
		
		//--do while 
		startNum = 1;
		
		do {
			System.out.println("최소한번은 실행합니다");
			System.out.println((startNum ++ ) + "\t");
    } while(maxNum >= startNum);
  }
}