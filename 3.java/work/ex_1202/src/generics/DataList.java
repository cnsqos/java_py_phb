package generics;

//객체를 만들면서 전달받은 타입을 클래스내부로 전달
//타입 전파라고 한다.
public class DataList<T> {
	private T[] data; //참조 변수
	private int size; //필드로만들면 기본값이 0
	private int defaultSize = 10;
	
	public DataList() {
		data = (T[])new Object[defaultSize];
	}
	
	public DataList(int size) {
		data = new Object[size];
	}
	
	//메서드를 호출하면서 Object타입의 value를 인자로 전달받아
	//data배열에 넣는 add메서드 만들기
	public void add(T value) {
		data[size++] = value;
	}
	
	//index를 인자로 받아서 배열에 들어있는 값을 반환해주는 get메서드
	//작성하기
	public T get(int index) {
		return (T)data[index];
	}
	
	public int size() {
		return size;
	}
	
	
	
	
	
}







