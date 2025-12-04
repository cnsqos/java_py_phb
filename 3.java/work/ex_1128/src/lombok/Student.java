package lombok;

@Builder //setter메서드가 필요 없다.
//Builder라는 내부클래스를 만들고 그 안에 필드와 setter
//역할을 하는 메서드를 만든다.
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Student {

	private String name;
	private int age;
	private String phone;
	private String email;
	private String address;
	
}
