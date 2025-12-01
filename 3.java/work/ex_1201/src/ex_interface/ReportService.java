package ex_interface;

//인터페이스는 

public class ReportService implements Printtable, Exportable{

	public void export() {
		System.out.println("리포트를 파일로 내보낸다.");
	}
	
	
	public void print() {
		System.out.println("프린트를 파일로 내보낸다.");
	}
	
	
}
