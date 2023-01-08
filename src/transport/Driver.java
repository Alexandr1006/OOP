package transport;

import java.util.Objects;

public abstract class Driver<T extends Transport & Competing> {

    private String fullName;
    private boolean drivingLicenses;
    private int experience;
    private String categoryOfRights;

    public String getFullName() {
        return fullName;
    }

    public boolean isDrivingLicenses() {
        return drivingLicenses;
    }

    public void setDrivingLicenses(boolean drivingLicenses) {
        this.drivingLicenses = drivingLicenses;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getCategoryOfRights() {
        return categoryOfRights;
    }

    public void setCategoryOfRights(String categoryOfRights) {
        if (categoryOfRights == null || categoryOfRights.isEmpty()) {
            try {
                throw new DriversCategoryException("Необходимо указать тип прав: " + getFullName());
            } catch (DriversCategoryException e) {
                System.out.println(e.getMessage());
            }
        } else if (categoryOfRights.equals("B") || categoryOfRights.equals("C") || categoryOfRights.equals("D")) {
                this.categoryOfRights = categoryOfRights;
        } else {
                try {
                    throw new DriversCategoryException("Необходимо указать тип прав: " + getFullName());
                } catch (DriversCategoryException e) {
                    System.out.println(e.getMessage());
                }
            }
        }


    public Driver(String fullName, boolean drivingLicenses, int experience, String categoryOfRights){
            if (fullName == null || fullName.isEmpty()) {
                this.fullName = "Ivanov Ivan Ivanovich";
            } else{
                this.fullName = fullName;}
            this.drivingLicenses = drivingLicenses;
            if (experience < 0) {
                this.experience = 0;
            } else{
                this.experience = experience;}
        setCategoryOfRights(categoryOfRights);
        }

        @Override
        public String toString () {
            return "Водитель" + fullName + "Имеет водительское удостоверение " + drivingLicenses +
                    "стаж" + experience + "категория прав " + categoryOfRights;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return drivingLicenses == driver.drivingLicenses && experience == driver.experience && Objects.equals(fullName, driver.fullName) && Objects.equals(categoryOfRights, driver.categoryOfRights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, drivingLicenses, experience, categoryOfRights);
    }

    public abstract void startGo (T Transport);
        public abstract void stop ();
        public abstract void fillTheCar ();


    }
