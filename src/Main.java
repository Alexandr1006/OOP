import transport.Car;

import java.security.Key;
import java.time.LocalDate;

public class Main {
    private static final int CURRENT_MONTH = LocalDate.now().getMonthValue();
    public static void main(String[] args) {
        Car lada = new Car(" ", " ", 1.7, " Желтого ", 2015, " ", "Механика", "Сидан", "Т040ВР", 5, "Зима", new Car.Key(true, false));
        Car audi = new Car("Audi ", "A8 50 L TDI quattro ", 3.0, " черного ", 0, " Германии ", "Автомат", "Универсал", "Е084РЕ", 5,"Лето", new Car.Key(true, true));
        Car bmw = new Car("BMW ", "Z8 ", 0, " черного ", 2021, " Германии ", "Механика", "Купе", "У989ХУ", 5, "Зима", new Car.Key(false, false));
        Car kia = new Car("Kia ", "Sportage 4-го поколения ", 2.4, " ", 2018, " Южной Корее ", "Автомат", "Лифтбек", "Н544ЕН", 5, "Лето", new Car.Key(false,true));
        Car hyundai = new Car("Hyundai", "Avante ", 1.6, " ораньжевого ", 2016, " Южной Корее ", "Механика", "Лимузин", "А777АА", 10, "Зима", new Car.Key(true,true));
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        audi.changeRubber(CURRENT_MONTH);

    }
}