package transport;

public class DriverC<A extends Transport & Competing> extends Driver {

    public DriverC(String fullName, boolean drivingLicenses, int experience) {
        super(fullName, drivingLicenses, experience);
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void startGo1(A Transport) {
        System.out.println("Водитель " + getFullName() + " категории C начал движение и будет участвовать в заезде");
    }
    @Override
    public void startGo() {
        System.out.println("Водитель категории С начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории B останавливается");
    }

    @Override
    public void fillTheCar() {
        System.out.println("Водитель категории B заправляет автомобиль");
    }
}
