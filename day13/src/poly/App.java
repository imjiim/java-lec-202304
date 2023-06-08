package poly;

public class App {
	public static void main (String args[]) {
		
		//1.공장 을 만들다 
		Factory f = new Factory ();
		
		//. 채용을함
		f.채용(new 생산직("임지영"," 설계"));
		f.채용(new 생산직("김상오"," 조립"));
		f.채용(new 생산직("임후추"," QC"));
		f.채용(new 생산직("임반달"," 상품화"));
		
		
	//3 일을시키자
		f.생산하다();
		
	}

}
