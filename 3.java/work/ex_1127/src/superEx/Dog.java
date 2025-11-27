package superEx;

public class Dog extends Animal {

	int age;
	
	public Dog(String name) {
		super(name); //->부모 생성자가 매개변수를 가지니까 생략할 수 없다.
	}

	
	public Dog(String name, int age) {
        super(name); 
        this.age = age;
    }


    
    //info()메서드를 오버라이딩해서
    //"dlfma : xx, 나이 : xx"를 출력하도록 작성해주세요
    
    @Override
    public void info() {
        System.out.println("이름 : " + name + ", 나이 : " + age);
    }
    
  
}
