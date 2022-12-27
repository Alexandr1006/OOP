package transport;

public class DriverD<D extends Transport & Competing> extends Driver {
    public DriverD(String fullName, boolean drivingLicenses, int experience) {
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

    public void startGo1(D Transport){
        System.out.println("Водитель " + getFullName() + " категории В начал движение и будет участвовать в заезде");
    }
    @Override
    public void startGo() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void fillTheCar() {

    }
}
