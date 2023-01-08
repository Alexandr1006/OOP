import transport.*;


public class Main {


    public static void main(String[] args) {
        Car lada = new Car("Lada", "Vesta Sport", 2.0, BodyType.TYP_SED);
        Car audi = new Car("Audi", "R8", 2.4, BodyType.TYP_CUP);
        Car bmw = new Car("BMW", "X6", 3.5, BodyType.TYP_HATCH);
        Car kia = new Car("KIA", "RIO", 2.8, BodyType.TYP_HATCH);
        Bus mercedes = new Bus("Mercedes", "E-20", 5.5, Capacity.ESPECIALLY_SMALL);
        Bus kamaz = new Bus("Kamaz", "F-1", 6.3, Capacity.SMALL);
        Bus hyundai = new Bus("Hyundai", "Н-12", 6.0, Capacity.MEDIUM);
        Bus man = new Bus("MAN", "L-1000", 8.8, Capacity.BIG);
        Truck volvo = new Truck("Volvo", "Z-300", 11.0, Carrying.N1);
        Truck vaz = new Truck("Vaz", "У2", 9.7,Carrying.N2);
        Truck reno = new Truck("Reno", "2XL", 10.6, Carrying.N3);
        Truck lexus = new Truck("Lexus", "DVD10", 12.0, Carrying.N1);
        Driver<Car> alex = new DriverB("Alex", true, 10,"B");
        Driver<Bus> ivan = new DriverC("ivan", true, 8, "D");
        Driver<Truck> vova = new DriverD("Vova", true, 5, "C");
        lada.printType();
        vaz.printType();
        hyundai.printType();
        mercedes.printType();
        alex.startGo(audi);
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
        mercedes.diagnostics();

    }
}