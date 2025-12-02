package inner_class;

//정적 내부 클래스를 활용하는 1순위
//빌더 패턴의 구현
public class User {
	//유저의 필드(이름,이메일,나이)
	private final String username;
	private final String email;
	private final int age;
	
	//User의 생성자 Private접근제한자라 외부에서 호출이 불가능하다.
	private User(Builder builder) {
		this.username = builder.username;
		this.email = builder.email;
		this.age = builder.age;
	}
	
	//정적 내부 클래스 이름은 Builder
	public static class Builder{
		private String username;
		private String email;
		private int age;
		
		
		//이름을 전달 받아서 Builder클래스의 필드에 전달
		public Builder username(String username) {
			this.username = username;
			return this; //Builder 자신 객체를 반환 -> 메서드를 연달아서 체이닝이 가능하다.
		}
		
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public User build() {
			return new User(this);// Builder 정보를 User 생성자로 전달
		}
			
	}
}
