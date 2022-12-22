package transport;

import java.time.LocalDate;

public class Car {
    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessEntry;

        public Key(boolean remoteStart, boolean keylessEntry) {
            this.remoteStart = remoteStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }
        public Key(){
            this(false, false);
        }
    }

    @Override
    public String toString() {
        return brand + model + year + " года выпуска, сборка в " + country + color + " цвета, объем двигателя — " +
                engineVolume + " л. " + " Коробка передач " + transmission + " Тип кузова " + typeBody +
                " Регистрационный номер " + registrationNumber + " Количество мест " + numberOfSeats + " резина " +
                rubber + (getKey().isRemoteStart() ? " доступ без ключа " : " доступ с ключом ") + "," + (getKey().isKeylessEntry() ?
                " дистанционный запуск двигателя " : " классический запуск двигателя ");
    }

    public void changeRubber(int currentMonth) {

        if (LocalDate.now().getMonthValue() >= 11 || LocalDate.now().getMonthValue() <= 4) {
            System.out.println("Пора ездить на зимней резине");
        } else
            System.out.println("Пора ездить на летней резине");
    }

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String typeBody;
    private String registrationNumber;
    private final int numberOfSeats;
    public String rubber;
    private final Key key;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String isRubber() {
        return rubber;
    }

    public void setRubber(String rubber) {
        this.rubber = rubber;
    }

    public Key getKey() {
        return key;
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String typeBody, String registrationNumber, int numberOfSeats, String rubber, Key key) {
        if (brand.isEmpty() || brand == null || brand.isBlank()) {
            this.brand = "default";
        } else
            this.brand = brand;
        if (model.isEmpty() || model == null || model.isBlank()) {
            this.model = " ";
        } else
            this.model = model;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else
            this.engineVolume = engineVolume;
        if (color.isEmpty() || color == null || color.isBlank()) {
            this.color = "Белый";
        } else
            this.color = color;
        if (year <= 0) {
            this.year = 2000;
        } else
            this.year = year;
        if (country.isEmpty() || country == null || country.isBlank()) {
            this.country = "default";
        } else
            this.country = country;
        this.transmission = transmission;
        this.typeBody = typeBody;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.rubber = rubber;
        this.key = new Key(key.remoteStart, key.keylessEntry);

    }
}



