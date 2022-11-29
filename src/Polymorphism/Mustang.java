package Polymorphism;

public class Mustang extends Ford {
    @Override
    public void fordCar() {
        System.out.println("77 lacks");
        super.fordCar(); // calling method from super class (parent)
    }
}
