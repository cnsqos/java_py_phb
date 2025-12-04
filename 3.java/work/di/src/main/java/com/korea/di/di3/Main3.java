package com.korea.di.di3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.google.common.reflect.ClassPath;

//객체 자동 등록하기
//ComponentScaning
//클래스 위에 @Component 어노테이션을 붙이고, 컴포넌트 어노테이션이
//붙어있는 클래스를 찾아서 객체로 만들어서 Map에 저장하는 기법

//@Component class Car{};
//@Component class SportsCar extends Car{};
//@Component class Truck extends Car{};
//@Component class Engine{};

//객체들을 저장하는 보관소가 될것이다.
//class AppContext{
//	
//	Map map;
//	
//	public AppContext() {
//		map = new HashMap();
//		doComponentScan();
//	}
//	
//	private void doComponentScan() {
//		//1. 패키지내의 클래스 목록을 가져온다.
//		//2. 반복문으로 클래스를 하나씩 읽어서 @Component가 붙어있는지 확인
//		//3. 붙어있다면 객체를 생성해서 Map에 저장한다.
//		
//		try {
//			//클래스 로더는 JVM에서 클래스를 동적으로 로드하고,
//			//어플리케이션이 사용할 수 있도록 메모리에 적재하는 역할
//			//클래스명.class : 클래스 자체를 나타내는 객체
//			ClassLoader classLoader = AppContext.class.getClassLoader();
//			
//			//지정된 클래스로더에서 클래스 경로를 읽는다.
//			//구아바에서 제공하는 기능으로 클래스 경로상의 모든 클래스를 탐색하고 사용할 수 있게
//			//해준다.
//			ClassPath classPath = ClassPath.from(classLoader);
//			
//			//지정한 패키지"com.korea.di.di3"내의 최상위 클래스들을 가져와서 set에 저장한다.
//			Set<ClassPath.ClassInfo> set = 
//					classPath.getTopLevelClasses("com.korea.di.di3");
//			
//			//위에서 얻은 클래스 정보를 반복문으로 처리한다.
//			//ClassInfo 객체를 실제 로드된 클래스로 변환한다.
//			//load()가 해당 클래스의 정보를 기반으로 JVM에서 해당 클래스를 로드하여
//			//Class 객체를 반환한다.
//			for(ClassPath.ClassInfo classInfo : set) {
//				Class clazz = classInfo.load();
//				
//				//해당 클래스에 @Component 어노테이션이 있는지 확인
//				Component component = (Component)clazz.getAnnotation(Component.class);
//				
//				if(component != null) {
//					//클래스의 첫글자를 소문자로 변환하여 id변수에 대입한다.
//					//스프링에서 빈을 생성할 때, 기본적으로 클래스 이름의 첫글자를 소문자로 사용한다.
//					String id = StringUtils.uncapitalize(classInfo.getSimpleName());
//					
//					map.put(id, clazz.newInstance());
//				}
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//	
//	Object getBean(String key) {
//		return map.get(key);
//	}
//	
//	
//}

public class Main3 {
	public static void main(String[] args) {
//		AppContext ac = new AppContext();
//		
//		Car car = (Car)ac.getBean("car");
//		System.out.println("car="+car);
//		
//		Engine engine = (Engine)ac.getBean("engine");
//		System.out.println("engine="+engine);
	}
}












