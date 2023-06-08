package acc;
import acc.data.Parten

public class AccChlid extends Parten{
	 
	private String publicName;

	public AccChlid() {
		
		this.publicName = "임지영";
		this.defaultName = "임지영";
		this.protetctedName ="임지영";
		this.privateName= "임지영";
		
	}

}
//상속에서의 접근 제한자
//1.public 는 모두상속
//2.private은 모두상속

//if(같은 패키지 == true){
//3. default / protected 상속가능
// } else{ // 다른패키지일때
//3.default 상속불가
//4. protected 상속가능
//}
	