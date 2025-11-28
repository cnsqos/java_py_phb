package ex_abstract;

public class Main {
	public static void main(String[] args) {
		
		//GoodCalc의 객체 생성하기
		
		int[] a = {1,2,3,4,5};
	
		 GoodCalc calc = new GoodCalc();
		
		 
		 
		 System.out.printf("합 : %d\n",calc.add(1, 2));       
		 System.out.printf("차 : %d\n",calc.sub(20, 20));
		 System.out.printf("평균 : %d\n",calc.average(a));
		 
	}
}
