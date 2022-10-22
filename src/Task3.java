public class Task3 {
}
 class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    double calculateSalePrice(double vehiclePrice) {

        return vehiclePrice;
    }
}
class Sedan extends Car {
    int length;

    public Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length=length;
    }

    @Override
    double calculateSalePrice(double sedanPrice) {
        if(length>20) {
            return (sedanPrice-(sedanPrice*0.05));
        }
        else{
            return (sedanPrice-(sedanPrice*0.1));
        }
    }
}
class Truck extends Car {
    int weight;

    public Truck(double carPrice, String color, int weight) {
        super(carPrice, color);
        this.weight=weight;
    }

    @Override
    double calculateSalePrice(double truckPrice) {
        if(weight>2000) {
            return (truckPrice-(truckPrice*0.1));
        }
        else {
            return (truckPrice-(truckPrice*0.2));
        }
    }
}
class Main2 {
    public static void main(String[] args) {
        Truck truck=new Truck(20000,"black",2000);
        double newPrice=truck.calculateSalePrice(truck.carPrice);
        System.out.println("The discounted  price of the "+truck.color + " truck is "+newPrice);

        Sedan sedan=new Sedan(30000,"white",18);
        double newPrice2= sedan.calculateSalePrice(sedan.carPrice);
        System.out.println("The discounted price of the "+ sedan.color + " sedan is "+ newPrice2);

    }
}
