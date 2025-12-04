package com.korea.di.di1;

import java.io.FileReader;
import java.util.Properties;

class Car{};
class SportsCar extends Car{};
class Truck extends Car{};
class Engine{};

public class Main1 {
	public static void main(String[] args) throws Exception{
		//Car 객체 만들기
		Car sprotscar = (Car)getObject("sportscar");
		Car truck = (Car)getObject("truck");
		
		System.out.println("sprotscar="+sprotscar);
		System.out.println("truck="+truck);
		
		Engine engine = (Engine)getObject("engine");
		
		System.out.println("enging="+engine);
	}
	
	//Car객체를 만들어주는 getCar()메서드
	public static Object getObject(String key) throws Exception{
		
		//Properties
		//설정파일(.properties)을 읽고 스기 위해 만들어진 클래스
		//키=값으로 이루어져있으면 된다.
		
		Properties p = new Properties();
		//config.txt를 읽어와서 p에 넣을거야.
		p.load(new FileReader("config.txt"));
		
		//p에 들어있는 내용중에 key가 car인 value를 가져와서
		//클래스 이름좀 저장해줘
		Class clazz = Class.forName(p.getProperty(key));//com.korea.di.di1.SportsCar
		
		//객체를 만들어서 반환
		return clazz.newInstance();
		
		
	}
	
	
}









