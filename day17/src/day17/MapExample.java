package day17;

import java.util.*;
public class MapExample {
	
	public static void main (String args[]) {
		
		Map map = new HashMap();
		map.put("key","value");
		map.put("name","임지영");
		map.put("age",new Integer(44));
		map.put("char","1" );
		
		System.out.println(map.get("name"));
		
		System.out.println(map.containsKey("name"));
		System.out.println(map.containsKey("name2"));
		
		//모든 키를 꺼내 보자 
		Set mapKeys = map.keySet();
		
		for (Object o : mapKeys) {
			System.out.println(o+"="+ map.get(o));
		}
	
		List<Map> dataList = new ArrayList<Map>();
		
		Map row1 = new HashMap();
		row1.put("name", "임");
		row1.put("age", "29");
		row1.put("grade", "1");
		
		Map row2 = new HashMap();
		row2.put("name", "김");
		row2.put("age", "35");
		row2.put("grade", "2");
		
		dataList.add(row1);
		dataList.add(row2);
		
		for(int i= 0; i< dataList.size();i++) {
			//리스트 꺼내기
			System.out.println("이름\t 나이\t 학년");
			for (Object val :dataList) {//리스트 꺼내기
				//Map 꺼내기
				Map tmp = (Map)val;
				System.out.print(tmp.get("name")+"\t");
				System.out.print(tmp.get("age")+"\t");
				System.out.print(tmp.get("grade")+"\t\n");
				System.out.print("\n");
			}

		}
	
	}

}
