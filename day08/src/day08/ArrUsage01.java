package day08;

public class ArrUsage01 {

	public static void main(String[] args ) {
		
		String[] arrString = {"임지영","강서구","집에갈래요"};
				for(int x = 0; x< arrString. length; x++) {
					System.out.println(x+ " : " + arrString[x]);
					
				}
			//--String[] args 가지고 놀기
			System.out.println
			("프로그램 시작 변수의 수 :" +args.length);
       for(int x = 0; x < args.length; x++) {
    	   System.out.println(x+ ":" + args[x]);
       }
       
       //--javac xxxx.java <--컴파일
       //-->xxx.class
       //--javac xxxx <---실행
       //--java xxxx 매개변수1 매개변수2 매개변수3
       
       
	} 
}
