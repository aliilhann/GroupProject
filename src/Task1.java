import java.util.Scanner;

public class Task1 {
}
interface Shape {

    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape {
    String shape;


    @Override
    public void calculateArea() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of the shape ");
        shape=scanner.nextLine();
        System.out.println("The area formula of " + shape + " is pi* radius* radius");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter formula of "+ shape + " is 2*pi*radius");

    }
}
class Square implements Shape {

    @Override
    public void calculateArea() {

    }

    @Override
    public void calculatePerimeter() {

    }


}
class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea();
        circle.calculatePerimeter();
    }

}