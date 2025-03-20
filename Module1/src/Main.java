/*
У нас есть 2 абстрактных класса Animals и Mammal - Животные и Млекопитающие. А так же классы с различными животными, которые могут быть как просто животными,
так и животными/млекопитающими. Классы животных реализуют методы из интерфейсов (живёт в воде, имеет шерсть, имеет позвоночник) и реализуют каждый свою функцию display()
для вывода информации на экран
 */
abstract class Animals {
    //Класс животных
    private String isAnimal;
    public String getIsAnimal() {return isAnimal;}
    public Animals(String isAnimal)
    {
        this.isAnimal = isAnimal;
    }
    public abstract void display();
}
 abstract class Mammal extends Animals{
    private String isMammal;
    public String getIsMammal() {return isMammal;}
    public Mammal(String isMammal, String isAnimal)
    {
        super(isAnimal);
        this.isMammal = isMammal;
    }
    public abstract void display();
}
class Fish extends Animals implements liveInWater, hasSpine{
    public String whoIs = "Рыба";
    public Fish()
    {
        super("Это животное");
    }
    public void liveInWaterMethod()
    {
        System.out.println("Рыба живёт в воде");
    }
    public void hasSpineMethod()
    {
        System.out.println("Позвоночник рыб состоит из отдельных, несращённых позвонков");
    }
    public void display()
    {
        System.out.println(this.whoIs);
        System.out.println(super.getIsAnimal());
        liveInWaterMethod();
        hasSpineMethod();
    }
}
class Whale extends Mammal implements liveInWater, hasSpine{
    private String whoIs = "Кит";
    public Whale()
    {
        super("Это млекопитающее", "Это животное, ");
    }
    public void liveInWaterMethod()
    {
        System.out.println("Кит живёт в воде");
    }
    public void hasSpineMethod()
    {
        System.out.println("Скелет у китообразных губчатый. В позвоночнике от 41 до 98 позвонков, образующих 4 отдела");
    }
    public void display()
    {
        System.out.println(this.whoIs);
        System.out.println(super.getIsAnimal()+super.getIsMammal());
        liveInWaterMethod();
        hasSpineMethod();
    }
}
class Cat extends Mammal implements hasWool, hasSpine{
    public Cat()
    {
        super("Это млекопитающее","Это животное, ");
    }
    private String whoIs = "Кошка";
    public void hasWoolMethod()
    {
        System.out.println("Кошка имеет шерсть");
    }
    public void hasSpineMethod()
    {
        System.out.println("Кошка имеет позвоночник");
    }
    public void display()
    {
        System.out.println(this.whoIs);
        System.out.println(super.getIsAnimal()+super.getIsMammal());
        hasWoolMethod();
        hasSpineMethod();
    }
}
class Bear extends Mammal implements hasSpine, hasWool{
    public Bear()
    {
        super("Это млекопитающее","Это животное, ");
    }
    private String whoIs = "Медведь";
    public void hasWoolMethod()
    {
        System.out.println("Медведь имеет шерсть");
    }
    public void hasSpineMethod()
    {
        System.out.println("Медведь имеет позвоночник");
    }
    public void display()
    {
        System.out.println(this.whoIs);
        System.out.println(super.getIsAnimal()+super.getIsMammal());
        hasWoolMethod();
        hasSpineMethod();
    }
}
interface liveInWater{
    void liveInWaterMethod();
}
interface hasWool{
    void hasWoolMethod();
}
interface hasSpine{
    void hasSpineMethod();
}
public class Main {
    public static void main(String[] args) {

    Fish fish = new Fish();
    fish.display();

    Whale whale = new Whale();
    whale.display();

    Cat cat = new Cat();
    cat.display();

    Bear bear = new Bear();
    bear.display();

    Plane plane = new Plane("Это транспортное средство, ", "Самолёт");
    plane.display();

    Helicopter helicopter = new Helicopter("Это транспортное средство, ", "Вертолёт");
    helicopter.display();

    Boat boat = new Boat("Это транспортное средство, ", "Катер");
    boat.display();

    Tanker tanker = new Tanker("Это транспортное средство, ", "Танкер");
    tanker.display();

    Truck truck = new Truck("Это транспортное средство, ", "Грузовик");
    truck.display();

    Taxi taxi = new Taxi("Это транспортное средство, ", "Такси");
    taxi.display();
    }
}