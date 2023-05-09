package day03;

public class CharExample {

	public static void main(String args[]) {
		
		char alpha =97;
		byte x =127;
		
		float f =1.0f;//실수의 기본은 더블이라 1.0;은 에러
		
		
		//10; //--정수의 기본 값은 int
		//1.0; //-- 실수의 기본형은 double 
		System.out.println(alpha);
		
		char alpha2 =65;
		int ascii = 0;
		//아직 안배운거
		for(int i= 0;i < 26; i++) {
			alpha2 = (char)(alpha2+i);
			ascii = alpha2;
			System.out.println("문자:" +alpha2+ "는 ASCII CODE"
					+ ascii +"입니다 "
					);
		}
	}
}
