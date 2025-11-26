package ch16;

public class PrintGraph {
	 public void print(int[] count) {
	        for (int i = 0; i < count.length; i++) {
	            System.out.print(i + "의 갯수 : ");
	            for (int j = 0; j < count[i]; j++) {
	                System.out.print("#"); // '#'로 그래프 표시
	            }
	            System.out.println(" " + count[i]); // 실제 갯수 출력
	        }
	    }
}
