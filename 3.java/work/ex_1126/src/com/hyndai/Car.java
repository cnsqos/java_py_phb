package com.hyndai;

//import 패키지명.클래스명; -> 특정클래스만 import
//import 패키지명.*; -> 패키지내의 모든클래스를 import
import com.hankook.SnowTire;
import com.kumho.*;

public class Car {

	//Tire tire = new Tire();
	
	//클래스 전체 이름을 사용해서 정확히 어떤 패키지의 클래스를
	//사용하는지 알려줘야 한다.
	com.hankook.Tire tire = new com.hankook.Tire();
	
	SnowTire st = new SnowTire();
	
	
	
	
}
