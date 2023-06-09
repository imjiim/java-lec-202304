package ext;

//예외를 던지는 방식
public class ThrowsTest {

	int divide(int x, int y) { //throws ArithmeticException 을 안해도 위임이 된다 이것이 있는 이유는 추상메서드에서 
		int result = x/y;
		return result;
		
	}
	
	void showDivide(int x, int y) {
		int result = 0;
		try {
			result = this.divide(x,y);	
		}catch(Exception ex) {
			System.out.println("예외발생");
			System.out.println(ex.getMessage());
		}
		
		System.out.println(x+"/" + y + "="+ result);
	}
	
	public static void main(String args[]) {
		ThrowsTest test = new ThrowsTest();
		test.showDivide(10,2);
		test.showDivide(10,0);
		
		Calculator cal = new SamSungCalculator();
		cal.divide(10, 2);
	}
}
