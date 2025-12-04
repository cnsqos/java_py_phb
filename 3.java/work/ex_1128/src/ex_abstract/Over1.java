package ex_abstract;

public class Over1 {
	 public static void main(String[] args) {
	        ovr a1 = new ovr1();      
	        ovr a2 = new ovr2();      
	        System.out.println(a1.sun(3, 2) + a2.sun(3, 2));
	        //출력문을 통해 나오는 값을 계산하시오.
	    }
}

class ovr {
    int sun(int x, int y) {
        return x + y;
    }
}

class ovr1 extends ovr {
	@Override
    int sun(int x, int y) {
        return x + y;
    }
}

class ovr2 extends ovr1 {
	@Override
    int sun(int x, int y) {
        return x - y + super.sun(x, y);
    }
}
