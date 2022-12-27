package transport;

import java.util.Objects;

public abstract class Driver  {

    private String fullName;
    private boolean drivingLicenses;
    private int experience;

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

    public Driver(String fullName, boolean drivingLicenses, int experience) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Ivanov Ivan Ivanovich";}else
            this.fullName = fullName;
            this.drivingLicenses = drivingLicenses;
            if(experience < 0){
                this.experience = 0;
            }else
            this.experience = experience;
        }

    @Override
    public String toString() {
        return "Водитель" + fullName + "Имеет водительское удостоверение " + drivingLicenses +
                "стаж" + experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return drivingLicenses == driver.drivingLicenses && experience == driver.experience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, drivingLicenses, experience);
    }

    public abstract void startGo ();
        public abstract void stop ();
        public abstract void fillTheCar ();



}
