import java.util.*;
public class SimpleProgram {

	public static void main (String[] args) {
		
		int command = 0;
		
		do {
			
			System.out.println("명령어를 코드를 입력해 주세요. (종료 5):");
			Scanner scan = new Scanner (System.in);
			command = scan.nextInt();
			System.out.println("입력된 명령어는"+ command + "입니다.");
			
		} while (command !=5);
		
		System.out.println("프로그램 종료");
		
		}
}


