package exam;

public interface Printable {
	void print(String message);
}


//9번. 인터페이스와 다형성 – 출력 장치 (10점)
//요구사항
//
//Printable 인터페이스를 작성한다
//메서드: void print(String message)



//main 메서드에서
//Printable 타입 배열을 길이 2로 만들고
//0번: new ConsolePrinter()
//1번: new FilePrinter()
//반복문으로 "Hello" 문자열을 두 구현체에 모두 출력하게 하라