import transport.*;


public class Main {


    public static void main(String[] args) {
        Car lada = new Car("Lada", "Vesta Sport", 2.0);
        Car audi = new Car("Audi", "R8", 2.4);
        Car bmw = new Car("BMW", "X6", 3.5);
        Car kia = new Car("KIA", "RIO", 2.8);
        Bus mercedes = new Bus("Mercedes", "E-20", 5.5);
        Bus kamaz = new Bus("Kamaz", "F-1", 6.3);
        Bus hyundai = new Bus("Hyundai", "Н-12", 6.0);
        Bus man = new Bus("MAN", "L-1000", 8.8);
        Truck volvo = new Truck("Volvo", "Z-300", 11.0);
        Truck vaz = new Truck("Vaz", "У2", 9.7);
        Truck reno = new Truck("Reno", "2XL", 10.6);
        Truck lexus = new Truck("Lexus", "DVD10", 12.0);
        Driver<Car> alex = new DriverB("Alex", true, 10);
        alex.startGo(audi);
        Driver<Bus> ivan = new DriverC("ivan", true, 8);
        Driver<Truck> vova = new DriverD("Vova", true, 5);
        vova.startGo(vaz);
        ivan.startGo(kamaz);
        System.out.println(lada);
        lada.startDrive();
        lada.pitStop();
        lada.bestLapTime();
        lada.maxSpeed();
        lada.stopDrive();
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println("=====");
        System.out.println(mercedes);
        mercedes.startDrive();
        mercedes.pitStop();
        mercedes.bestLapTime();
        mercedes.stopDrive();
        mercedes.maxSpeed();
        System.out.println(kamaz);
        System.out.println(hyundai);
        System.out.println(man);
        System.out.println("=====");
        System.out.println(volvo);
        volvo.startDrive();
        volvo.pitStop();
        volvo.bestLapTime();
        volvo.stopDrive();
        volvo.maxSpeed();
        System.out.println(vaz);
        System.out.println(reno);
        System.out.println(lexus);


    }
}