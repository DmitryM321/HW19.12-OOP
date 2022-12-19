public class Car2 {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
    public Car2(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        if (brand == null || brand == "") {
            this.brand = "default";
        }
        this.model = model;
        if (model == null || model == "") {
            this.model = "default";
        }
        this.engineVolume = engineVolume;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        this.color = color;
        if (color == null || color == "") {
            this.color = "белый";
        }
        this.year = year;
        if (year <= 0) {
            this.year = 2000;
        }
        this.country = country;
        if (country == null || country == "") {
            this.country = "default";
        }
    }
    public String toString() {
        return brand + " " + model + " " + year + " год выпуска, сборка в " + country + " "
                + color + " цвет, " + " объем двигателя — " + engineVolume + " л.";
    }
}
