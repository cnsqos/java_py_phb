package com.korea.di.di4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDiTest {
	public static void main(String[] args) {
		//내가 지정한 패키지를 돌면서 @Component가 붙어있는 클래스를 bean으로 만들어서 저장을 해놓고 있다.
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.korea.di.di4");
		Car car = (Car)ac.getBean("car");
		System.out.println("car="+car);
		Engine engine = (Engine)ac.getBean("engine");
		car.engine = engine;
	}
}
