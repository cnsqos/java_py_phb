package exam;

public class Main {
    public static void main(String[] args) {

      //1
        Student s = new Student("홍길동", 20, "컴퓨터공학");
        s.printInfo();

      //2 
        Calculator c = new Calculator();
        System.out.println(c.add(7, 3));
        System.out.println(c.subtract(7, 3));
        System.out.println(c.multiply(7, 3));
        System.out.println(c.divide(7, 3));

      //3 
        Point p1 = new Point(3, 5);
        p1.printPoint();
        

       //4
        Printer p = new Printer();
        p.print("Hello");
        p.print(10);
        p.print(3.14);

        //5
        
        
        Student2 stu = new Student2("홍길동", 20, "컴퓨터공학");
        stu.introduce();

        //6
        
        Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Cat();
  
        
        
        //7
        
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(4, 5);
        shapes[1] = new Circle(3);
  

        
        //8
        
        Movable m = new Car(0, 0);
        m.move(10, 20);
        
        

        //9
        Printable[] printers = new Printable[2];
        printers[0] = new ConsolePrinter();
        printers[1] = new FilePrinter();


        //10
        SavingsAccount sa = new SavingsAccount("이름",100000);
        sa.withdraw(30000);
        sa.withdraw(80000);
        System.out.println("최종 잔액: " + sa.balance);


        
    }
    

}
