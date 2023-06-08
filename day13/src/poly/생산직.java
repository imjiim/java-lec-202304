package poly;

public class 생산직 extends 사람 {
	
	String part; // 생산직 파트
	
	생산직(String name,String part){
		this.name = name;
		this.part = part;
		
	}
	
	@Override
	
	public void 일하다() {
		System.out.println(name + "님은" + part + "실행");
		
		
	} 
	
	

}
