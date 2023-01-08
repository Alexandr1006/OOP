package transport;

public class DriverC extends Driver<Bus> {


    public DriverC(String fullName, boolean drivingLicenses, int experience, String categoryOfRights) {
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
    public void startGo(Bus transport) {
        System.out.println("Водитель "+ getFullName() + " категории" + getCategoryOfRights() + "начал движение и будет участвовать в заезде");
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
