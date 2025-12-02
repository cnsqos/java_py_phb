package generics;

public class DataMain {
	public static void main(String[] args) {
		//객체를 만드는 시점에 타입을 결정을 한다.
		//제네릭 타입은 기본자료형을 인식하지 않는다.
		//int,double 등의 기본 자료형을 제네릭 타입으로 이용하고자 할 때는
		//int, double등의ㅣ
		DataList<Integer> list = new DataList<>();
		//기본생성자가 호출되면서 길이가 10인 배열 생성
		
		list.add(10);
		
		list.add("문자열"); 
		
		list.add(3.14);
		
		//데이터를 출력
		for(int i = 0; i < list.size(); i++) {
			Object data = list.get(i);
			
			//저장된 데이터 타입이 어떤 타입인지 검사
			if(data instanceof Integer) {
				System.out.println("정수 : " + (int)data);
			} else if(data instanceof Double) {
				System.out.println("실수 : " + (double)data);
			} else if(data instanceof String) {
				System.out.println("문자열 : " + (String)data);
			}
		}
		
		
		//저장 데이터의 타입이 Object이기 때문에 어떤 타입의 데이터라도 저장할 수 있다.
		//데이터를 사용하기 위해서는 타입변환을 위해 검사를 해야하는 번거로움이 있다.
		
	}
}
