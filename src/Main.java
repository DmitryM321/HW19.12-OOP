public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");   // Класс Car
        Car lada = new Car ();
        lada.brand = "Lada";
        lada.model = "Granta";
        lada.engineVolume = 1.7;
        lada.color = "желтый";
        lada.year = 2015;
        lada.country = "Россия";
        System.out.println(lada);

        Car audi = new Car ();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.engineVolume = 3.0;
        audi.color = "черный";
        audi.year = 2020;
        audi.country = "Германия";
        System.out.println(audi);

        Car kia = new Car ();
        kia.brand = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.engineVolume = 2.4;
        kia.color = "красный";
        kia.year = 2018;
        kia.country = "Южная Корея";
        System.out.println(kia);

        Car hyundai = new Car ();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolume = 1.6;
        hyundai.color = "оранжевый";
        hyundai.year = 2016;
        hyundai.country = "Южная Корея";
        System.out.println(hyundai);

        System.out.println("Задание 2/3");   // Новый класс Car2
        Car2 lada2 = new Car2 ("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car2 audi2 = new Car2 ("Audi", "null", 3.0, "черный", 2016, "Германия");
        Car2 kia2 = new Car2 ("Kia", "Sportage 4-го поколения", 2.4, "красный", 2020, "Южная Корея");
        Car2 hyundai2 = new Car2 ("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(lada2);
        System.out.println(audi2);
        System.out.println(kia2);
        System.out.println(hyundai2);
    }
}