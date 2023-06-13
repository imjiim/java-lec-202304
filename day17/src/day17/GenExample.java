package day17;

public class GenExample {
	
	public static void main (String args[]) {
		StudentA<String,Integer> stdA
		=new StudentA<String,Integer>();
		
		stdA.set("name",100);
		//std.set("name","100"); 이러면 오류
		System.out.println(stdA.getKey());
		stdA.isObject(new String("후추"));//Objet 타입으로 쓰는거랑 같다 = isObject(Object t1)
		stdA.<Integer>isObject(1);

	Genesis< ? extends Gen2> genesis = new Genesis <Gen3>();//<Gen1> 은 Gen2 에 상속받은게 아니라서 오류남
	genesis.getObj();
	
	Genesis <? super Gen2> genesis2 = new Genesis <Gen1>();
	genesis2.getObj();
	}

}
//클래스 정의시 Generic 사용
class StudentA <K,V>{
	K key;
	V value;
	
	void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	K getKey() {return this.key;}
	V getValue() {return this.value;}
	
	//메서드에서도 사용가능
	public <T> boolean isObject(T t1) {//T는 타입
		System.out.println(t1.toString());
		return false;
	}
	
	
}



class Gen1{void sayMyName(){}};
class Gen2 extends Gen1{void sayMyName(){}}
class Gen3 extends Gen2{void sayMyName(){}}
class Genesis<T>{
	
	T odj;
	T getObj() {
		return this.getObj();
	}
		
	}
	





