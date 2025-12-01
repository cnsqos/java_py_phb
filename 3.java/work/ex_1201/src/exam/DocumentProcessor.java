package exam;

public class DocumentProcessor implements Printable,Sortable {

	@Override
	public void print() {
		System.out.println("문서출력");
		
	}
	
	@Override
	public void sort() {
		System.out.println("문서정렬");
		
	}
}
