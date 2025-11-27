package overriding;

public class Car {
	
	int gasolineGague;

	Car(int gasolineGague) {
		this.gasolineGague = gasolineGague;
	}

	void showCurrentGague() {
		System.out.println("잔여 가스량 : " + gasolineGague);
	}

	


//
//	Main에서 HybridWater객체를 생성하여 다음과 같은 결과 출력하기
//	잔여 가스량 : 15
//	잔여 전기량 :30
//	잔여 물의양 : 25
}
