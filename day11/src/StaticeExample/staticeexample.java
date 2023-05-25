package StaticeExample;

public class StaticeExample {
	
	 public stactic void main (String args[]) {
		 
		 StaticeExample.counter counter = new Counter();
		 //이걸 만나는 순간 JVM의 execute engine이
		 //Heap 영역에 데이터 할달
		 System.out.println(counter.dynamicCounter);
		 counter.dynamicCounter ++;counter.dynamicCounter ++;
		 counter.dynamicCounter ++;
		 counter.dynamicCounter ++;
		 System.out.println(counter.dynamicCounter);
		 //--3을 출력
		 
		 Counter counter2 = new Counter();
		 System.out.println(counter2.dynamicCounter);
		 
		 //static 은 메소드에 할당 (Method Area)
		 Counter.staticCounter ++;
		 Counter.staticCounter ++;
		 
		 
		 
	 } 

}
