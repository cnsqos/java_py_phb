package ex_abstract;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		//추상화 언제 하냐?
		//공통된 속성과 메서드가 있고, 일부 동작만 다를 때
		//반드시 구현해야 하는 메서드를 강제하고 싶을 때
		//큰 흐름은 부모에서 정하고, 세부 단계만 자식에게 맡길 때
		
		//GoodCalc의 객체 생성하기
		int[] a = {1,2,3,4,5};
		
		Calculator calc = new GoodCalc();
		
		System.out.printf("합 : %d\n",calc.add(1, 2));
		System.out.printf("차 : %d\n",calc.sub(20, 10));
		System.out.printf("평균 : %.2f\n",calc.average(a));
	}
	

	
	
	
	
	
	
	
	
}
