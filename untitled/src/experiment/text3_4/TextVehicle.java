package experiment.text3_4;

abstract class Vehicle{
    protected String brand;
    protected int maxSpeed;
    Vehicle(String brand, int maxSpeed){
        this.brand=brand;
        this.maxSpeed=maxSpeed;
    }
    public void start(){
        System.out.println(brand+"启动了");
    }
    public abstract  void move();
}
class Car extends Vehicle{
    public void move(){
        System.out.println("汽车在公路上行驶");
    }
    int seat;
    public Car(String brand, int seat,int maxSpeed){
        super(brand,maxSpeed);
        this.seat=seat;
    }
    public void start(){
        super.start();
        System.out.print("汽车引擎轰鸣！");
    }
}
class Bike extends Vehicle{
    public void move(){
        System.out.println("自行车靠人力踩踏前行");
    }
    public Bike(String brand,int maxSpeed){
        super(brand,maxSpeed);
    }
}
public class TextVehicle {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota",180,5);
        Bike giant = new Bike("Giant",30);
        Vehicle vehicle1 = toyota;
        Vehicle vehicle2 = giant;
        System.out.println("Car对象");
        vehicle1.start();
        vehicle1.move();
        System.out.println("Bike对象");
        vehicle2.start();
        vehicle2.move();
    }
}
