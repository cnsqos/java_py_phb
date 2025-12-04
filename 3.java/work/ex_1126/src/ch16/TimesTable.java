package ch16;

public class Timestable {

	public void showTable(int dan) {
		for(int i = 1; i <10; i++) {
			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
		}
	}
}
