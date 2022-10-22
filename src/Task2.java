public class Task2 {
}
 abstract class Marks {
    abstract double getAverage();
}
class A extends Marks {
    double subject1;
    double subject2;
    double subject3;

    public A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getAverage() {
        double averageA= (subject1+subject2+subject3)/3;
        return averageA;
    }
}
class B extends Marks {
    double subject1;
    double subject2;
    double subject3;
    double subject4;

    public B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4=subject4;
    }

    @Override
    double getAverage() {
        double averageB= (subject1+subject2+subject3+subject4)/4;
        return averageB;
    }
}
class Main5 {
    public static void main(String[] args) {
        A a=new A(90,85,78);
        B b=new B(85,95,100,76);

        System.out.println("The average grade of Student A is "+ a.getAverage());
        System.out.println("The average grade of Student B is "+ b.getAverage());
    }
}
