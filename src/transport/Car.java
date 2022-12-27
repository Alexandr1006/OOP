package transport;

import java.time.LocalDate;

public class Car extends Transport implements Competing {


    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startDrive() {
        System.out.println("Начать движение машине: " + getBrand() + " " + getModel());
    }

    @Override
    public void stopDrive() {
        System.out.println("Остановится машине: " + getBrand() + " " + getModel());
    }

    @Override
    public void pitStop() {
        System.out.println("Машине " + getBrand() + " " + getModel() + " пора заехать на Пит стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга автомобиль: " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автомобиля: ");
    }


}



