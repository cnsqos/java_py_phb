package ch16;

import java.util.Scanner;

public class TimesTable {
	//TimesTable 클래스를 만들고 showTable()메서드를 정의한다.
	//메서드에서는 구구단을 출력하는 코드를 작성한다
	//매개변수로 숫자를 전달 받는다.
	
	public void showTable() {
        Scanner sc = new Scanner(System.in);

        System.out.print("단 입력: ");
        int num = sc.nextInt();

        System.out.println(num + "단");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d ",num,i,num*i);
        	}
        }
	}


