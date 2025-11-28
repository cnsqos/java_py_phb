package polymorphism;

public class Main {
	public static void main(String[] args) {
		//자동차 객체를 만든다.
		Car myCar = new Car();
		
		//Car클래스의 필드인 tire에 Tire객체를 대입
        
        // Car 클래스의 필드 tire에 Tire 객체를 대입
        myCar.tire = new Tire();
        myCar.run();
        
        
        //HankookTire 객체를 대입
        myCar.tire = new HankookTire();
        myCar.run();
        
        //KumhoTire 객체를 대입
        myCar.tire = new KumhoTire();
        myCar.run();
        
        
        Driver driver = new Driver();
        
        Bus bus = new Bus();
        driver.drive(bus); 
        driver.drive(new Bus());
        
        
        Taxi taxi = new Taxi();
        driver.drive(taxi);
        driver.drive(new Taxi());
        
        
//    	Main클래스 만든다.
//    	길이가 3인 Animal타입의 배열 zoo를 만든다.
//    	0번에는 Animal 객체
//    	1번에는 Dog객체
//    	2번에는 Cat객체를 넣는다.
    //
//    	for문을 돌면서 sound()를 모두 호출한다.
        
        
        Animal[] zoo = {new Animal(), new Dog(), new Cat()};
        
        for (Animal a : zoo) {
            a.sound();
        }
        
        
        AnimalTrainer trainer = new AnimalTrainer(); 
        
        trainer.train(new Dog());
        trainer.train(new Cat());
        
        
    }        
}        
 
	

