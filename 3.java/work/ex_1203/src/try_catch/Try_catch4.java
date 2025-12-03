package try_catch;

public class Try_catch4 {
   //main을 호출하는 JVM이 예외처리를 한다.
   public static void main(String[] args) throws Exception {
      //예외 던지기
      //메서드 내부에서 예외가 발생했을 때 바로 처리하는 것이 아니라,
      //메서드를 호출한 쪽에서 예외를 처리하는 방법
      
      ThrowsExample t = new ThrowsExample();
      
      try {
         int result = t.divide(10, 0);
         System.out.println("결과 : " + result);
      } catch (Exception e) {
         System.out.println("0으로 나눌 수 없습니다.");
      }
      
      try {
         //강제로 예외 발생시키기
         while(true) {
            System.out.println("숫자를 입력하세요 : ");
            int val = sc.nextInt();
            
            if(val == -1) {
               break;
            }
            
            if(val < 0 || val > 50) {
               throw new Exception("숫자의 허용 범위가 아닙니다.");
            }
         }
      } catch (Exception e) {
         System.out.println("에러 메시지 : " + e.getMessage());
      }
      
   }
}



