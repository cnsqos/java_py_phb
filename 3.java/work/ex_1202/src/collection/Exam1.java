package collection;

import java.util.ArrayList;

public class Exam1 {
    public static void main(String[] args) {
        // 정수 타입의 ArrayList 생성
        ArrayList<Integer> list = new ArrayList<>();

        // 1~30 사이 난수 10개 넣기
        for (int i = 0; i < 10; i++) {
            int temp = (int)(Math.random() * 30) + 1;
            list.add(temp);
        }



        // 짝수만 출력
        System.out.print("짝수 : ");
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }
    }
}