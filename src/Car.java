public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
    public String toString() {
        return brand + " " + model + " " + year + " год выпуска, сборка в " + country + " " + color
                + " цвет, " + " объем двигателя — " + engineVolume + " л.";
    }
}



