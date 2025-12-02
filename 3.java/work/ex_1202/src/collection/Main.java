package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      //Student 객체를 list에 저장할 수 있다.
      ArrayList<Student> list = new ArrayList<>();
      
      list.add(new Student("홍길동",90));
      list.add(new Student("김철수",75));
      list.add(new Student("이영희",88));
      
      for(Student s : list) {
         System.out.println(s.name + " " + s.score);
      }
      
      
      
      //가장 높은 점수를 받은 학생의 이름과 점수 출력하기
      
      
     Student top = list.get(0);
     
     for(Student s : list) {
    	 if(s.score > top.score) {
    		 top = s;
    	 }
     }
   
     System.out.println("이름 : " + top.name + " " +top.score);
      
      
      
      
      
      
      
      
      
      
      
      
      
      //유저의 정보를 키보드에서 입력받아 ArrayList에 추가를 한다.
      //아이디가 생성될 때 list에 이미 아이디가 저장되어 있다면
      //아이디가 중복됩니다 출력하고 다시 입력받기
      ArrayList<UserInfo> users = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      outer:while(true) {
         //아이디 입력
         System.out.print("아이디 생성 : ");
         UserInfo ui = new UserInfo();
         ui.setId(sc.next());
         
         //검증
         for(int i = 0; i < users.size(); i++) {
            if(ui.getId().equals(users.get(i).getId())) {
               System.out.println("아이디가 중복됩니다.");
               continue outer;
            }
         }
         //비밀번호 입력
         System.out.print("패스워드 입력 : ");
         ui.setPwd(sc.nextInt());
         
         //리스트에 추가
         users.add(ui);
         
         for(int i = 0; i< users.size(); i++) {
            System.out.println(users.get(i).getId());
            System.out.println(users.get(i).getPwd());
            System.out.println("---------------------");
         }
         
         if(users.size()==3) {
            break;
         }
      }
      
      
   }
}