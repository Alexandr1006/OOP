package transport;

public class Bus extends Transport {

    private String motorFuel;

    private String formOfPayment;

    private String busType;

    public String getMotorFuel() {
        return motorFuel;
    }

    public void setMotorFuel(String motorFuel) {
        this.motorFuel = motorFuel;
    }

    public String getFormOfPayment() {
        return formOfPayment;
    }

    public void setCashlessPayment(String cashlessPayment) {
        this.formOfPayment = cashlessPayment;
    }

    public String getBusType() {
        return busType;
    }


    @Override
    public String toString() {
        return getBrand() + getModel() + getYear() + " года выпуска, сборка в " + getCountry() + getColor() + " цвета, максимальная скорость — " +
                getMaxSpeed() + " км/ч " + " Тип моторного топлива " + getMotorFuel() + " Форма оплаты " + getFormOfPayment() +
                " Тип автобуса " + getBusType();
    }

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, String motorFuel, String formOfPayment, String busType) {
        super(brand, model, year, country, color, maxSpeed);
        if (motorFuel.isEmpty() || motorFuel == null || motorFuel.isBlank()) {
            this.motorFuel = "default";
        }else
        this.motorFuel = motorFuel;
        if (formOfPayment.isEmpty() || formOfPayment == null || formOfPayment.isBlank()) {
            this.formOfPayment = "Наличные";
        }else
        this.formOfPayment = formOfPayment;
        this.busType = busType;

    }
}
