package ch01;

public class Casting {
	public static void main(String[] args) {
		//자동 타입 변환 (암시적 형변환)
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		//문자형을 정수로 바꾼다.
		char charValue = '가';
		intValue = charValue;//문자는 유니코드로 바뀌어서 대입된다.
		System.out.println("intValue : " + intValue);
		
		char charValue2 = 'A';
		intValue = charValue2;//알파벳은 아스키코드로 대입된다.
		System.out.println("intValue : " + intValue);
		
		//강제형변환 (명시적 형변환)
		//(원하는 자료형)데이터 or 변수;
		
		//큰 자료형 -> 작은 자료형으로 바꿀 때 
		int i1 = 10; //4byte
		byte b1 = (byte)i1; //1byte
		
		long l1 = 300l;
		int i2 = (int)l1;
		
		//정수 -> 문자로 바꿀 때
		
		int i3 = 65;
		char c2 = (char)i3;
		
		System.out.println("c2 : " + c2);
		
		//실수 -> 정수
		//실수에서 정수로 변환 할 때 소수점 아래는 없어진다.
		double d1 = 3.141592;
		int i4 = (int)d1;
		System.out.println("i4 : " + i4);
		
		//연산식에서 자동 타입변환
		//자바는 실행 성능을 향상시키기 위해 컴파일 단계에서 연산을 수행한다.
		//-128 ~ 127
		byte b2 = 10;
		byte b3 = 20;
		byte result1 = 10 + 20;// O
		//byte result2= b2 + b3; // X
		//정수 타입의 변수가 산술 연산에서 피연산자로 사용되면
		//int 타입보다 작은 타입의 변수는 int타입으로 자동 
		//타입 변환되어 연산을 수행한다.
		
		//산술연산
		//자바는 타입이 다른 값들끼리 산술연산을 할 때 효율적으로
		//값의 피해없이 연산을 하고싶어 한다.
		
		byte b4 = 10;
		int i5 = 100;
		long l2 = 1000l;
		long result3 = b4 + i5 + l2;//long타입으로 변환 후 연산
		
		int i6 = 10;
		double result5 = i6 / 4.0; //i6가 double타입으로 변환 후 연산
		
		//피연산자 중 하나가 문자열일 경우 나머지 피연산자도 자동으로 변환되어
		//문자열 결합 연산을 수행한다.
		String str = "3" + 7; // -> "3" + "7" -> "37"
		
		//문자열을 기본 타입으로 변환하는 방법
		String s = "10";
		//byte로 바꾸기
		byte v = Byte.parseByte(s);
		//short으로 바꾸기
		short v2 = Short.parseShort(s);
		//int로 바꾸기
		int v3 = Integer.parseInt(s);
		
		
		
		
		
	}
}
