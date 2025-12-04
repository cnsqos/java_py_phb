package overriding;

public class Calculator2 {

	public int getResult(int n1, int n2) {
		return -1;
	}
}

class CalPlus extends Calculator2{
	
	@Override
	public int getResult(int n1, int n2) {
		return n1+n2;
	}
}

class CalMinus extends Calculator2{
	
	@Override
	public int getResult(int n1, int n2) {
		return n1 - n2;
	}
}
