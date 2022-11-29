package String;

public class MyClass {

    String name;
    int rollno;
    static String college = "ICT";
    MyClass(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    void display (){
        System.out.println(rollno + " "+ name + "  " + college );
    }
    public static class School{
        public static void main(String[] args) {
            MyClass obj1 = new MyClass("Jojo",227);
            MyClass obj2 = new MyClass("Sukura" , 765);
            obj1.display();
            obj2.display();


        }
    }
}