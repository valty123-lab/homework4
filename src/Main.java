public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача 1.
        int clientIOs= 0;
        if (clientIOs==0) {
            System.out.println("Установи версию приложения для Ios");
        } else {
            System.out.println("Установи версию приложения для Андроид");

        }



        int clientOs = 1;
        int clientDeviceYear = 2015;
        if (clientOs == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установи облегченную версию для Андроид по ссылке");
            if (clientOs == 1 && clientDeviceYear > 2015) {
                System.out.println("Установи обычную версию для Андроид");
            }
        } else if (clientOs < 1 && clientDeviceYear <= 2015) {
            System.out.println("Установи облегченную версию приложеия для IOS");
            if (clientOs < 1 && clientDeviceYear > 2015) {
                System.out.println("Установи обычную версию для IoS");
            }
        }

        //Задача3.
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + "год не является высокосным");

        }

        //Задача 4.
        int deliveryDistance = 95;
        int deliveryDays = 1;
        boolean oneDay = deliveryDistance < 20;
        boolean twoDay = deliveryDistance >= 20 && deliveryDistance < 60;
        boolean threeDay = deliveryDistance < 100 && deliveryDistance >= 60;

        if (oneDay) {deliveryDays = 1;}
        else if (twoDay) {deliveryDays = 2;}
        else if (threeDay) {deliveryDays = 3;}

        if (oneDay) {
            System.out.println("Потребуется дней: " + deliveryDays);}
        else if (twoDay) {
            System.out.println("Потребуется дней: " + deliveryDays);}
        else if (threeDay) {
            System.out.println("Потребуется дней: " + deliveryDays);}
        else {
            System.out.println("Доставки нет");}



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
                season = "несуществующий месяц";}

                System.out.println("Декабрь - это " + season);




        }
    }