package transport;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startDrive() {
        System.out.println("Начать движение грузовику: " + getBrand() + " " + getModel());

    }

    @Override
    public void stopDrive() {
        System.out.println("Остановится грузовику: " + getBrand() + " " + getModel());
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовику " + getBrand() + " " + getModel() + " пора заехать на Пит стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга грузовик: " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика: ");
    }


}
