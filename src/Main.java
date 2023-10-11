public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println(" ");
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println(" ");
        System.out.println("Задача 3");
        int year = 2021;
        if (year < 1584) {
            System.out.println("Год должен быть больше 1584.");
        } else if (year % 4 == 0) {
            System.out.println(year + " год високосный.");
        } else {
            System.out.println(year + " год не високосный.");
        }

        System.out.println(" ");
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println(" Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime++;
            System.out.println(" Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 2;
            System.out.println(" Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Свыше 100км доставки нет.");
        }

        System.out.println(" ");
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}
