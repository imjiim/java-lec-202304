package day17;

 import java.util.*;
public class GernericExample {
	
	public static void main (String args[]) {
		
		// List list = new ArrayList(); Object 타입을 받으므로 예외의 가능성 존재
		List <Integer>list = new ArrayList<Integer>();
		//Integer 객체만 받는 list 로 선언
		
		//list.add("1"); // String 에러
		//list.add("a"); String 에러
		
		list.add(1);
		list.add(20);
		
		for (Integer o :list) {
			System.out.print(o);
			
			
		}
		
		Map<String,Integer> pointMap = new HashMap<String,Integer>();
		pointMap.put("name",1);
		
		List<Map<String,Integer>>dataList
		=new ArrayList<Map<String,Integer>>();
		
	}
	
	

}
