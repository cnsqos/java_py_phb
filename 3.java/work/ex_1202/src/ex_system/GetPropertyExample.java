package ex_system;

public class GetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		//OS별 파일 경로 다르게 처리
		//특정 OS환경에서만 기능 활성화
		//JVM 버전을 체크
		//파일 저장 위치를 사용자 환경에 따라 자동 설정
		
		
		
		
		
		
		
	}
}
