package com.korea.di.di2;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

class Car{};
class SportsCar extends Car{};
class Truck extends Car{};
class Engine{};

//객체 컨테이너 만들기
//ApplicationContext
//객체를 저장하는 저장소
//클래스 안쪽에서 Map을 이용해서 객체를 저장한다.
class AppContext{
	Map map;
	
	public AppContext(){
		try {
			Properties p = new Properties();
			p.load(new FileReader("condig.txt"));
			
			//p에 저장된 내용을 Map에 저장을 한다.
			map = new HashMap(p);
			
			for(Object key : map.keySet()) {
				Class clazz = Class.forName((String)map.get(key));
				map.put(key, clazz.newInstance());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	Object getBean(String key) {
		return map.get(key);
	}
	
}

public class Main2 {
	public static void main(String[] args) {
		AppContext ac = new AppContext();
		
		Car car = (Car)ac.getBean("car");
		System.out.println("car="+car);
		
		Engine engine = (Engine)ac.getBean("engine");
		System.out.println("engine="+engine);
	}
}









