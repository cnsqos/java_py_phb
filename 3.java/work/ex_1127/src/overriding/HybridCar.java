package overriding;

public class HybridCar extends Car{
	
	
	int electricGague;

	HybridCar(int gasolineGague, int electricGague) {
        super(gasolineGague);
        this.electricGague = electricGague;
    }

  
    @Override
    void showCurrentGague() {
        super.showCurrentGague();
        System.out.println("잔여 전기량 : " + electricGague);
    }

    
    
//    HybridCar클래스
//    Car클래스를 상속
//    필드
//    int eletricGague;
//
//    생성자를 통해 필드를 초기화 한다.
//
//    메서드는 오버라이딩 하여 잔여 가솔린량과 잔여 전기량을 출력

}
