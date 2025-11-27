package ch16;

public class Library {
	
	Book[] books;
	int count;
	
//	Library클래스
//	필드
//	Book[] books : 책들을 담는 배열
//	int count : 현재 저당된 책의 수
//	생성자에서는 배열의 길을 받아 배열을 생성, count는 0으로 초기화 하기	
	
	
	public Library(int size) {
		books = new Book[size];
        this.count = 0;
    }
	
    
	
//	메서드
//	void addBook(String title, String author)
//	새로운 Book 객체를 만들어 배열에 추가한다.
//	 출력하기
// 생성자: 배열 크기를 받아 배열 생성, count는 0    
  
	
	 void addBook(String title, String author) {
	        if (count == books.length) {
	            System.out.println("더 이상 책을 추가할 수 없습니다.");
	            return; //함수가 더이상 진행되지 못하게 빠져나간다.
	        }
	        Book book = new Book(title,author);
	        books[count] = book;
	        System.out.println("책 추가: 제목 - " + title + ", 저자 - " + author);
	        count++;
	    }
	 
	 
//	 void printAllBooks()
	 
//	 저장된 모든 책의 정보 출력하기
//
//	 LibraryMain
//	 크기가 3인 Library 객체를 만들고 책 3권을 추가한뒤 전체 책 정보 출력하기
	 

	    // 전체 책 정보 출력
	    void printBooks() {
	        if(count == 0) {
	        	System.out.println("등록된 책이 없습니다.");
	        	return;
	        }
	        System.out.println("==도서 목록==");
	        //[new Book("홍길동전","허균")]
	        for(Book book : books) {
	        	book.printInfo(); // Book 클래스의 printInfo()메서드를 사용
	        }
	    }
    
}
