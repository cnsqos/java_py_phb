package ex_StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")      // 추가
                .insert(0, "ABC")   // 지정 위치에 삽입
                .delete(3, 4)       // 3~4 인덱스 사이 문자 삭제
                .toString();        // 문자열로 변환

        System.out.println(data);
    }
}
