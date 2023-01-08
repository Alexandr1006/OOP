package transport;

public class DriverD extends Driver<Truck> {

    public DriverD(String fullName, boolean drivingLicenses, int experience, String categoryOfRights) {
        super(fullName, drivingLicenses, experience, categoryOfRights);
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


    @Override
    public void startGo(Truck Transport) {
        System.out.println("Водитель "+ getFullName() + " категории" + getCategoryOfRights() + "начал движение и будет участвовать в заезде");
    }

    @Override
    public void stop() {

    }

    @Override
    public void fillTheCar() {

    }
}
