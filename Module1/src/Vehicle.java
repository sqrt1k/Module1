/*
У нас имеется абстрактный класс Vehicle - транспортные средства, его наследуют все транспортные средства, а так же они используют переменные из необходимых интерфейсов
 */
public abstract class Vehicle {
    String isVehicle;
    public Vehicle(String isVehicle)
    {
        this.isVehicle = isVehicle;
    }
    public abstract void display();
}
class Plane extends Vehicle implements hasWheels, hasScrew, hasWings, carriesCargo{
 private String name;
 Plane(String isVehicle, String name)
 {
     super(isVehicle);
     this.name = name;
 }
 public void display()
 {
     System.out.println(isVehicle + name);
     System.out.println(hasWheels+" "+hasScrew+" "+hasWings+" "+carriesCargo);
 }
}
class Helicopter extends Vehicle implements hasWheels, hasScrew, carriesCargo{
    private String name;
    Helicopter(String isVehicle, String name)
    {
        super(isVehicle);
        this.name = name;
    }
    public void display()
    {
        System.out.println(isVehicle + name);
        System.out.println(hasWheels+" "+hasScrew+" "+carriesCargo);
    }
}
class Boat extends Vehicle implements hasScrew, carriesCargo{
    Boat(String isVehicle, String name)
    {
        super(isVehicle);
        this.name = name;
    }
    public void display()
    {
        System.out.println(isVehicle + name);
        System.out.println(hasScrew+" "+carriesCargo);
    }
    private String name;
}
class Tanker extends Vehicle implements hasScrew, carriesCargo{
    private String name;
    Tanker(String isVehicle, String name)
    {
        super(isVehicle);
        this.name = name;
    }
    public void display()
    {
        System.out.println(isVehicle + name);
        System.out.println(hasScrew+" "+carriesCargo);
    }
}
class Truck extends Vehicle implements hasWheels, carriesCargo{
    private String name;
    Truck(String isVehicle, String name)
    {
        super(isVehicle);
        this.name = name;
    }
    public void display()
    {
        System.out.println(isVehicle + name);
        System.out.println(hasWheels+" "+carriesCargo);
    }
}
class Taxi extends Vehicle implements hasWheels{
    private String name;
    Taxi(String isVehicle, String name)
    {
        super(isVehicle);
        this.name = name;
    }
    public void display()
    {
        System.out.println(isVehicle + name);
        System.out.println(hasWheels);
    }
}
interface hasWheels{
    String hasWheels = "Имеет колёса";
}
interface hasScrew{
    String hasScrew = "Имеет винт";
}
interface hasWings{
    String hasWings = "Имеет крылья";
}
interface carriesCargo{
    String carriesCargo = "Возит грузы";
}