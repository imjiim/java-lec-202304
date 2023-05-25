package day10;


import day10.pet.Dog;
import day10.pet.*;// day10 밑에 pet 폴더 안에 있는" 모든 클래스" 를 열어라

import day10.pet.Cat;
//day10밑에 pet 폴더 안에 있는 Cat 클래스만 사용할거야 

//패키지명 규칙 korea.co.kr
//kr.co.korea.petshop.pet
//kr.co.korea.petshop.pet.config
public class PackageExample {
	
	
	public static void main (String args[]) {
		day10.pet.Dog dog1= new day10.pet.Dog();
		dog1.SayMyName();
		
		Cat cat1 = new Cat();
		
		day10.pet2.Dog dog2 =new day10.pet2.Dog();
		dog2.SayMyName();
	
		
	}

}
