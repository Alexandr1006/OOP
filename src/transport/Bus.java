package transport;

public class Bus extends Transport implements Competing {

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

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
    public void printType(){
        System.out.println("вместимость " + capacity);
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
