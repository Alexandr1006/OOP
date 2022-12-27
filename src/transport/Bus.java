package transport;

public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startDrive() {
        System.out.println("Начать движение автобуса: " + getBrand() + " " + getModel());

    }

    @Override
    public void stopDrive() {
        System.out.println("Остановится автобуса: " + getBrand() + " " + getModel());
    }

    @Override
    public void pitStop() {
        System.out.println("Автобусу " + getBrand() + " " + getModel() + " пора заехать на Пит стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга автобус: " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса: ");
    }


}
