package ch16;

public class PrintGraph {
	public String print(char ch, int num) {
		char[] val = new char[num];
		String str = "";
		for(int i = 0; i < val.length; i++) {
			
			str += val[i] = ch;
		}
		return str;
	}
}
