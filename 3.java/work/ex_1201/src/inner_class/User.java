package inner_class;

public class User {
//빌더 패턴의 구현
	//유저의 필드
	private final String username;
	private final String email;
	private final int age;
	
	
	
	//private 접근제한자라 외부에서 호출이 안됨.
	private User(Builder builder) {
		this.username = builder.username;
		this.email = builder.email;
		this.age = builder.age;
	}
	
	//정적 내부 클래스 이름은 builder
	public static class Builder{
		private String username;
		private String email;
		private int age;
	
		
		public Builder username(String username) {
			this.username = username;
			return this;
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
			return new User(this); // Builder 정보를 User 생성자로 전달
		}
	}	
}
