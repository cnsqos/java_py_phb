package lombok;

@Getter // 모든 필드에 대해 getter 메서드 만들어줌
@Setter // 모든 필드에 대해 setter 메서드 만들어줌
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 필드를 매개변수로 갖는 생성자
@RequiredArgsConstructor //@NonNull, final로 지정된 필드만 매개변수로 갖는다.
@Data // getter,setter, requiredArgsConstructor를 한번에 지정해주는 어노테이션
@Builder 


public class Member {  
	
	@NonNull
	private Long id;
	
	private String name;
	private String email;

//	// 기본생성자
//
//	public Member() {
//
//	}
//
//	// 필드를 초기화 하는 생성자
//
//	public Member(Long id, String name, String email) {
//		this.id = id;
//		this.name = name;
//		this.email = email;
//	}
//
//	// getter & setter
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}

}
