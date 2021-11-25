/*
Создать класс Транспорт
Создать подкласс Автотранспорт родительского класса Транспорт
Создать подкласс ж/д транспорт родительского класса Транспорт
Подклассы наследуют от родительского класса Транспорт следующие параметры:
макс кол-во перевозимых пассажиров (переменная maxPasseger)
макс перевозимый вес (cargoWeight)
тип двигателя (engine_Type)
макс скорость (maxSpeed)
Создать по два объекта каждого подкласса (всего четыре объекта)
Добавить условия выбора типа транспорта
1-легковой, 2-грузовой, 3-автобусы (carType)
Вывести в консоль результаты со всеми параметрами
Создан автотранспорт: Тип авто - легковой, Марка - Lada, Масса - 1300кг, Мощность двигателя - 75л.с, Перевозимый вес - 300кг, Количество пассажиров - 5, Тип двигателя - бензин, Максимальная скорость - 150км/ч
Создан автотранспорт: Тип авто - грузовой, Марка - Kamaz, Масса - 8000кг, Мощность двигателя - 250л.с, Перевозимый вес - 12000кг, Количество пассажиров - 3, Тип двигателя - дизель, Максимальная скорость - 90км/ч
Создан ж/д транспорт: Тип вагона - грузовой, Перевозимый вес - 60000кг, Количество пассажиров - 0, Максимальная скорость - 90км/ч
Создан ж/д транспорт: Тип вагона - пассижирский, Перевозимый вес - 0кг, Количество пассажиров - 60, Максимальная скорость - 120км/ч
*/

public class Transport {

    public static void main(String[] args) {
        Transport.Car lada = new Transport.Car(1, "Lada", 1300, 75, 300, 5, 1, 150);
        Transport.Car.printOut();
        Transport.Car Kamaz = new Transport.Car(2, "Kamaz", 8000, 250, 12000, 3, 2, 90);
        Transport.Car.printOut();
        Transport.Train Poluvagon = new Transport.Train(1, 60000, 0, 90);
        Transport.Train.printOut();
        Transport.Train Electrichka = new Transport.Train(2, 0, 60, 120);
        Transport.Train.printOut();
    }

    private static int maxPasseger; //макс кол-во перевозимых пассажиров
    private static int cargoWeight; //макс перевозимый вес
    private static String engine_Type; //тип двигателя
    private static int maxSpeed; //макс скорость


    public static class Car extends Transport {
        private static String car_Type;
        private static int carType; //1-легковой, 2-грузовой, 3-автобусы
        private static String carBrand; //марка авто
        private static int massCar; //масса авто
        private static int forse; //мощность (в лошадинных силах)


        public Car(int carType, String carBrand, int massCar, int forse, int cargoWeight, int maxPasseger, int engineType, int maxSpeed) {
            Car.carType = carType;
            Car.carBrand = carBrand;
            Car.massCar = massCar;
            Car.forse = forse;
            Transport.cargoWeight = cargoWeight;
            Transport.maxPasseger = maxPasseger;
            Transport.maxSpeed = maxSpeed;

            if (carType == 1) car_Type = "Тип авто - легковой";
            else if (carType == 2) car_Type = "Тип авто - грузовой";
            else if (carType == 3) car_Type = "Тип авто - автобусы";

            if (engineType == 1) engine_Type = "бензин";
            else if (engineType == 2) engine_Type = "дизель";
            else if (engineType == 3) engine_Type = "газ";
            else if (engineType == 4) engine_Type = "керосин";
        }

        public static void printOut() {
            System.out.println("Создан автотранспорт: " + car_Type + ", Марка - " + carBrand + ", Масса - " + massCar + "кг" +
                    ", Мощность двигателя - " + forse + "л.с" + ", Перевозимый вес - " + cargoWeight + "кг" +
                    ", Количество пассажиров - " + maxPasseger + ", Тип двигателя - " + engine_Type +
                    ", Максимальная скорость - " + maxSpeed + "км/ч");
        }

    }

    public static class Train extends Transport {

        private static int trainType; //тип вагона 1-грузовой, 2-пассажирский
        private static String train_Type; //тип вагона 1-грузовой, 2-пассажирский

        public Train(int trainType, int cargoWeight, int maxPasseger, int maxSpeed) {
            Train.trainType = trainType;
            Transport.cargoWeight = cargoWeight;
            Transport.maxPasseger = maxPasseger;
            Transport.maxSpeed = maxSpeed;

            if (trainType == 1) train_Type = "Тип вагона - грузовой";
            else if (trainType == 2) train_Type = "Тип вагона - пассижирский";
        }

        public static void printOut() {
            System.out.println("Создан ж/д транспорт: " + train_Type + ", Перевозимый вес - " + cargoWeight + "кг" +
                    ", Количество пассажиров - " + maxPasseger  + ", Максимальная скорость - " + maxSpeed + "км/ч");
        }
    }
}