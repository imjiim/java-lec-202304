package StaticeExample;

public class WebApp {
	
	 public static void main (String args[]) {
		 
		 StaticExample.counter Counter = new counter();
		 //이걸 만나는 순간 JVM의 execute engine이
		 //Heap 영역에 데이터 할당
		 Counter.plusDynamicCounter();
		 Counter.plusDynamicCounter();
		 Counter.plusDynamicCounter();
		 System.out.println(Counter.dynamicCounter);
		 
		 
		 System.out.println(Counter.dynamicCounter);
		 Counter.dynamicCounter ++;Counter.dynamicCounter ++;
		 Counter.dynamicCounter ++;
		 Counter.dynamicCounter ++;
		 System.out.println(Counter.dynamicCounter);
		 //--3을 출력
		 
		 counter counter2 = new counter();
		 System.out.println(counter2.dynamicCounter);
		 
		 //static 은 메소드에 할당 (Method Area)
		Counter.plusDynamicCounter();
		Counter.plusDynamicCounter();
		Counter.plusDynamicCounter();
		System.out.println(counter.staticCounter);
	 }
}
