package ex_interface;

//인터페이스는 다중 구현이 가능하다.
//모든 인터페이스의 추상메서드를 구현해야 한다.
public class ReportService implements Printable, Exportable{

	@Override
	public void export() {
		System.out.println("리포트를 파일로 내보낸다.");
	}

	@Override
	public void print() {
		System.out.println("리포트를 출력한다.");
	}

}
