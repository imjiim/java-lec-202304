package ext;

import java.util.InputMismatchException;
//import java.lang.*; // System 같은 기본적인 클래스들이 있는 패키지
import java.util.Scanner;


public class InputProgram {
	
	//try ~catch 구문 없이 throw new 를 ㄹ통한 exception 발생시 
	
	void hahaha() throws Exception{
		throw new NotValidNumberException("하하하하");
		/*throw 를통해 exception을 실제로 발생시키는 코드가 있는경우
		이미 발생이되었기 때문에 
		try - cath를 통한 예외처리를 하거나 
		throws 를 통한 위임(남한테 미루기)를 하거나
		둘 중 하나는 반드시 해야함 */
	}

	
	
	//사용자의 입력을 받는다
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in); //사용자의 입력을받는 부분
		
		String name = "";
		int age = 0;
		
		System.out.print("이름을 입력해 주세요: ");
		name = input.next();
		
		//예외가 발생할수있는곳
		try {
			System.out.print("나이를 입력해주세요:");
			age = input.nextInt(); //여기서 Exception을 던지면
			
			if(age > 100) {
				throw new NotValidNumberException("숫자는 100이하여야 합니다");
			}
			
		} catch(InputMismatchException ex) {//여기서 Catch하겠다
			System.out.println("나이는 숫자만 입력 받을 수 있습니다"); 
		/*finally { try catch 구문이실행시 무조건 한번 실행
		 * 심지어 ,Exception이 발생하지않더라도
		 * System.out.print("finally 구문실행");
		 * }	
		 */
			
		} catch(Exception ex) {//이게 있어야 throw new NotValidNumberException("숫자는 100이하여야 합니다"); 이거를 잡을 수있음
			
		}
		System.out.print("저는" + name+ "이고요,나이는"+age+ "입니다");
	}
}
