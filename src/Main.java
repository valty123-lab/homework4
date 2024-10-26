public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача 1.
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установи версию приложения для Ios по ссылке");
        } else {
            System.out.println("Установи версию приложения для Андроид по ссылке");

        }


        int clientDeviceYear = 2015;
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установи облегченную версию для Ios по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установи обычную версию для Ios");
        } else if (clientOs > 0 && clientDeviceYear < 2015) {
            System.out.println("Установи облегченную версию приложеия для Андроид по ссылке");
        } else {
            System.out.println("Установи обычную версию приложеия для Андроид по ссылке");

        }


        //Задача3.
        int year = 2021;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + "год не является высокосным");

        }

        //Задача 4.
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);

        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);

        } else {
            System.out.println("Доставки нет");
        }


        //Задача5.
        int monthNumber = 12; //декабрь
        String season;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "несуществующий месяц";
        }

        System.out.println("Декабрь - это " + season);

    }

}
