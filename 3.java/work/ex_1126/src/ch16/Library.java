package ch16;

//자바에서 도서관을 정의하려고 만든 클래스
public class Library {
	//필드
	//여러권의 책을 저장하기 위한 배열
	Book[] books;//참조변수의 선언
	int count;//현재 저장된 책 수
	
	//생성자
	//배열의 크기를 받아서 배열을 생성하고, count를 0으로 초기화해라
	public Library(int size) {
		books = new Book[size];
		count = 0;
	}
	
	//메서드
	//책을 도서관에 추가하는 메서드
	public void addBook(String title, String author) {
		//books배열이 가득차면 추가하면 안된다.
		if(count == books.length) {
			System.out.println("더 이상 책을 추가할 수 없습니다");
			return;//함수가 더이상 진행되지 못하게 빠져나간다.
		}
		
		//1. book 객체를 생성한다.
		//[ 0    1    2 ]
		Book book = new Book(title,author);
		books[count] = book;
		System.out.println("책 추가 : 제목 - "+title+", 저자 - "+author);
		count++;//배열의 다음 인덱스로 이동
	}
	
	public void printBooks() {
		if(count == 0) {
			System.out.println("등록된 책이 없습니다.");
			return;
		}
		System.out.println("==도서 목록==");
		//[new Book("홍길동전","허균"), new Book("노인과바다","허밍웨이"), new Book("연금술사","파울로 코엘료")]
		for(Book book : books) {
			//객체를 하나씩 꺼내게됨
			book.printInfo();//Book 클래스의 printInfo()메서드를 사용
		}
	}
}








