package ex_system;

public class InExample {
    public static void main(String[] args) throws Exception {
        int speed = 0;
        int keyCode = 0;

        while(true) {
            System.out.println("-----------------");
            System.out.println("1. 증속  | 2. 감속 | 3. 중지");
            System.out.println("-----------------");
            System.out.println("현재 속도 = " + speed);
            System.out.print("선택: ");

            keyCode = System.in.read();  // ★ while문 안에서 입력 받기

            if(keyCode == 49) {       // '1'
                speed++;
            } else if(keyCode == 50) { // '2'
                speed--;
            } else if(keyCode == 51) { // '3'
                break;
            }

            // 버퍼에 남아있는 '\n' 제거
            System.in.read();
        }

        System.out.println("프로그램 종료");
    }
}