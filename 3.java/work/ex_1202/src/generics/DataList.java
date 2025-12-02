package generics;

public class DataList<T> {
	private Object [] data; //참조변수
	private int size;
	private int defaultSize = 10;
	
	public DataList() {
		data = new Object[defaultSize];
	}
	
	public DataList(int size) {
		data = new Object[size];
	}
	
	//메서드를 호출하면서 Object 타입의 value를 인자로 전달 받아//data배열에 넣는 add메서드 만들기
	
	//index를 인자로 받아서 배열에 들어있는 값을 반환해주는 get메서드 작성하기
	
	
	public void add(T value) {
		data[size++] = value;
	}
	
	public Object get(int index) {
		return (T) data[index];
	}
	
	public int size() {
		return size;
	}
	
}
