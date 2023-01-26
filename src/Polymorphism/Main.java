package Polymorphism;

public class Main {
    public static void main(String[] args) {

        Ford ford = new Ford(); //creating parent object
        Ford mustang = new Mustang(); //creating child object
        Mustang mustang1 = new Mustang();
//        mustang1.fordCar(); // making obj of a child class & calling its obj
        Ford endeavour = new Endeavour();
//        Endeavour endeavour1 = (Endeavour) new Ford();// error Statement : "Exception in thread "main" java.lang.ClassCastException:
        // class Polymorphism.Ford cannot be cast to class Polymorphism.Endeavour (Polymorphism.Ford and Polymorphism.
        // Endeavour are in unnamed module of loader 'app')
       // at Polymorphism.Main.main(Main.java:10)"
//        endeavour1.fordCar();
//        ford.fordCar();
//        mustang.fordCar();
//        endeavour.fordCar();

    }

}
