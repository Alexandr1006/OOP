package transport;

import java.time.LocalDate;

public class Car extends Transport {
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
        return getBrand() + getModel() + getYear() + " года выпуска, сборка в " + getCountry() + getColor() + " цвета, объем двигателя — " +
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


    private double engineVolume;
    private String transmission;
    private final String typeBody;
    private String registrationNumber;
    private final int numberOfSeats;
    private String rubber;
    private final Key key;



    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
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

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String typeBody, String registrationNumber, int numberOfSeats, String rubber, Key key, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else
            this.engineVolume = engineVolume;
        this.transmission = transmission;
        if (typeBody == null ) {
            this.typeBody = "Седан";
        }else
        this.typeBody = typeBody;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        if (rubber.isEmpty() || rubber == null || rubber.isBlank()){
            this.rubber = "default";
        }else
        this.rubber = rubber;
        this.key = new Key(key.remoteStart, key.keylessEntry);

    }
}



