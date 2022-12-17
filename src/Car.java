public class Car {
    @Override
    public String toString() {
        return brand + model + year + " года выпуска, сборка в " + country + color + " цвета, объем двигателя — " + engineVolume + " л.";
    }

    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model,  double engineVolume, String color, int year, String country) {
        if(brand == " " || brand == null) {
            this.brand = "default";}
        else
            this.brand = brand;
        if (model == " " || model == null){
            this.model = " ";}
        else
            this.model = model;
        if(engineVolume<=0){
            this.engineVolume=1.5;}
        else
        this.engineVolume = engineVolume;
        if(color == " " || color== null){
            this.color = "Белый";}
        else
        this.color = color;
        if(year<=0){
            this.year = 2000;
        }
        else
        this.year = year;
        if(country == " " || country == null){
            this.country = "default";}
        else
        this.country = country;
    }
 }

