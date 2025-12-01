package inner_class;

public class Button {
	interface OnClickListener{
		void onClick();
	}
	
	void setOnClickListener(OnClickListener listener) {
		listener.onClick();
	}
	
	//main 클래스에서 button객체 만들기
	//setOnClickListener()에 익명 클래스 객체를 전달해서 "버튼이 클릭되었습니다!"를 출력하세요
	
	
}
