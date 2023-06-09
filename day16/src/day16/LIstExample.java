package day16;

import java.util.*;

public class LIstExample {
	public static void main (String args[]) {
		
		int[]a = new int[5];
		a[0 ] =10;
		a[1] =20;
		
		List list = new ArrayList(); //new List(); //List는 인터페이스이기 때문
		//Set list =new HashSet();
		//Set/List 건 가변배열이기 때문에 일부만 다르고 기본적인 작업은 모두 동일하다 
		
		//집어 넣기
		list.add(10);
		list.add(20);
		// list.add(new String("임지영"));
		list.add(1);
		list.add(3);
		list.add(2);
		
		System.out.println(list);
		//=System.out.println(list.toString());
		
		//list 크기 구하기
		System.out.println("list.size()="+list.size());
		
		//list에서 값 꺼내기
		System.out.println("list[0] = "+ list.get(0));
		
		//배열처럼 값 전체 꺼내기
		for (int i = 0; i <list.size();i++) {
			System.out.println("list["+i+"] = " +list.get(i));
		}
		
		System.out.println("=======================");
		
		//2.향상된 For문
		for( Object o : list) {
			System.out.println(o);
		}
		
		//Set
		Set hashSet = new HashSet();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(2);
		
		System.out.println("--------------------");
		System.out.println(list);
		System.out.println(hashSet);
		
		
		
		
	}

}
