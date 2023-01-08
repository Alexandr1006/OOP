package transport;

public class DriverB extends Driver<Car> {



    public DriverB(String fullName, boolean drivingLicenses, int experience, String categoryOfRights) {
        super(fullName, drivingLicenses, experience, categoryOfRights);
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
        public void startGo(Car transport) {
            System.out.println("Водитель "+ getFullName() + " Категория прав " + getCategoryOfRights() + " начал движение и будет участвовать в заезде");
        }

        @Override
        public void stop () {
            System.out.println("Водитель категории B останавливается");
        }

        @Override
        public void fillTheCar () {
            System.out.println("Водитель категории B заправляет автомобиль");
        }

    }
