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
  
	
	Book b = new Book();
    
	
    void addBook(String title, String author) {
    		if (count >= books.length) {
            System.out.println("더 이상 책을 추가할 수 없습니다.");
            return;
    		}
    		System.out.println("책 추가: 제목 - " + title + ", 저자 - " + author);
    		count++;
    		}  

    // 책 추가 메서드
    //	배열이 꽉 찼으면 "더 이상 책을 추가할 수 없습니다." 출력

    
    
//	void printAllBooks()
//	저장된 모든 책의 정보 출력하기
   
    
//	LibraryMain
//	크기가 3인 Library 객체를 만들고 책 3권을 추가한뒤 전체 책 정보 출력하기
    void printAllBooks() {
        System.out.println("\n전체 책 정보");
        for (int i = 0; i < count; i++) {
            books[i].printInfo();
        }
    }
    
    
}
