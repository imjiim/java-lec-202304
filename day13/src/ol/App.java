package ol;

public class App {
	public static void main(String args[]) {
		공군 airforce = new 공군();
		airforce.복무기간출력();
		airforce.일하다();
		airforce.일하다("격납고에서 ");//오버로딩
		
		육군 army = new 육군();//육군은 현재상속만 받은 상태
		army.복무기간출력();//오버 라이딩 없이 부모객체의 복무기간이 출력
		
	
	} 

}
